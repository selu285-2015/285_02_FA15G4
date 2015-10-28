package com.ruskin.project.client.widget.mapwidget;

import java.util.ArrayList;
import java.util.List;

import org.gwtopenmaps.openlayers.client.Bounds;
import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.Map;
import org.gwtopenmaps.openlayers.client.MapOptions;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Projection;
import org.gwtopenmaps.openlayers.client.Style;
import org.gwtopenmaps.openlayers.client.control.SelectFeature;
import org.gwtopenmaps.openlayers.client.control.SelectFeatureOptions;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureSelectedListener;
import org.gwtopenmaps.openlayers.client.feature.VectorFeature;
import org.gwtopenmaps.openlayers.client.geometry.Point;
import org.gwtopenmaps.openlayers.client.layer.OSM;
import org.gwtopenmaps.openlayers.client.layer.Vector;

import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.ReducedContact;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.ruskin.project.client.Main;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.shared.Const;
import com.ruskin.project.shared.QueryResult;

/** A slippy map widget designed for displaying the location of contacts.
 * 	There is one layer in this widget for displaying the
 * 	images representing contacts.  
 * <p>
 *  Other layers, including WMS layers, can be added to this widget as well.
 * </p>
 *Author: Brittney Jarreau
 */
public class PlaceMapWidget implements IsWidget {

	private final MainWidget master;	
	private final VerticalPanel decorator;
	private final Map map;
	
	private final MapOptions options;
	private final MapWidget mapWidget;
	
	private final Vector pointVectorLayer;
	
	private SelectFeatureOptions clickControlOptions;
	private SelectFeature contactControl;
	
	private Bounds bounds = new Bounds(0, 0, 180, 90);
	private final Bounds maxVisibleExtent;
	private final LonLat center;
	
	private final ListDataProvider<GWTContact> dataProvider = new ListDataProvider<GWTContact>();		
	private List<GWTContact> list = dataProvider.getList();	
	private QueryResult currentQuery;
	
	private final List<ReducedContact> MarysPoints = new ArrayList<ReducedContact>();
	private final List<ReducedContact> JohnJamesPoints = new ArrayList<ReducedContact>();
	private final List<ReducedContact> RuskinsPoints = new ArrayList<ReducedContact>();
	
	private final List<Point> MargaretsPlaces = new ArrayList<Point>();
	private final List<Point> JohnJamesPlaces = new ArrayList<Point>();
	private final List<Point> JohnsPlaces = new ArrayList<Point>();
	private final List<Point> JohnsFuturePlaces = new ArrayList<Point>();
	
	private final Projection proj;

	boolean MargaretChecked = false;
	
	public PlaceMapWidget(int width, int height, final MainWidget master) {		
		this.master = master;
		center = new LonLat(90, 45);
		
		options = new MapOptions();
		options.setNumZoomLevels(10);
		options.setProjection("ESPG: 4326");
		
		mapWidget = new MapWidget(new Integer(width).toString(), new Integer(height).toString(), options);
		OSM tempLayer = OSM.Mapnik("TempLayer");
		
		decorator = new VerticalPanel();
		decorator.setStyleName("mapDecorator");
		
		decorator.add(mapWidget);
		decorator.setStyleName("flexTableCell");
		proj = new Projection("EPSG:4326");
		
		BuildUI();
		
		map = mapWidget.getMap();	
		map.setRestrictedExtent(bounds);
		map.setMinMaxZoomLevel(1, 40);
		
		pointVectorLayer = new Vector("Point Layer");
		map.addLayer(tempLayer);
		map.addLayer(pointVectorLayer);
		
		clickControlOptions = new SelectFeatureOptions();
		contactControl = new SelectFeature(pointVectorLayer, clickControlOptions);
		map.addControl(contactControl);
		contactControl.activate();
		
		
		pointVectorLayer.addVectorFeatureSelectedListener(new VectorFeatureSelectedListener() {

			@Override
			public void onFeatureSelected(FeatureSelectedEvent eventObject) {
				master.getContactDialog().showFor(GWTContact.createGWTContact(eventObject.getVectorFeature().getAttributes().getAttributeAsString(Const.FEATURE_ATTRIBUTE_CONTACT_ID)));
			}
		});		
		
		tempLayer.setIsBaseLayer(true);
		this.zoomToBounds(bounds);
		this.setCenter(center, 1);
		maxVisibleExtent = map.getExtent();
		this.restoreStartupView();
		
	}	
	
	private void BuildUI() {
		final HorizontalPanel buttonPanel = new HorizontalPanel();
		final CheckBox Diary = new CheckBox("DiaryEntries");
		final CheckBox Ruskin = new CheckBox("Ruskin's Entries");
			
		buttonPanel.getElement().getStyle().setProperty("height", "inherit");
	
		buttonPanel.add(Diary);		
		buttonPanel.add(Ruskin);
		
		Diary.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				PlotPointDiary(event.getValue());
			}
		});
		
		Ruskin.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				PlotPointsRuskin(event.getValue());
			}
		});

		decorator.add(buttonPanel);
	}
	
	/** Sets the center of the map.
	 * 
	 * @param ll
	 */	
	public void setCenter(LonLat ll) {
		this.map.setCenter(ll);
	}	
	
	/** Sets the center of the map and zoom level.
	 * 
	 * @param ll
	 * @param zoom
	 */	
	public void setCenter(LonLat ll, int zoom) {
		this.map.setCenter(ll, zoom);
	}	
	
	/** Zooms to a specified bounding box.
	 * 
	 * @param bounds
	 */
	public void zoomToBounds(Bounds bounds) {	
		if(bounds == null){
			return;
		}
		this.map.zoomToExtent(bounds);
	}
	
	/**
	 * Prints the given {@link ReducedContact}s on this PlaceMapWidget.
	 * 
	 * @param contacts
	 *            - a list of {@link ReducedContact} objects
	 */		
	public void printContacts(List<? extends ReducedContact> contacts) {
		pointVectorLayer.destroyFeatures();
		for (ReducedContact c : contacts) {
			LonLat ll = c.getCoordinate();
			Point point = new Point(ll.lon(), ll.lat());
			Style pointStyle = new Style();		
			pointStyle.setExternalGraphic("img/red_push_pin.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			contactControl.activate(); 			
		}

		Bounds dataExtent = pointVectorLayer.getDataExtent();
		boolean outOfBounds = !maxVisibleExtent.containsBounds(dataExtent, false, true);
		if(!outOfBounds){		
			zoomToBounds(pointVectorLayer.getDataExtent());			
		}else{
			this.setCenter(center, 1);
		}
	}
	
	
	
	public void PlotPointDiary(Boolean plot) {
		if (plot == true) {
			ReducedContact c = new ReducedContact("Test Point - Mary & JohnJames", 50, 52.5);
			LonLat ll = c.getCoordinate();
			
			Point point = new Point(ll.lon(), ll.lat());
			point.transform(proj, new Projection(map.getProjection()));
			Style pointStyle = new Style();		
			
					
			pointStyle.setExternalGraphic("img/map_marker_red.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			
		
			JohnJamesPoints.add(c);
			JohnJamesPlaces.add(point);
			MarysPoints.add(c);
			MargaretsPlaces.add(point);
		}
		else {
			eraseAllContacts();
		}
	}
	public void PlotPointsRuskin (Boolean plot) {
		Style pointStyle = new Style();	
		if (plot == true) {
			ReducedContact c = new ReducedContact("John Was Here", 100, 60);
			
			LonLat ll = c.getCoordinate();
			Point point = new Point(ll.lon(), ll.lat());
			point.transform(proj, new Projection(map.getProjection()));	
			pointStyle.setExternalGraphic("img/map_marker_blue.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			
			RuskinsPoints.add(c);
			JohnsPlaces.add(point);
		}
		else {
			eraseAllContacts();	
		}
	}
	

	/** Erases all contacts from the map portion of this ContactMapWidget.
	 * 
	 */
	public void eraseAllContacts() {
		pointVectorLayer.destroyFeatures();	
		restoreStartupView();
	}

	/** Positions and centers the map as it was on startup.\
	 * 
	 */
	public void restoreStartupView(){	
//		bounds.transform(proj, new Projection(map.getProjection())); 
		this.zoomToBounds(bounds);		
		this.setCenter(center, 1);	 
	}
	
	/** Returns the layer responsible for drawing the contact images.
	 * 
	 * @return
	 */
	public Vector getVectorLayer() {
		return pointVectorLayer;
	}
	
	private final AsyncCallback<List<GWTContact>> queryCacheCallback = new AsyncCallback<List<GWTContact>>() {
		public void onFailure(Throwable caught) {
			// Show the RPC error message to the user
			System.out.print("'" + caught);
		}

		// populate table
		public void onSuccess(List<GWTContact> result) {
			
			for (GWTContact c : result) {
				getList().add(c);
				master.getMap().printContacts(result);
			}
			master.getMap().getVectorLayer().redraw();
		}
	};
	
	public void doCacheCallback() {
		Main.getContactServices().queryCache(currentQuery.getQueryId(),
				currentQuery.getHitRange(), queryCacheCallback);
	}
	
	public List<GWTContact> getList() {
		return list;
	}

	public void setList(List<GWTContact> newList){
		list = newList;
	}

	public ListDataProvider<GWTContact> getDataProvider() {
		return dataProvider;
	}

	@Override
	public Widget asWidget() {
		return decorator;
	}
}



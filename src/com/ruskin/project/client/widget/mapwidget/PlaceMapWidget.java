package com.ruskin.project.client.widget.mapwidget;

import java.util.ArrayList;
import java.util.List;

import org.gwtopenmaps.openlayers.client.Bounds;
import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.Map;
import org.gwtopenmaps.openlayers.client.MapOptions;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Style;
import org.gwtopenmaps.openlayers.client.control.SelectFeature;
import org.gwtopenmaps.openlayers.client.control.SelectFeatureOptions;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureSelectedListener;
import org.gwtopenmaps.openlayers.client.feature.VectorFeature;
import org.gwtopenmaps.openlayers.client.geometry.Point;
import org.gwtopenmaps.openlayers.client.layer.OSM;
import org.gwtopenmaps.openlayers.client.layer.Vector;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.ruskin.project.client.Main;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.server.Contact;
import com.ruskin.project.shared.Const;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.QueryResult;
import com.ruskin.project.shared.ReducedContact;

/** A slippy map widget designed for displaying the location of contacts.
 * 	There is one layer in this widget for displaying the
 * 	images representing contacts.  
 * <p>
 *  Other layers, including WMS layers, can be added to this widget as well.
 * </p>
 *
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
	
	private final Bounds bounds = new Bounds(-180, -90, 180, 90);
	private final Bounds maxVisibleExtent;
	
	private final ListDataProvider<GWTContact> dataProvider = new ListDataProvider<GWTContact>();		
	private List<GWTContact> list = dataProvider.getList();	
	private QueryResult currentQuery;
	private final List<ReducedContact> currentlyHighlighted = new ArrayList<ReducedContact>();
	private final List<ReducedContact> MargaretsPoints = new ArrayList<ReducedContact>();
	private final List<ReducedContact> JohnJamesPoints = new ArrayList<ReducedContact>();
	private final List<ReducedContact> JohnsPoints = new ArrayList<ReducedContact>();
	private final List<ReducedContact> JohnsFuturePoints = new ArrayList<ReducedContact>();

	boolean MargaretChecked = false;
	
	public PlaceMapWidget(int width, int height, MainWidget master) {		
		this.master = master;
		
		options = new MapOptions();
		options.setNumZoomLevels(10);		
		mapWidget = new MapWidget(new Integer(width).toString(), new Integer(height).toString(), options);
		OSM tempLayer = OSM.Mapnik("TempLayer");
		
		decorator = new VerticalPanel();
		decorator.setStyleName("mapDecorator");
		
		Label mapLbl = new Label("Ruskin Travels");
		decorator.add(mapLbl);
		decorator.add(mapWidget);	
//		Image map = new Image("https://www.google.com/maps/vt/data=RfCSdfNZ0LFPrHSm0ublXdzhdrDFhtmHhN1u-gM,eiDvPvjfAtLd4FLM45tIGwPU16zG0tvjkTtJ9nHC-I6Cl7yiALL9lBq2W8Knf4et5bqZTCiVKB_S2DuFfipDrfyygCLFIUMwWJqtgm4HchwKl2LPPum3HwqiOga0GnPLkNZRhalWtt6oHCCdkWMC78ykvr9ykLoObGlGQXY9Goaa3qm08dATqd57IVxH_RnXzvek0RxVg55ppw");
		
		decorator.add(mapLbl);
		decorator.add(mapWidget);
		decorator.setStyleName("flexTableCell");
		
		BuildUI();
		
		map = mapWidget.getMap();	
		map.setRestrictedExtent(new Bounds(-180,-90,180,90));
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
				LonLat ll = new LonLat(eventObject.getVectorFeature().getCenterLonLat().lon(), eventObject.getVectorFeature().getCenterLonLat().lat());
				PlaceMapWidget.this.master.getContactDialog().showFor(eventObject.getVectorFeature().getAttributes().getAttributeAsString(Const.FEATURE_ATTRIBUTE_CONTACT_ID));
				
			}
		});		
		
		tempLayer.setIsBaseLayer(true);
		this.zoomToBounds(bounds);
		this.setCenter(new LonLat(0,0),1);
		maxVisibleExtent = map.getExtent();
		this.restoreStartupView();
		
	}	
	
	private void BuildUI() {
		final HorizontalPanel buttonPanel = new HorizontalPanel();
		final CheckBox Margaret = new CheckBox("Margaret");
		final CheckBox JohnJames = new CheckBox("John James");
		final CheckBox John = new CheckBox("John");
		final CheckBox JohnFuture = new CheckBox ("John's Plans");
		final Button clearPoints = new Button("Clear Points");
			
		buttonPanel.getElement().getStyle().setProperty("height", "inherit");
	
		buttonPanel.add(Margaret);
		buttonPanel.add(JohnJames);			
		buttonPanel.add(John);
		buttonPanel.add(JohnFuture);
		buttonPanel.add(clearPoints);
		
		
		final ClickHandler clearPlaceListener = new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				pointVectorLayer.destroyFeatures();	
				Margaret.setValue(false);
				JohnJames.setValue(false);
				John.setValue(false);
				JohnFuture.setValue(false);
			}
		};
		System.out.println("Point reached");
		clearPoints.addClickHandler(clearPlaceListener);
		
		Margaret.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				PlotPointMargaret(event.getValue());
			}
		});
		
		JohnJames.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				PlotPointJohnJames(event.getValue());
			}
		});
		
		John.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				PlotPointJohn(event.getValue());
			}
		});
		
		JohnFuture.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				PlotPointJohnFuture(event.getValue());
			}
		});

		decorator.add(buttonPanel);
	}
	
	/** Sets the center of the map and zoom level.
	 * 
	 * @param ll
	 * @param zoom
	 */	
	public void setCenter(LonLat ll, int zoom) {
		this.map.setCenter(ll,zoom);
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
			this.setCenter(new LonLat(0,0), 1);
		}
	}
	
	public void PlotPointMargaret (Boolean plot) {
		Style pointStyle = new Style();	
		if (plot == true) {
			System.out.println("Point reached");
			ReducedContact c = new ReducedContact("Margaret Was Here", 100, 52.5);
			LonLat ll = c.getCoordinate();
			Point point = new Point(100, 100);
				
			pointStyle.setExternalGraphic("img/red_push_pin.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			
			MargaretsPoints.add(c);
		}
		else {
			eraseAllContacts();		
		}
	}
	
	public void PlotPointJohnJames(Boolean plot) {
		if (plot == true) {
			System.out.println("Point reached");
			ReducedContact c = new ReducedContact("John James Was Here", 100, 52.5);
			LonLat ll = c.getCoordinate();
			Point point = new Point(100, 100);
			Style pointStyle = new Style();		
			pointStyle.setExternalGraphic("img/push_pin_green.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			
			JohnJamesPoints.add(c);
		}
		else {
			eraseAllContacts();
		}
	}
	public void PlotPointJohn (Boolean plot) {
		Style pointStyle = new Style();	
		if (plot == true) {
			System.out.println("Point reached");
			ReducedContact c = new ReducedContact("John Was Here", 100, 52.5);
			LonLat ll = c.getCoordinate();
			Point point = new Point(100, 100);
				
			pointStyle.setExternalGraphic("img/red_push_pin.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			
			JohnsPoints.add(c);
		}
		else {
			eraseAllContacts();		
		}
	}
	
	public void PlotPointJohnFuture(Boolean plot) {
		if (plot == true) {
			System.out.println("Point reached");
			ReducedContact c = new ReducedContact("John Wanted to Be Here", 100, 52.5);
			LonLat ll = c.getCoordinate();
			Point point = new Point(100, 100);
			Style pointStyle = new Style();		
			pointStyle.setExternalGraphic("img/push_pin_green.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			pointVectorLayer.addFeature(pointFeature);
			
			JohnsFuturePoints.add(c);
		}
		else {
			eraseAllContacts();
		}
	}
	
	/**This method highlights the contact specified by contactId in green.
	 * 
	 * @param contactId - the contact to be highlighted
	 */
	public void highlightContact(ReducedContact contact){
		VectorFeature contactImage = pointVectorLayer.getFeatureById(contact.getId());
		contactImage.getStyle().setExternalGraphic("img/push_pin_green.png");				
		currentlyHighlighted.add(contact);
	}	
	
	public List<ReducedContact> getCurrentlyHighlighted() {
		return currentlyHighlighted;
	}
	
	
	/**This method unhighlights (or returns their color to red) all of the currently highlighted contacts.
	 * 
	 */
	public void clearHighlighted(){	
		for(ReducedContact c:currentlyHighlighted){
			pointVectorLayer.getFeatureById(c.getId()).getStyle().setExternalGraphic("img/red_push_pin.png");
		}
		currentlyHighlighted.clear();
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
		this.zoomToBounds(bounds);		
		this.setCenter(new LonLat(0.0,0.0),1);	
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



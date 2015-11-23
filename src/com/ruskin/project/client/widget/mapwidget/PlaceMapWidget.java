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
import org.gwtopenmaps.openlayers.client.layer.Layer;
import org.gwtopenmaps.openlayers.client.layer.OSM;
import org.gwtopenmaps.openlayers.client.layer.Vector;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.client.lists.JJList;
import com.ruskin.project.client.lists.MaryList;
import com.ruskin.project.client.lists.PassThrough;
import com.ruskin.project.shared.Const;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.ReducedContact;

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
	
	private final ChooseLayer currentLayer;
	
	private final Vector diaryVectorLayer;
	private final Vector ruskinVectorLayer;
	private final Vector allVectorLayer;
	
	private SelectFeatureOptions clickControlOptions;
	private SelectFeature diaryControl;
	private SelectFeature ruskinControl;
	private SelectFeature allControl;
	
	private Bounds bounds = new Bounds(-6602637.2967569,2397352.6248374,9051666.0938681,11202898.282064);
	

	
	private final Projection proj;
	
	public PlaceMapWidget(int width, int height, final MainWidget master) {		
		this.master = master;
		
		currentLayer = new ChooseLayer(master);
		
		options = new MapOptions();
		options.setNumZoomLevels(20);
		mapWidget = new MapWidget(new Integer(width).toString(), new Integer(height).toString(), options);
		
		decorator = new VerticalPanel();
		decorator.setStyleName("mapDecorator");
		decorator.add(mapWidget);
		
		proj = new Projection("EPSG:4326");
		
		map = mapWidget.getMap();
		map.setRestrictedExtent(bounds);
		map.setMinMaxZoomLevel(0, 20);
		
		BuildUI();
		
		OSM tempLayer = OSM.Mapnik("TempLayer");
		diaryVectorLayer = new Vector("Diary Layer");
		ruskinVectorLayer = new Vector("Ruskin Layer");
		allVectorLayer = new Vector("All Layers");
		
		map.addLayer(tempLayer);
		
		clickControlOptions = new SelectFeatureOptions();
		diaryControl = new SelectFeature(diaryVectorLayer, clickControlOptions);
		ruskinControl = new SelectFeature(ruskinVectorLayer, clickControlOptions);
		allControl = new SelectFeature(allVectorLayer, clickControlOptions);
		
		allControl.setAutoActivate(true);  
		diaryControl.setAutoActivate(true);  
		ruskinControl.setAutoActivate(true);  
		
		map.addControl(diaryControl);
		map.addControl(ruskinControl);
		map.addControl(allControl);
		
		diaryVectorLayer.addVectorFeatureSelectedListener(new VectorFeatureSelectedListener() {
			@Override
			public void onFeatureSelected(FeatureSelectedEvent eventObject) {
				master.getDiaryDialog().showFor(GWTContact.createGWTContact(eventObject.getVectorFeature().getAttributes().getAttributeAsString(Const.FEATURE_ATTRIBUTE_CONTACT_ID)));
				diaryControl.unSelect(eventObject.getVectorFeature());
			}
		});		
		
		ruskinVectorLayer.addVectorFeatureSelectedListener(new VectorFeatureSelectedListener() {
			@Override
			public void onFeatureSelected(FeatureSelectedEvent eventObject) {
				master.getRuskinDialog().showFor(GWTContact.createGWTContact(eventObject.getVectorFeature().getAttributes().getAttributeAsString(Const.FEATURE_ATTRIBUTE_CONTACT_ID)));
				ruskinControl.unSelect(eventObject.getVectorFeature());
			}
		});	
		
		allVectorLayer.addVectorFeatureSelectedListener(new VectorFeatureSelectedListener() {
			@Override
			public void onFeatureSelected(FeatureSelectedEvent eventObject) {
				master.getAllDialog().showFor(GWTContact.createGWTContact(eventObject.getVectorFeature().getAttributes().getAttributeAsString(Const.FEATURE_ATTRIBUTE_CONTACT_ID)));
				allControl.unSelect(eventObject.getVectorFeature());
			}
		});	
		
		map.setRestrictedExtent(bounds);
		map.zoomToExtent(bounds);
		this.zoomToBounds(bounds);
		LonLat center = new LonLat(8,48);
		center.transform(proj.getProjectionCode(), map.getProjection());
		map.setCenter(center, 5);
		
	}	
	
	private void BuildUI() {
		final HorizontalPanel buttonPanel = new HorizontalPanel();
		final Button plot = new Button("plot");
			
		buttonPanel.getElement().getStyle().setProperty("height", "inherit");
	
		buttonPanel.add(currentLayer);
		buttonPanel.add(plot);
		
		decorator.add(buttonPanel);
		
		plot.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String choice = currentLayer.layer();
				NewLayer(choice);
			}
		});
	
	}
	
	public String NewLayer(String choice) {
		if(choice.matches("All Layers")) {
			PlotPointAll(true);
			PlotPointDiary(false);
			PlotPointsRuskin(false);
		}
		else if (choice.matches("Diary Layer")) {
			PlotPointAll(false);
			PlotPointDiary(true);
			PlotPointsRuskin(false);
		}
		else if (choice.matches("Ruskin Layer")) {
			PlotPointAll(false);
			PlotPointDiary(false);
			PlotPointsRuskin(true);
		}
		return choice;
	}
	
	/** Returns the current base layer of this MapWidget.
	 * 
	 * @return
	 */	
	public Layer getBaseLayer(){		
		return this.map.getBaseLayer();
	}

	/** Zooms to a specified bounding box.
	 * 
	 * @param bounds
	 */
	public void zoomToBounds(Bounds bounds) {	
		if(bounds == null){
			return;
		}
		bounds = bounds.transform( new Projection("EPSG: 900913"), new Projection("EPSG: 4326"));
		this.map.zoomToExtent(bounds);
	}
	
	/** Gets the bounding box currently being displayed by this MapWidget.
	 * 
	 * @return
	 */
	public Bounds getBounds() {
		return this.map.getExtent().transform(new Projection("EPSG: 900913"), new Projection("EPSG: 4326"));
	}	
	
	/** Returns an array of all layers that have been added to this map.
	 * 
	 * @return
	 */
	public Layer[] getLayers() {
		return map.getLayers();
	}
	
//	/**
//	 * Prints the given {@link ReducedContact}s on this PlaceMapWidget.
//	 * 
//	 * @param contacts
//	 *            - a list of {@link ReducedContact} objects
//	 */		
//	public void printContacts(List<? extends GWTContact> contacts) {
//		for (GWTContact c : contacts) {
//			LonLat ll = c.getCoordinate();
//			Point point = new Point(ll.lon(), ll.lat());
//			Style pointStyle = new Style();		
//			pointStyle.setExternalGraphic("img/red_push_pin.png");
//			pointStyle.setGraphicSize(10, 17);
//			pointStyle.setFillOpacity(1.0);
//
//			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
//			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
//			pointFeature.setFeatureId(c.getId());	
//		}
//	}
	
	public void PlotPointAll(Boolean plot) {
		map.addLayer(allVectorLayer);
		Style pointStyle = new Style();		
		Style pointStyle2 = new Style();		
		
		if (plot == true) {
			
			for (int i=0; i<MaryList.getSize(); i++) {
				ReducedContact c = MaryList.getReducedContact(i);
			
				Point point = new Point(c.getLongitude(), c.getLatitude());
				point.transform(proj, new Projection(map.getProjection()));
					
				pointStyle.setExternalGraphic("img/map_marker_red.png");
				pointStyle.setGraphicSize(10, 17);
				pointStyle.setFillOpacity(1.0);

				VectorFeature pointFeature = new VectorFeature(point, pointStyle);
				pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
				pointFeature.setFeatureId(c.getId());
				allVectorLayer.addFeature(pointFeature);
			}
			
//			ReducedContact c2 = new ReducedContact("John Was Here", 60, 40);
//			
//			LonLat ll2 = c2.getCoordinate();
//			Point point2 = new Point(ll2.lon(), ll2.lat());
//			point2.transform(proj, new Projection(map.getProjection()));	
//			pointStyle2.setExternalGraphic("img/map_marker_blue.png");
//			pointStyle2.setGraphicSize(10, 17);
//			pointStyle2.setFillOpacity(1.0);
//
//			VectorFeature pointFeature2 = new VectorFeature(point2, pointStyle2);
//			pointFeature2.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c2.getId());
//			pointFeature2.setFeatureId(c2.getId());
//			allVectorLayer.addFeature(pointFeature2);
//			
			ruskinControl.deactivate();
			diaryControl.deactivate();
			allControl.activate();
		}
		else {
			eraseAllContacts();
			allControl.deactivate();
			map.removeLayer(allVectorLayer);
		}
	}
	
	public void PlotPointDiary(Boolean plot) {
		map.addLayer(diaryVectorLayer);
		Style pointStyle = new Style();	
		
		if (plot == true) {
			System.out.println(MaryList.getSize());
			for (int i=0; i<MaryList.getSize(); i++) {
				ReducedContact c = MaryList.getReducedContact(i);
			
				Point point = new Point(c.getLongitude(), c.getLatitude());
				point.transform(proj, new Projection(map.getProjection()));
					
				pointStyle.setExternalGraphic("img/map_marker_red.png");
				pointStyle.setGraphicSize(10, 17);
				pointStyle.setFillOpacity(1.0);

				VectorFeature pointFeature = new VectorFeature(point, pointStyle);
				pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
				pointFeature.setFeatureId(c.getId());
				diaryVectorLayer.addFeature(pointFeature);
			}
			ruskinControl.deactivate();
			allControl.deactivate();
			diaryControl.activate();
		}
		else {
			eraseDiaryContacts();
			diaryControl.deactivate();
			map.removeLayer(diaryVectorLayer);
		}
	}
	public void PlotPointsRuskin (Boolean plot) {
		Style pointStyle = new Style();	
		map.addLayer(ruskinVectorLayer);
		if (plot == true) {
			ReducedContact c = new ReducedContact("John Was Here", 60, 40);
			
			LonLat ll = c.getCoordinate();
			Point point = new Point(ll.lon(), ll.lat());
			point.transform(proj, new Projection(map.getProjection()));	
			pointStyle.setExternalGraphic("img/map_marker_blue.png");
			pointStyle.setGraphicSize(10, 17);
			pointStyle.setFillOpacity(1.0);

			VectorFeature pointFeature = new VectorFeature(point, pointStyle);
			pointFeature.getAttributes().setAttribute(Const.FEATURE_ATTRIBUTE_CONTACT_ID, c.getId());
			pointFeature.setFeatureId(c.getId());
			ruskinVectorLayer.addFeature(pointFeature);
			
			allControl.deactivate();
			diaryControl.deactivate();
			ruskinControl.activate();
		}
		else {
			eraseRuskinContacts();	
			ruskinControl.deactivate();
			map.removeLayer(ruskinVectorLayer);
		}
	}

	/** Erases all contacts from the map portion of this ContactMapWidget.
	 * 
	 */
	public void eraseAllContacts() {
		allVectorLayer.destroyFeatures();
	}
	
	/** Erases all contacts from the diary layer.
	 * 
	 */
	public void eraseDiaryContacts() {
		diaryVectorLayer.destroyFeatures();
	}
	
	/** Erases all contacts from the Ruskin layer.
	 * 
	 */
	public void eraseRuskinContacts() {
		ruskinVectorLayer.destroyFeatures();
	}
	
	/** Returns the layer responsible for drawing the contact images.
	 * 
	 * @return
	 */
	public Vector getVectorLayer() {
		if (NewLayer(currentLayer.layer()).matches("Diary Layer")) {
			return diaryVectorLayer;
		}
		else if (NewLayer(currentLayer.layer()).matches("Ruskin Layer")) {
			return ruskinVectorLayer;
		}
		else {
			return allVectorLayer;
		}
	}

	@Override
	public Widget asWidget() {
		return decorator;
	}
}



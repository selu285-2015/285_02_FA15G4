package com.ruskin.project.client;

import org.gwtopenmaps.openlayers.client.Bounds;
import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.Map;
import org.gwtopenmaps.openlayers.client.MapOptions;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Size;
import org.gwtopenmaps.openlayers.client.control.SelectFeature;
import org.gwtopenmaps.openlayers.client.control.SelectFeatureOptions;
import org.gwtopenmaps.openlayers.client.event.MapClickListener;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureSelectedListener;
import org.gwtopenmaps.openlayers.client.layer.Layer;
import org.gwtopenmaps.openlayers.client.layer.Vector;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

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

	public PlaceMapWidget(int width, int height, MainWidget master) {		
		this.master = master;
		
		options = new MapOptions();
		options.setNumZoomLevels(30);		
		mapWidget = new MapWidget(new Integer(width).toString(), new Integer(height).toString(), options);
		
		
		decorator = new VerticalPanel();
		decorator.setStyleName("mapDecorator");
		
		Label mapLbl = new Label("Ruskin Travels");
		decorator.add(mapLbl);
		decorator.add(mapWidget);	
		Label mapHolderLbl = new Label("Map HERE");
//		Image map = new Image("https://www.google.com/maps/vt/data=RfCSdfNZ0LFPrHSm0ublXdzhdrDFhtmHhN1u-gM,eiDvPvjfAtLd4FLM45tIGwPU16zG0tvjkTtJ9nHC-I6Cl7yiALL9lBq2W8Knf4et5bqZTCiVKB_S2DuFfipDrfyygCLFIUMwWJqtgm4HchwKl2LPPum3HwqiOga0GnPLkNZRhalWtt6oHCCdkWMC78ykvr9ykLoObGlGQXY9Goaa3qm08dATqd57IVxH_RnXzvek0RxVg55ppw");
		
		decorator.add(mapLbl);
		decorator.add(mapWidget);
		decorator.setStyleName("flexTableCell");
		
		BuildUI();
		
		map = mapWidget.getMap();	
		map.setMinMaxZoomLevel(1, 40);
		
		pointVectorLayer = new Vector("Point Layer");
		map.addLayer(pointVectorLayer);
	}	
	
	private void BuildUI() {
		final HorizontalPanel buttonPanel = new HorizontalPanel();
		final CheckBox Margaret = new CheckBox("Margaret");
		final CheckBox JohnJames = new CheckBox("John James");
		final CheckBox JohnPast = new CheckBox("John");
		final CheckBox JohnFuture = new CheckBox ("John's Plans");
			
		buttonPanel.getElement().getStyle().setProperty("height", "inherit");
	
		buttonPanel.add(Margaret);
		buttonPanel.add(JohnJames);			
		buttonPanel.add(JohnPast);
		buttonPanel.add(JohnFuture);
		
		decorator.add(buttonPanel);
	}

	@Override
	public Widget asWidget() {
		return decorator;
	}
}



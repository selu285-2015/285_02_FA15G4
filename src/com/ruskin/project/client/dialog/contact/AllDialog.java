package com.ruskin.project.client.dialog.contact;


import java.util.List;

import org.gwtopenmaps.openlayers.client.MapWidget;

import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.ruskin.project.client.Main;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.client.SimplifiedCallback;
import com.ruskin.project.client.lists.JJList;
import com.ruskin.project.client.lists.MaryList;
import com.ruskin.project.client.lists.PassThrough;
import com.ruskin.project.client.widget.mapwidget.PlaceMapWidget;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.GWTPassThrough;

/** This Widget is intended to display metadata describing clicked points
 *Author: Brittney Jarreau
 */
public class AllDialog {
	
	private final NumberFormat nf = NumberFormat.getFormat("0.0####");
	private final DialogBox dialog;
	
	protected final CellTable<GWTPassThrough> table = new CellTable<GWTPassThrough>();
	private final ListDataProvider<GWTPassThrough> dataProvider = new ListDataProvider<GWTPassThrough>();		
	private List<GWTPassThrough> list = dataProvider.getList();	
	
	private final ScrollPanel passPnl;
	private final TabPanel tabPanel;
	
	private final SimplePanel maryView;
	private final SimplePanel johnView;
	private final SimplePanel V1View;
	private final SimplePanel V2View;
	private final SimplePanel V3View;
	private final SimplePanel V4View;
	
	private final Label MarylblId;
	private final Label	JohnJameslblId;
	private final Label V1lblId;
	private final Label	V2lblId;
	private final Label V3lblId;
	private final Label	V4lblId;
	
	private final Label MarylblArrivalDate;
	private final Label	JohnJameslblArrivalDate;
	private final Label V1lblArrivalDate;
	private final Label	V2lblArrivalDate;
	private final Label V3lblArrivalDate;
	private final Label	V4lblArrivalDate;
	
	private final Label MarylblDepartDate;
	private final Label	JohnJameslblDepartDate;
	private final Label V1lblDepartDate;
	private final Label	V2lblDepartDate;
	private final Label V3lblDepartDate;
	private final Label	V4lblDepartDate;
	
	private final Label MarylblLocation;
	private final Label	JohnJameslblLocation;
	private final Label V1lblLocation;
	private final Label	V2lblLocation;
	private final Label V3lblLocation;
	private final Label	V4lblLocation;
	
	private final Label MarylblLink;
	private final Label	JohnJameslblLink;
	private final Label V1lblLink;
	private final Label	V2lblLink;
	private final Label V3lblLink;
	private final Label	V4lblLink;
	
	private final Label MarylblSights;
	private final Label	JohnJameslblSights;
	private final Label V1lblSights;
	private final Label	V2lblSights;
	private final Label V3lblSights;
	private final Label	V4lblSights;
	
	private final Label MarylblLatitude;
	private final Label MarylblLongitude;
	private final Label JohnJameslblLatitude;
	private final Label JohnJameslblLongitude;
	private final Label	V1lblLatitude;
	private final Label V1lblLongitude;
	private final Label V2lblLatitude;
	private final Label V2lblLongitude;
	private final Label	V3lblLatitude;
	private final Label V3lblLongitude;
	private final Label V4lblLatitude;
	private final Label V4lblLongitude;
	
	private final Label passThrus;
	
	private GWTContact showingFor;
	private GWTContact showingForMary;
	private GWTContact showingForJJ;
	
	private List<GWTPassThrough> newList;
	
	public AllDialog() {
		dialog = new DialogBox(false, true);
		tabPanel = new TabPanel();
		passPnl = new ScrollPanel();
		passPnl.setWidth("500px");
		passPnl.setHeight("100px");
		
		maryView = new SimplePanel();
		johnView = new SimplePanel();
		V1View = new SimplePanel();
		V2View = new SimplePanel();
		V3View = new SimplePanel();
		V4View = new SimplePanel();
		
		passThrus = new Label("pass-throughs");
		passThrus.setWidth("100%");
		passThrus.setStyleName("flexTableCellHead");
	
		MarylblId = new Label();
		JohnJameslblId = new Label();
		V1lblId = new Label();
		V2lblId = new Label();
		V3lblId = new Label();
		V4lblId = new Label();
		
		MarylblArrivalDate= new Label();
		JohnJameslblArrivalDate = new Label();
		V1lblArrivalDate= new Label();
		V2lblArrivalDate = new Label();
		V3lblArrivalDate= new Label();
		V4lblArrivalDate = new Label();
		
		MarylblDepartDate= new Label();
		JohnJameslblDepartDate = new Label();
		V1lblDepartDate= new Label();
		V2lblDepartDate = new Label();
		V3lblDepartDate= new Label();
		V4lblDepartDate = new Label();
		
		MarylblLocation= new Label();
		JohnJameslblLocation = new Label();
		V1lblLocation= new Label();
		V2lblLocation = new Label();
		V3lblLocation= new Label();
		V4lblLocation = new Label();
		
		MarylblLink= new Label();
		JohnJameslblLink = new Label();
		V1lblLink= new Label();
		V2lblLink = new Label();
		V3lblLink= new Label();
		V4lblLink = new Label();
		
		MarylblSights= new Label();
		JohnJameslblSights = new Label();
		V1lblSights= new Label();
		V2lblSights = new Label();
		V3lblSights= new Label();
		V4lblSights = new Label();
		
		MarylblLatitude = new Label();
		MarylblLongitude = new Label();
		JohnJameslblLatitude = new Label();
		JohnJameslblLongitude = new Label();
		V1lblLatitude = new Label();
		V1lblLongitude = new Label();
		V2lblLatitude = new Label();
		V2lblLongitude = new Label();
		V3lblLatitude = new Label();
		V3lblLongitude = new Label();
		V4lblLatitude = new Label();
		V4lblLongitude = new Label();
		
		buildUI();
	}

	private void buildUI() {
		dialog.getElement().getStyle().setZIndex(2000);
		dialog.setGlassEnabled(true);
		dialog.setWidth("500px");
		dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
			@Override
			public void onClose(final CloseEvent<PopupPanel> event) {
				PlaceMapWidget.getVectorLayer().getFeatureById(showingFor.getId()).getStyle().setExternalGraphic("img/map_marker_red.png");
				showingFor = null;
				showingForMary = null;
				showingForJJ = null;
				list.clear();
				PlaceMapWidget.getVectorLayer().redraw();
			}
		});

		buildMaryView();
		buildJohnView();
		buildV1View();
		buildV2View();
		buildV3View();
		buildV4View();
		
		final TabPanel tabPanel = new TabPanel();
		tabPanel.getElement().getStyle().setWidth(100, Unit.PCT);
		tabPanel.add(maryView, "Mary");
		tabPanel.add(johnView, "John James");
		tabPanel.add(V1View, "Version 1");
		tabPanel.add(V2View, "Version 2");
		tabPanel.add(V3View, "Version 3");
		tabPanel.add(V4View, "Version 4");
		tabPanel.selectTab(0);

		final FlowPanel btnPanel = new FlowPanel();

		final Button btnClose = new Button("Close");
		btnClose.getElement().getStyle().setPadding(5, Unit.PX);
		btnClose.getElement().getStyle().setFloat(Style.Float.RIGHT);
		btnClose.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(final ClickEvent event) {
				dialog.hide();
			}
		});
		btnPanel.add(btnClose);

		final VerticalPanel mainContents = new VerticalPanel();
		mainContents.getElement().getStyle().setWidth(100, Unit.PCT);
		
		// Create the Results table
				TextColumn<GWTPassThrough> countryColumn = new TextColumn<GWTPassThrough>() {
					@Override
					public String getValue(GWTPassThrough contact) {
						return contact.getCountry();
					}
				};
				TextColumn<GWTPassThrough> locationColumn = new TextColumn<GWTPassThrough>() {
					@Override
					public String getValue(GWTPassThrough contact) {
						return contact.getLocation();
					}
				};
				TextColumn<GWTPassThrough> sightColumn = new TextColumn<GWTPassThrough>() {
					@Override
					public String getValue(GWTPassThrough contact) {
						return contact.getSights();
					}
				};
		table.setColumnWidth(0, "25%");
		table.setColumnWidth(1, "25%");
		table.setColumnWidth(2, "50%");		
		table.addColumn(countryColumn, "COUNTRY");
		table.addColumn(locationColumn, "LOCATION");
		table.addColumn(sightColumn, "SIGHTS");
		
		table.setWidth("100%", true);
				
		dataProvider.addDataDisplay(table);	
		
		passPnl.add(table);
		passPnl.setStyleName("flexTableCell");
		
		mainContents.add(tabPanel);
		mainContents.add(passThrus);
		mainContents.add(passPnl);
		mainContents.add(btnPanel);

		dialog.setWidget(mainContents);
	}

	private void buildMaryView() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Country:"));
		table.setWidget(i, 1, MarylblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, MarylblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, MarylblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Arrival Date:"));
		table.setWidget(i, 1, MarylblArrivalDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Departure Date:"));
		table.setWidget(i, 1, MarylblDepartDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Location:"));
		table.setWidget(i, 1, MarylblLocation);
		i += 1;
		
		table.setWidget(i, 0, new Label("Sights:"));
		table.setWidget(i, 1, MarylblSights);
		i += 1;
		
		table.setWidget(i, 0, new Label("Link:"));
		table.setWidget(i, 1, MarylblLink);
		i += 1;
		
		maryView.setWidget(table);
	}

	private void buildJohnView() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Country:"));
		table.setWidget(i, 1, JohnJameslblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, JohnJameslblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, JohnJameslblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Arrival Date:"));
		table.setWidget(i, 1, JohnJameslblArrivalDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Departure Date:"));
		table.setWidget(i, 1, JohnJameslblDepartDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Location:"));
		table.setWidget(i, 1, JohnJameslblLocation);
		i += 1;
		
		table.setWidget(i, 0, new Label("Sights:"));
		table.setWidget(i, 1, JohnJameslblSights);
		i += 1;
		
		table.setWidget(i, 0, new Label("Link:"));
		table.setWidget(i, 1, JohnJameslblLink);
		i += 1;
		
		johnView.setWidget(table);
	}
	
	private void buildV1View() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Country:"));
		table.setWidget(i, 1, V1lblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, V1lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, V1lblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Arrival Date:"));
		table.setWidget(i, 1, V1lblArrivalDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Departure Date:"));
		table.setWidget(i, 1, V1lblDepartDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Location:"));
		table.setWidget(i, 1, V1lblLocation);
		i += 1;
		
		table.setWidget(i, 0, new Label("Sights:"));
		table.setWidget(i, 1, V1lblSights);
		i += 1;
		
		table.setWidget(i, 0, new Label("Link:"));
		table.setWidget(i, 1, V1lblLink);
		i += 1;
		
		V1View.setWidget(table);
	}

	private void buildV2View() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Country:"));
		table.setWidget(i, 1, V2lblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, V2lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, V2lblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Arrival Date:"));
		table.setWidget(i, 1, V2lblArrivalDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Departure Date:"));
		table.setWidget(i, 1, V2lblDepartDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Location:"));
		table.setWidget(i, 1, V2lblLocation);
		i += 1;
		
		table.setWidget(i, 0, new Label("Sights:"));
		table.setWidget(i, 1, V2lblSights);
		i += 1;
		
		table.setWidget(i, 0, new Label("Link:"));
		table.setWidget(i, 1, V2lblLink);
		i += 1;
		
		V2View.setWidget(table);
	}

	private void buildV3View() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Country:"));
		table.setWidget(i, 1, V3lblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, V3lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, V3lblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Arrival Date:"));
		table.setWidget(i, 1, V3lblArrivalDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Departure Date:"));
		table.setWidget(i, 1, V3lblDepartDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Location:"));
		table.setWidget(i, 1, V3lblLocation);
		i += 1;
		
		table.setWidget(i, 0, new Label("Sights:"));
		table.setWidget(i, 1, V3lblSights);
		i += 1;
		
		table.setWidget(i, 0, new Label("Link:"));
		table.setWidget(i, 1, V3lblLink);
		i += 1;
		
		V3View.setWidget(table);
	}

	private void buildV4View() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Country:"));
		table.setWidget(i, 1, V4lblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, V4lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, V4lblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Arrival Date:"));
		table.setWidget(i, 1, V4lblArrivalDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Departure Date:"));
		table.setWidget(i, 1, V4lblDepartDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Location:"));
		table.setWidget(i, 1, V4lblLocation);
		i += 1;
		
		table.setWidget(i, 0, new Label("Sights:"));
		table.setWidget(i, 1, V4lblSights);
		i += 1;
		
		table.setWidget(i, 0, new Label("Link:"));
		table.setWidget(i, 1, V4lblLink);
		i += 1;
		
		V4View.setWidget(table);
	}

	private void updateUI() {
		dialog.setText(showingFor.getId());
		{
			final String val = showingFor.getCountry();
			final String Mval = showingForMary.getCountry();
			final String Jval = showingForJJ.getCountry();
			MarylblId.setText(Mval);
			JohnJameslblId.setText(Jval);
			V1lblId.setText(val);
			V2lblId.setText(val);
			V3lblId.setText(val);
			V4lblId.setText(val);
		}
		{
			final String val = nf.format(showingFor.getLongitude());
			final String Mval = nf.format(showingForMary.getLongitude());
			final String Jval = nf.format(showingForJJ.getLongitude());
			MarylblLongitude.setText(Mval);
			JohnJameslblLongitude.setText(Jval);
			V1lblLongitude.setText(val);
			V2lblLongitude.setText(val);
			V3lblLongitude.setText(val);
			V4lblLongitude.setText(val);
		}
		{
			final String val = nf.format(showingFor.getLatitude());
			final String Mval = nf.format(showingForMary.getLatitude());
			final String Jval = nf.format(showingForJJ.getLatitude());
			MarylblLatitude.setText(Mval);
			JohnJameslblLatitude.setText(Jval);
			V1lblLatitude.setText(val);
			V2lblLatitude.setText(val);
			V3lblLatitude.setText(val);
			V4lblLatitude.setText(val);
		}
		{
			final String val = showingFor.getArrivalDate();
			final String Mval = showingForMary.getArrivalDate();
			final String Jval = showingForJJ.getArrivalDate();
			MarylblArrivalDate.setText(Mval);
			JohnJameslblArrivalDate.setText(Jval);
			V1lblArrivalDate.setText(val);
			V2lblArrivalDate.setText(val);
			V3lblArrivalDate.setText(val);
			V4lblArrivalDate.setText(val);
		}
		{
			final String val = showingFor.getDepartDate();
			final String Mval = showingForMary.getDepartDate();
			final String Jval = showingForJJ.getDepartDate();
			MarylblDepartDate.setText(Mval);
			JohnJameslblDepartDate.setText(Jval);
			V1lblDepartDate.setText(val);
			V2lblDepartDate.setText(val);
			V3lblDepartDate.setText(val);
			V4lblDepartDate.setText(val);
		}
		{
			final String val = showingFor.getLocation();
			final String Mval = showingForMary.getLocation();
			final String Jval = showingForJJ.getLocation();
			V1lblLocation.setText(val);
			V2lblLocation.setText(val);
			V3lblLocation.setText(val);
			V4lblLocation.setText(val);
			MarylblLocation.setText(Mval);
			JohnJameslblLocation.setText(Jval);
		}
		{
			final String val = showingFor.getLink();
			final String Mval = showingForMary.getLink();
			final String Jval = showingForJJ.getLink();
			V1lblLink.setText(val);
			V2lblLink.setText(val);
			V3lblLink.setText(val);
			V4lblLink.setText(val);
			MarylblLink.setText(Mval);
			JohnJameslblLink.setText(Jval);
		}
		{
			final String val = showingFor.getSights();
			final String Mval = showingForMary.getSights();
			final String Jval = showingForJJ.getSights();
			V1lblSights.setText(val);
			V2lblSights.setText(val);
			V3lblSights.setText(val);
			V4lblSights.setText(val);
			MarylblSights.setText(Mval);
			JohnJameslblSights.setText(Jval);
		}
	}

	public void showFor(final String id) {
		Main.getContactServices().getContact(id, new SimplifiedCallback<GWTContact>("get contact with id " + id, true){
			@Override
			public void onSuccess(GWTContact result) {	
				showFor(result);
			}
		});
	}

	public void showFor(final GWTContact c) {
		showingFor = c;
		showingForMary = MaryList.getContact(c.getId());
		showingForJJ = JJList.getContact(c.getId());
		for(int i=0; i<PassThrough.getPass(c.getId()).size(); i++) {
			list.add(PassThrough.getPass(c.getId()).get(i));
		}
		updateUI();
		dialog.center();
	}
	
	public CellTable<GWTPassThrough> getTable() {
		return table;
	}
	
	public List<GWTPassThrough> getList() {
		return list;
	}

	public void setList(List<GWTPassThrough> newList){
		list = newList;
	}

	public ListDataProvider<GWTPassThrough> getDataProvider() {
		return dataProvider;
	}
	
}

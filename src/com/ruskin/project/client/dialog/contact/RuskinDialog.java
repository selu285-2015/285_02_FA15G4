package com.ruskin.project.client.dialog.contact;


import java.util.List;

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
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.ruskin.project.client.Main;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.client.widget.mapwidget.PlaceMapWidget;
import com.ruskin.project.shared.GWTContact;

/** This Widget is intended to display metadata describing clicked points
 *Author: Brittney Jarreau
 */
public class RuskinDialog {
	private final MainWidget master;
	
	private final NumberFormat nf = NumberFormat.getFormat("0.0####");
	private final DialogBox dialog;
	
	protected final CellTable<GWTContact> table = new CellTable<GWTContact>();
	private final ListDataProvider<GWTContact> dataProvider = new ListDataProvider<GWTContact>();		
	private List<GWTContact> list = dataProvider.getList();	
	
	private final HorizontalPanel passPnl;																																																
	private final TabPanel tabPanel;
	
	private final SimplePanel V1View;
	private final SimplePanel V2View;
	private final SimplePanel V3View;
	private final SimplePanel V4View;
	
	
	private final Label V1lblId;
	private final Label	V2lblId;
	private final Label V3lblId;
	private final Label	V4lblId;
	
	private final Label V1lblArrivalDate;
	private final Label	V2lblArrivalDate;
	private final Label V3lblArrivalDate;
	private final Label	V4lblArrivalDate;
	
	private final Label V1lblDepartDate;
	private final Label	V2lblDepartDate;
	private final Label V3lblDepartDate;
	private final Label	V4lblDepartDate;
	
	private final Label V1lblLocation;
	private final Label	V2lblLocation;
	private final Label V3lblLocation;
	private final Label	V4lblLocation;
	
	private final Label V1lblLink;
	private final Label	V2lblLink;
	private final Label V3lblLink;
	private final Label	V4lblLink;
	
	private final Label V1lblSights;
	private final Label	V2lblSights;
	private final Label V3lblSights;
	private final Label	V4lblSights;
	
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

	public RuskinDialog(MainWidget master) {
		this.master = master;
		
		dialog = new DialogBox(false, true);
		tabPanel = new TabPanel();
		passPnl = new HorizontalPanel();
		
		V1View = new SimplePanel();
		V2View = new SimplePanel();
		V3View = new SimplePanel();
		V4View = new SimplePanel();
		
		passThrus = new Label("pass-throughs");
		passThrus.setWidth("100%");
		passThrus.setStyleName("flexTableCellHead");
		
		V1lblId = new Label();
		V2lblId = new Label();
		V3lblId = new Label();
		V4lblId = new Label();
		
		V1lblArrivalDate= new Label();
		V2lblArrivalDate = new Label();
		V3lblArrivalDate= new Label();
		V4lblArrivalDate = new Label();
		
		V1lblDepartDate= new Label();
		V2lblDepartDate = new Label();
		V3lblDepartDate= new Label();
		V4lblDepartDate = new Label();
		
		V1lblLocation= new Label();
		V2lblLocation = new Label();
		V3lblLocation= new Label();
		V4lblLocation = new Label();
		
		V1lblLink= new Label();
		V2lblLink = new Label();
		V3lblLink= new Label();
		V4lblLink = new Label();
		
		V1lblSights= new Label();
		V2lblSights = new Label();
		V3lblSights= new Label();
		V4lblSights = new Label();
		
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
				master.getMap().getVectorLayer().getFeatureById(showingFor.getId()).getStyle().setExternalGraphic("img/map_marker_red.png");
				showingFor = null;
				master.getMap().getVectorLayer().redraw();
			}
		});

		buildV1View();
		buildV2View();
		buildV3View();
		buildV4View();
		
		final TabPanel tabPanel = new TabPanel();
		tabPanel.getElement().getStyle().setWidth(100, Unit.PCT);
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
		TextColumn<GWTContact> countryColumn = new TextColumn<GWTContact>() {
			@Override
			public String getValue(GWTContact contact) {
				return contact.getCountry();
			}
		};
		TextColumn<GWTContact> locationColumn = new TextColumn<GWTContact>() {
			@Override
			public String getValue(GWTContact contact) {
				return contact.getLocation();
			}
		};
		TextColumn<GWTContact> sightColumn = new TextColumn<GWTContact>() {
			@Override
			public String getValue(GWTContact contact) {
				return contact.getSights();
			}
		};
		TextColumn<GWTContact> linkColumn = new TextColumn<GWTContact>() {
			@Override
			public String getValue(GWTContact contact) {
				return contact.getLink();
			}
		};
		
		table.addColumn(countryColumn, "COUNTRY");
		table.addColumn(locationColumn, "LOCATION");
		table.addColumn(sightColumn, "SIGHTS");
		table.addColumn(linkColumn, "LINK");	

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

	private void buildV1View() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("ID:"));
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

		table.setWidget(i, 0, new Label("Contact ID:"));
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

		table.setWidget(i, 0, new Label("ID:"));
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

		table.setWidget(i, 0, new Label("ID:"));
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
		dialog.setText("Metadata for Point " + showingFor.getId());
		final StringBuilder txt = new StringBuilder();

		{
			final String val = showingFor.getCountry();
			V1lblId.setText(val);
			V2lblId.setText(val);
			V3lblId.setText(val);
			V4lblId.setText(val);
			txt.append("Country: ").append(val).append("<br />");
		}
		{
			final String val = nf.format(showingFor.getLongitude());
			V1lblLongitude.setText(val);
			V2lblLongitude.setText(val);
			V3lblLongitude.setText(val);
			V4lblLongitude.setText(val);
			txt.append("Longitude: ").append(val).append("<br />");
		}
		{
			final String val = nf.format(showingFor.getLatitude());
			V1lblLatitude.setText(val);
			V2lblLatitude.setText(val);
			V3lblLatitude.setText(val);
			V4lblLatitude.setText(val);
			txt.append("Latitude: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getArrivalDate();
			V1lblArrivalDate.setText(val);
			V2lblArrivalDate.setText(val);
			V3lblArrivalDate.setText(val);
			V4lblArrivalDate.setText(val);
			txt.append("Arrival Date: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getDepartDate();
			V1lblDepartDate.setText(val);
			V2lblDepartDate.setText(val);
			V3lblDepartDate.setText(val);
			V4lblDepartDate.setText(val);
			txt.append("Depart Date: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getLocation();
			V1lblLocation.setText(val);
			V2lblLocation.setText(val);
			V3lblLocation.setText(val);
			V4lblLocation.setText(val);
			txt.append("Location: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getLink();
			V1lblLink.setText(val);
			V2lblLink.setText(val);
			V3lblLink.setText(val);
			V4lblLink.setText(val);
			txt.append("Link: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getSights();
			V1lblSights.setText(val);
			V2lblSights.setText(val);
			V3lblSights.setText(val);
			V4lblSights.setText(val);
			txt.append("Sights: ").append(val).append("<br />");
		}
		
	}
	
	public void showFor(final GWTContact c) {
		showingFor = c;
		updateUI();
		dialog.center();
	}
	
	public CellTable<GWTContact> getTable() {
		return table;
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
}

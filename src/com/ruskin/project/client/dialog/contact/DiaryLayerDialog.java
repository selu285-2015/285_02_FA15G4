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
public class DiaryLayerDialog {
	private final MainWidget master;
	
	private final NumberFormat nf = NumberFormat.getFormat("0.0####");
	private final DialogBox dialog;
	
	protected final CellTable<GWTPassThrough> table = new CellTable<GWTPassThrough>();
	private final ListDataProvider<GWTPassThrough> dataProvider = new ListDataProvider<GWTPassThrough>();		
	private List<GWTPassThrough> list = dataProvider.getList();	
	
	private final ScrollPanel passPnl;
	private final TabPanel tabPanel;
	
	private final SimplePanel maryView;
	private final SimplePanel johnView;
	
	private final Label MarylblId;
	private final Label	JohnJameslblId;
	
	private final Label MarylblArrivalDate;
	private final Label	JohnJameslblArrivalDate;
	
	private final Label MarylblDepartDate;
	private final Label	JohnJameslblDepartDate;
	
	private final Label MarylblLocation;
	private final Label	JohnJameslblLocation;
	
	private final Label MarylblLink;
	private final Label	JohnJameslblLink;
	
	private final Label MarylblSights;
	private final Label	JohnJameslblSights;
	
	private final Label MarylblLatitude;
	private final Label MarylblLongitude;
	private final Label JohnJameslblLatitude;
	private final Label JohnJameslblLongitude;
	
	private final Label passThrus;
	
	private GWTContact showingFor;
	private GWTContact showingForMary;
	private GWTContact showingForJJ;
	
	private List<GWTPassThrough> newList;
	
	public DiaryLayerDialog(MainWidget master) {
		this.master = master;
		
		dialog = new DialogBox(false, true);
		tabPanel = new TabPanel();
		passPnl = new ScrollPanel();
		passPnl.setWidth("500px");
		passPnl.setHeight("100px");
		
		maryView = new SimplePanel();
		johnView = new SimplePanel();
		
		passThrus = new Label("pass-throughs");
		passThrus.setWidth("100%");
		passThrus.setStyleName("flexTableCellHead");
		
		MarylblId = new Label();
		JohnJameslblId = new Label();
		
		MarylblArrivalDate= new Label();
		JohnJameslblArrivalDate = new Label();
		
		MarylblDepartDate= new Label();
		JohnJameslblDepartDate = new Label();
		
		MarylblLocation= new Label();
		JohnJameslblLocation = new Label();
		
		MarylblLink= new Label();
		JohnJameslblLink = new Label();

		MarylblSights= new Label();
		JohnJameslblSights = new Label();
		
		MarylblLatitude = new Label();
		MarylblLongitude = new Label();
		JohnJameslblLatitude = new Label();
		JohnJameslblLongitude = new Label();
		
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
				showingForMary = null;
				showingForJJ = null;
				list.clear();
				master.getMap().getVectorLayer().redraw();
			}
		});

		buildMaryView();
		buildJohnView();
		
		final TabPanel tabPanel = new TabPanel();
		tabPanel.getElement().getStyle().setWidth(100, Unit.PCT);
		tabPanel.add(maryView, "Mary");
		tabPanel.add(johnView, "John James");
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

		table.setWidget(i, 0, new Label("ID:"));
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

		table.setWidget(i, 0, new Label("Contact ID:"));
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

	private void updateUI() {

		dialog.setText(showingFor.getId());
		{
			final String Jval = showingForJJ.getCountry();
			final String Mval = showingForMary.getCountry();
			MarylblId.setText(Mval);
			JohnJameslblId.setText(Jval);
		}
		{
			final String Jval = nf.format(showingForJJ.getLongitude());
			final String Mval = nf.format(showingForMary.getLongitude());
			MarylblLongitude.setText(Mval);
			JohnJameslblLongitude.setText(Jval);
		}
		{
			final String Jval = nf.format(showingForJJ.getLatitude());
			final String Mval = nf.format(showingForMary.getLatitude());
			MarylblLatitude.setText(Mval);
			JohnJameslblLatitude.setText(Jval);
		}
		{
			final String Jval = showingForJJ.getArrivalDate();
			final String Mval = showingForMary.getArrivalDate();
			MarylblArrivalDate.setText(Mval);
			JohnJameslblArrivalDate.setText(Jval);
		}
		{
			final String Jval = showingForJJ.getDepartDate();
			final String Mval = showingForMary.getDepartDate();
			MarylblDepartDate.setText(Mval);
			JohnJameslblDepartDate.setText(Jval);
		}
		{
			final String Jval = showingForJJ.getLocation();
			final String Mval = showingForMary.getLocation();
			MarylblLocation.setText(Mval);
			JohnJameslblLocation.setText(Jval);
		}
		{
			final String Jval = showingForJJ.getLink();
			final String Mval = showingForMary.getLink();
			MarylblLink.setText(Mval);
			JohnJameslblLink.setText(Jval);
		}
		{
			final String Jval = showingForJJ.getSights();
			final String Mval = showingForMary.getSights();
			MarylblSights.setText(Mval);
			JohnJameslblSights.setText(Jval);
		}
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

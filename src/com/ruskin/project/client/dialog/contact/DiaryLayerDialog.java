package com.ruskin.project.client.dialog.contact;


import java.util.Date;
import java.util.List;

import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.ruskin.project.client.Main;
import com.ruskin.project.client.SimplifiedCallback;
import com.ruskin.project.client.lists.MaryList;
import com.ruskin.project.shared.GWTContact;

/** This Widget is intended to display metadata describing clicked points
 *Author: Brittney Jarreau
 */
public class DiaryLayerDialog {
	
	private final NumberFormat nf = NumberFormat.getFormat("0.0####");
	private final DialogBox dialog;
	
	protected final CellTable<GWTContact> table = new CellTable<GWTContact>();
	private final ListDataProvider<GWTContact> dataProvider = new ListDataProvider<GWTContact>();		
	private List<GWTContact> list = dataProvider.getList();	
	
	private final HorizontalPanel passPnl;
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

	public DiaryLayerDialog() {
		dialog = new DialogBox(false, true);
		tabPanel = new TabPanel();
		passPnl = new HorizontalPanel();
		
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
				showingFor = null;
				showingForMary = null;
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
		final StringBuilder txt = new StringBuilder();
		{
			final String val = showingFor.getCountry();
			final String Mval = showingForMary.getCountry();
			MarylblId.setText(Mval);
			JohnJameslblId.setText(val);
			txt.append("Country: ").append(val).append("<br />");
		}
		{
			final String val = nf.format(showingFor.getLongitude());
			final String Mval = nf.format(showingForMary.getLongitude());
			MarylblLongitude.setText(Mval);
			JohnJameslblLongitude.setText(val);
			txt.append("Longitude: ").append(val).append("<br />");
		}
		{
			final String val = nf.format(showingFor.getLatitude());
			final String Mval = nf.format(showingForMary.getLatitude());
			MarylblLatitude.setText(Mval);
			JohnJameslblLatitude.setText(val);
			txt.append("Latitude: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getArrivalDate();
			final String Mval = showingForMary.getArrivalDate();
			MarylblArrivalDate.setText(Mval);
			JohnJameslblArrivalDate.setText(val);
			txt.append("Arrival Date: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getDepartDate();
			final String Mval = showingForMary.getDepartDate();
			MarylblDepartDate.setText(Mval);
			JohnJameslblDepartDate.setText(val);
			txt.append("Depart Date: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getLocation();
			final String Mval = showingForMary.getLocation();
			MarylblLocation.setText(Mval);
			JohnJameslblLocation.setText(val);
			txt.append("Location: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getLink();
			final String Mval = showingForMary.getLink();
			MarylblLink.setText(Mval);
			JohnJameslblLink.setText(val);
			txt.append("Link: ").append(val).append("<br />");
		}
		{
			final String val = showingFor.getSights();
			final String Mval = showingForMary.getSights();
			MarylblSights.setText(Mval);
			JohnJameslblSights.setText(val);
			txt.append("Sights: ").append(val).append("<br />");
		}
	}

	public void showFor(final String id) {
		
		Main.getContactServices().getContact(id, new SimplifiedCallback<GWTContact>("get contact with id " + id, true) {
			@Override
			public void onSuccess(GWTContact result) {	
				showFor(result);
			}
		});
	}

	public void showFor(final GWTContact c) {
		showingFor = c;
		showingForMary = MaryList.getContact(c.getId());
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

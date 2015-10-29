package com.ruskin.project.client.dialog.contact;


import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.ruskin.project.client.Main;
import com.ruskin.project.client.SimplifiedCallback;
import com.ruskin.project.shared.GWTContact;

/** This Widget is intended to display metadata describing clicked points
 *Author: Brittney Jarreau
 */
public class RuskinDialog {
	private final NumberFormat nf = NumberFormat.getFormat("0.0####");
	private final DialogBox dialog;
	private final TabPanel tabPanel;
	
	private final SimplePanel V1View;
	private final SimplePanel V2View;
	private final SimplePanel V3View;
	private final SimplePanel V4View;
	
	private final Label V1lblId;
	private final Label	V2lblId;
	private final Label V3lblId;
	private final Label	V4lblId;
	
	private final Label V1lblDate;
	private final Label	V2lblDate;
	private final Label V3lblDate;
	private final Label	V4lblDate;
	
	private final Label	V1lblLatitude;
	private final Label V1lblLongitude;
	private final Label V2lblLatitude;
	private final Label V2lblLongitude;
	private final Label	V3lblLatitude;
	private final Label V3lblLongitude;
	private final Label V4lblLatitude;
	private final Label V4lblLongitude;
	
	private final Label lblLink;
	private final Label lblDetails;
	private GWTContact showingFor;

	public RuskinDialog() {
		dialog = new DialogBox(false, true);
		tabPanel = new TabPanel();
		V1View = new SimplePanel();
		V2View = new SimplePanel();
		V3View = new SimplePanel();
		V4View = new SimplePanel();
		
		V1lblId = new Label();
		V2lblId = new Label();
		V3lblId = new Label();
		V4lblId = new Label();
		
		V1lblDate= new Label();
		V2lblDate = new Label();
		V3lblDate= new Label();
		V4lblDate = new Label();
		
		V1lblLatitude = new Label();
		V1lblLongitude = new Label();
		V2lblLatitude = new Label();
		V2lblLongitude = new Label();
		V3lblLatitude = new Label();
		V3lblLongitude = new Label();
		V4lblLatitude = new Label();
		V4lblLongitude = new Label();
		
		lblLink = new Label();
		lblDetails = new Label();
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

		mainContents.add(tabPanel);
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
		
		table.setWidget(i, 0, new Label("Date:"));
		table.setWidget(i, 1, V1lblDate);
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
		
		table.setWidget(i, 0, new Label("Date:"));
		table.setWidget(i, 1, V2lblDate);
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
		
		table.setWidget(i, 0, new Label("Date:"));
		table.setWidget(i, 1, V3lblDate);
		i += 1;
		
		
		V3View.setWidget(table);
	}

	private void buildV4View() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Contact ID:"));
		table.setWidget(i, 1, V4lblId);
		i += 1;
		
		table.setWidget(i, 0, new Label("Longitude"));
		table.setWidget(i, 1, V4lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, V4lblLatitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Date:"));
		table.setWidget(i, 1, V4lblDate);
		i += 1;
		
		V4View.setWidget(table);
	}
	private void updateUI() {
		dialog.setText("Metadata for Point " + showingFor.getId());
		final StringBuilder txt = new StringBuilder();

		{
			final String val = showingFor.getId();
			V1lblId.setText(val);
			V2lblId.setText(val);
			V3lblId.setText(val);
			V4lblId.setText(val);
			txt.append("ID: ").append(val).append("<br />");
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
			final String val = showingFor.getDate();
			V1lblDate.setText(val);
			V2lblDate.setText(val);
			V3lblDate.setText(val);
			V4lblDate.setText(val);
			txt.append("Date: ").append(val).append("<br />");
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
		updateUI();
		dialog.center();
	}
}

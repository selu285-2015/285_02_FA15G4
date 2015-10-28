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
public class AllDialog {
	
	private final NumberFormat nf = NumberFormat.getFormat("0.0####");
	private final DialogBox dialog;
	private final TabPanel tabPanel;
	private final SimplePanel maryView;
	private final SimplePanel johnView;
	private final Label lblId;
	private final Label lblLatitude;
	private final Label lblLongitude;
	private final Label lblLink;
	private final Label lblDate;
	private final Label lblDetails;
	private GWTContact showingFor;

	public AllDialog() {
		dialog = new DialogBox(false, true);
		tabPanel = new TabPanel();
		maryView = new SimplePanel();
		johnView = new SimplePanel();
		lblId = new Label();
		lblLatitude = new Label();
		lblLongitude = new Label();
		lblLink = new Label();
		lblDate = new Label();
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

		mainContents.add(tabPanel);
		mainContents.add(btnPanel);

		dialog.setWidget(mainContents);
	}

	private void buildMaryView() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Contact ID:"));
		table.setWidget(i, 1, lblId);
		i += 1;


		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, lblLatitude);
		i += 1;

		table.setWidget(i, 0, new Label("Longitude:"));
		table.setWidget(i, 1, lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Date:"));
		table.setWidget(i, 1, lblDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Details:"));
		table.setWidget(i, 1, lblDetails);
		i += 1;
		
		table.setWidget(i, 0, new Label("Artifact At:"));
		table.setWidget(i, 1, lblLink);
		i += 1;
		
		maryView.setWidget(table);
	}

	private void buildJohnView() {
		final FlexTable table = new FlexTable();
		table.setWidth("500px");

		int i = 0;

		table.setWidget(i, 0, new Label("Contact ID:"));
		table.setWidget(i, 1, lblId);
		i += 1;


		table.setWidget(i, 0, new Label("Latitude:"));
		table.setWidget(i, 1, lblLatitude);
		i += 1;

		table.setWidget(i, 0, new Label("Longitude:"));
		table.setWidget(i, 1, lblLongitude);
		i += 1;
		
		table.setWidget(i, 0, new Label("Date:"));
		table.setWidget(i, 1, lblDate);
		i += 1;
		
		table.setWidget(i, 0, new Label("Details:"));
		table.setWidget(i, 1, lblDetails);
		i += 1;
		
		table.setWidget(i, 0, new Label("Artifact At:"));
		table.setWidget(i, 1, lblLink);
		i += 1;
		
		johnView.setWidget(table);
	}

	private void updateUI() {
		dialog.setText("Metadata for Point " + showingFor.getId());
		final StringBuilder txt = new StringBuilder();

		{
			final String val = showingFor.getId();
			lblId.setText(val);
			txt.append("ID: ").append(val).append("<br />");
		}
		{
			final String val = nf.format(showingFor.getLatitude());
			lblLatitude.setText(val);
			txt.append("Latitude: ").append(val).append("<br />");
		}
		{
			final String val = nf.format(showingFor.getLongitude());
			lblLongitude.setText(val);
			txt.append("Longitude: ").append(val).append("<br />");
		}
	}

	public void showForMary(final String id) {
		
		Main.getContactServices().getContact(id, new SimplifiedCallback<GWTContact>("get contact with id " + id, true) {
			@Override
			public void onSuccess(GWTContact result) {	
				showForMary(result);
			}
		});
	}

	public void showForMary(final GWTContact c) {
		showingFor = c;
		updateUI();
		dialog.center();
	}
	
}

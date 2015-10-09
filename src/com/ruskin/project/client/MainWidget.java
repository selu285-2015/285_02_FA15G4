package com.ruskin.project.client;

import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.dialog.contact.ContactDialog;
import com.ruskin.project.client.searchWidget.SearchWidget;
import com.ruskin.project.client.widget.mapwidget.PlaceMapWidget;

/**
 * The main widget, which is added to the RootPanel.
 */
public class MainWidget implements IsWidget {
	
	private final TimeWidget timePanel;
	private final Forum forum;
	private VerticalPanel mainPanel = new VerticalPanel();	
	private final PlaceMapWidget placesMap;
	private final ContactDialog contactDialog;
	private final SearchWidget searchWidget;
	
	public MainWidget() {
		this.mainPanel = new VerticalPanel();
		placesMap = new PlaceMapWidget(800,450, this);
		timePanel = new TimeWidget(this);
		forum = new Forum(this);		
		contactDialog = new ContactDialog();
		searchWidget = new SearchWidget(this);
		
		this.buildUI();		
	}
	

	private void buildUI() {
		final HorizontalPanel searchStuff = new HorizontalPanel();
		final VerticalPanel smallWidgets = new VerticalPanel();
		mainPanel.setWidth("100%");
		searchStuff.add(placesMap);
		smallWidgets.add(searchWidget);
		smallWidgets.add(timePanel);
		searchStuff.add(smallWidgets);
		
		FlowPanel titleContainer = new FlowPanel();
		titleContainer.setStyleName("titleContainer");
		Label miwContainer = new Label();
		miwContainer.getElement().getStyle().setFloat(Float.LEFT);
		Label titleLabel = new Label();
		titleLabel.setStyleName("titleLabel");
		titleLabel.setText("The Journey");
		
		titleContainer.add(miwContainer);
		titleContainer.add(titleLabel);
		mainPanel.add(titleContainer);		
		mainPanel.add(searchStuff);
		mainPanel.add(forum);		
	
	}

	public final PlaceMapWidget getMap() {
		return placesMap;
	}
	
	public TimeWidget getTimeWidget() {
		return timePanel;
	}
	
	public ContactDialog getContactDialog() {
		return contactDialog;
	}
	
	public SearchWidget getSearchWidget() {
		return searchWidget;
	}
	
	public Forum getForum() {
		return forum;
	}
	@Override
	public Widget asWidget() {
		return mainPanel;
	}


}

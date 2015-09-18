package com.ruskin.project.client;


import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The main widget, which is added to the RootPanel.
 */
public class MainWidget implements IsWidget {
	
	private final TimeWidget timePanel;
	private final Forum forum;
	private VerticalPanel mainPanel = new VerticalPanel();	
	private final PlaceMapWidget placesMap;
	
	public MainWidget() {
		this.mainPanel = new VerticalPanel();
		placesMap = new PlaceMapWidget(500,300, this);
		timePanel = new TimeWidget(this);
		forum = new Forum(this);		
		
		this.buildUI();		
	}
	

	private void buildUI() {
		final HorizontalPanel searchStuff = new HorizontalPanel();
		mainPanel.setWidth("100%");
		searchStuff.add(placesMap);
		searchStuff.add(timePanel);
		
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

//	public final PlaceMapWidget getMap() {
//		return placesMap;
//	}
	
	public TimeWidget getTimeWidget() {
		return timePanel;
	}
	
	public Forum getForum() {
		return forum;
	}
	@Override
	public Widget asWidget() {
		return mainPanel;
	}


}

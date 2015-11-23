package com.ruskin.project.client;

import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.dialog.contact.AllDialog;
import com.ruskin.project.client.dialog.contact.DiaryLayerDialog;
import com.ruskin.project.client.dialog.contact.RuskinDialog;
import com.ruskin.project.client.lists.AllList;
import com.ruskin.project.client.lists.JJList;
import com.ruskin.project.client.lists.MaryList;
import com.ruskin.project.client.lists.PassThrough;
import com.ruskin.project.client.searchWidget.SearchWidget;
import com.ruskin.project.client.widget.mapwidget.PlaceMapWidget;
import com.ruskin.project.client.widget.time.TimeWidget;

/**
 * The main widget, which is added to the RootPanel.
 * It contains the Map, Search, Time, and Forum widgets.
 * 
 * Author: Brittney Jarreau
 */
public class MainWidget implements IsWidget {
	
	private final TimeWidget timePanel;
	private VerticalPanel mainPanel = new VerticalPanel();	
	private final PlaceMapWidget placesMap;
	private final DiaryLayerDialog diaryDialog;
	private final RuskinDialog ruskinDialog;
	private final AllDialog allDialog;
	private final SearchWidget searchWidget;
	private final AllList All = new AllList();
	private final MaryList Mary = new MaryList();
	private final JJList JohnJames = new JJList();
	private final PassThrough Pass = new PassThrough();
	
	public MainWidget() {
		this.mainPanel = new VerticalPanel();
		placesMap = new PlaceMapWidget(700,450, this);
		timePanel = new TimeWidget(this);
		diaryDialog = new DiaryLayerDialog();
		ruskinDialog = new RuskinDialog();
		allDialog = new AllDialog();
		searchWidget = new SearchWidget(this);
		
		this.buildUI();		
	}
	

	private void buildUI() {
		final HorizontalPanel searchStuff = new HorizontalPanel();
		mainPanel.setWidth("100%");
		searchStuff.add(placesMap);
		searchStuff.add(searchWidget);
		
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
		mainPanel.add(timePanel);		
	
	}

	public final PlaceMapWidget getMap() {
		return placesMap;
	}
	
	public TimeWidget getTimeWidget() {
		return timePanel;
	}
	
	public DiaryLayerDialog getDiaryDialog() {
		return diaryDialog;
	}
	
	public RuskinDialog getRuskinDialog() {
		return ruskinDialog;
	}
	
	public AllDialog getAllDialog() {
		return allDialog;
	}
	
	public SearchWidget getSearchWidget() {
		return searchWidget;
	}
	
	@Override
	public Widget asWidget() {
		return mainPanel;
	}


}

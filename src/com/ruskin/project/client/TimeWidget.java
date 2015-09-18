package com.ruskin.project.client;


import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class TimeWidget implements IsWidget {
	private final MainWidget master;
	private final VerticalPanel mainPanel;
	private final VerticalPanel searching;
	private final HorizontalPanel timePanel;
	private final ScrollPanel hold;
	private final Label queryLbl;

	public TimeWidget(MainWidget master) {
		this.master = master;
		this.mainPanel = new VerticalPanel();
		this.mainPanel.setStyleName("queryPanel");
		searching = new VerticalPanel();
		timePanel = new HorizontalPanel();
		timePanel.setSize("400px", "100px");
		timePanel.addStyleName("flexTableCell");
		
		hold = new ScrollPanel();
		hold.setSize("400px", "350px");
	
		queryLbl = new Label("Time Tracker Widget to be placed here.");
		queryLbl.setStyleName("flexTableCellHead");
		buildUI();
	}

	public void buildUI() {
		hold.add(searching);
		Label details = new Label ("The time will be tracked here");
		Label otherDetails = new Label ("Similar results may be shown here");
		hold.setStyleName("flexTableCell");
		
		timePanel.add(details);
		searching.add(otherDetails);
		mainPanel.add(queryLbl);
		mainPanel.add(timePanel);
		mainPanel.add(hold);
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}
}
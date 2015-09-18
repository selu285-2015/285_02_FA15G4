package com.ruskin.project.client;


import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Forum implements IsWidget {
	private final MainWidget master;
	private final VerticalPanel mainPanel;

	public Forum(MainWidget master) {
		this.master = master;
		mainPanel = new VerticalPanel();
		buildUI();
	}	

	public void buildUI() {

		mainPanel.setWidth("100%");

		HorizontalPanel tableHeader = new HorizontalPanel();
		
		Label lbl = new Label("Discussion Forum to be Placed Here");
		lbl.setStyleName("flexTableCellHead");
		tableHeader.add(lbl);
		ScrollPanel scroll = new ScrollPanel();
		mainPanel.add(tableHeader);
		mainPanel.add(scroll);
		mainPanel.setStyleName("forum");
	}
	
	@Override
	public Widget asWidget() {
		return mainPanel;
	}	

}
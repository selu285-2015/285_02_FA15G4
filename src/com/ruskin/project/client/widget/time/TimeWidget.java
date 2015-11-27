package com.ruskin.project.client.widget.time;


import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.MainWidget;

/** A time tracker widget that allows for a user to select a desired
 * date and view the places that were visited.
 *Author: Holden Pitre
 */
public class TimeWidget implements IsWidget {
	private final MainWidget master;
	private final VerticalPanel mainPanel;
	private final Carousel carousel;
	private final Label lbl;

	public TimeWidget(MainWidget master) {
		this.master = master;
		this.mainPanel = new VerticalPanel();
		this.mainPanel.setStyleName("queryPanel");
		carousel = new Carousel(master);
		lbl = new Label("Time Tracker");
	
		buildUI();
	}

	public void buildUI() {
		lbl.setStyleName("flexTableCellHead");
		mainPanel.add(lbl);
		mainPanel.add(carousel);
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}
}
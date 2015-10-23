package com.ruskin.project.client.searchWidget;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.MainWidget;


/** A search criteria widget that allows for a user to input desired
 * search criteria and fetch similar results
 *Author: Holden Pitre
 */
public class SearchWidget implements IsWidget {
	private final MainWidget master;
	VerticalPanel panel;
	HorizontalPanel searchbar;
	ScrollPanel scrollable;
	TextBox tb;
	Button b;
	Label lbl;
	
	public SearchWidget(MainWidget master) {
		this.master = master;
		panel = new VerticalPanel();
		searchbar = new HorizontalPanel();
		searchbar.setHeight("100px");
		scrollable = new ScrollPanel();
		scrollable.setHeight("400px");
		tb = new TextBox();
		b = new Button("Search");
		tb.setWidth("100px");
		lbl = new Label("Enter Search Criteria");
		
		
		BuildUI();
	}
	
	private void BuildUI() {
		b.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Will search for content matching: " + " '' " + tb.getText() + " '' ");
			}
		});
		
		lbl.setStyleName("flexTableCellHead");
		panel.setWidth("25%");
		panel.setHeight("500px");
		panel.add(lbl);
		searchbar.add(tb);
		searchbar.add(b);
		panel.add(searchbar);
		panel.add(scrollable);
	}
	
	@Override
	public Widget asWidget() {
		return panel;
	}

}

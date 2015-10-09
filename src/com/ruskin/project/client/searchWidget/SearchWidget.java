package com.ruskin.project.client.searchWidget;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.MainWidget;

public class SearchWidget implements IsWidget {
	private final MainWidget master;
	VerticalPanel panel;
	TextBox tb;
	Button b;
	Label lbl;
	
	public SearchWidget(MainWidget master) {
		this.master = master;
		panel = new VerticalPanel();
		tb = new TextBox();
		b = new Button("Search");
		tb.setWidth("400px");
		lbl = new Label("Enter Search Criteria");
		
		
		BuildUI();
	}
	
	private void BuildUI() {
		// Making the button to press to search
		b.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Search not functional yet...");
			}
		});

		// Aligning the panel to be centered, can be altered later in order
		// to fit our needs
		lbl.setStyleName("flexTableCellHead");
		panel.setWidth("400px");
		panel.setHeight("100px");
		panel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		panel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		panel.add(lbl);
		panel.add(tb);
		panel.add(b);
		panel.setStyleName("flexTableCell");
	}
	
	@Override
	public Widget asWidget() {
		return panel;
	}

}

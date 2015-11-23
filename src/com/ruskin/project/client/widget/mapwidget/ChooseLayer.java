package com.ruskin.project.client.widget.mapwidget;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.MainWidget;

public class ChooseLayer implements IsWidget{
	private final MainWidget master;	
	private final ListBox choices;
	
	public ChooseLayer (final MainWidget master) {		
		this.master = master;
		choices = new ListBox();
		BuildUI();
	}
	
	String choice = "Choose A View";
	
	public void BuildUI() {
		choices.addItem("Choose A View");
		choices.addItem("All Layers");
		choices.addItem("Diary Layer");
		choices.addItem("Ruskin Layer");
	}

	public String layer() {
		return choices.getItemText(choices.getSelectedIndex());
	}
	
	@Override
	public Widget asWidget() {
		return choices;
	}

}

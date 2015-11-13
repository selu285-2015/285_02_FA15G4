package com.ruskin.project.client;

import java.util.Collections;

import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.ruskin.project.shared.Const;
import com.ruskin.project.shared.GWTContact;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * Author: Brittney Jarreau
 */
public class Main implements EntryPoint {
	/**
	 * This is the instance of Main.
	 */
	private static Main INSTANCE;
	private final ContactServiceAsync manager;

	/**
	 * Get the instance of {@link ContactServiceAsync} that was created when the user loaded the page.
	 */
	public static ContactServiceAsync getContactServices() {
		return INSTANCE.manager;
	}

	private Map<String, String> config;

	private Main() {
		INSTANCE = this;
		manager = GWT.create(ContactService.class);
	}
	
	
	/**
	 * This is the entry point method; it is called by GWT after creating this object.
	 */
	public void onModuleLoad() {
		// should be kept fairly simple
		buildUI();
	}

	/**
	 * Create the main user interface and then attach it to the {@link RootPanel}.
	 */
	private void buildUI() {
		final RootPanel root = RootPanel.get();
		final MainWidget main;
		
		main = new MainWidget();
		main.asWidget().getElement().setAttribute("align",  "center");
		main.asWidget().getElement().getStyle().setWidth(1000,  Unit.PX);			
		root.add(main);
	}
}
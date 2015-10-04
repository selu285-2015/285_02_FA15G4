package com.google.gwt.searchh.client;

import com.google.gwt.searchh.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Searchh implements EntryPoint {
	public void onModuleLoad() {
	   
	    // Making the text box that will be used to search 
	    TextBox tb = new TextBox();

	    
	  
	    // Making the button to press to search
	    Button b = new Button("Search", new ClickHandler() {
	      public void onClick(ClickEvent event) {
	        Window.alert("Search not functional yet...");
	      }
	    });

	    // Aligning the panel to be centered, can be altered later in order
	    // to fit our needs
	    VerticalPanel panel = new VerticalPanel();
	    panel.setWidth("100%");
	    panel.setHeight("100%");
	    panel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	    panel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
	    panel.add(tb);
	    panel.add(b);
	    
	    
	    RootPanel.get().add(panel);
	    
	  }
}

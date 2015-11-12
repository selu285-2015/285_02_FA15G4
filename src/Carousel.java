package com.carousel.ruskin.client;

import java.util.ArrayList;

import com.carousel.ruskin.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Image;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Carousel implements EntryPoint {


	
public void onModuleLoad() {
    // Creating all widgets
    final ListBox lb = new ListBox();
    final ListBox day = new ListBox();
    final Button display = new Button("Display");
    Button refresh = new Button("Refresh");
    final Image rochester = new Image();
    final Image namur = new Image();
    
    // Visibility settings of all widgets
    day.setVisible(false);
    rochester.setVisible(false);
    namur.setVisible(false);
    namur.setSize("100%", "200px");
    rochester.setSize("100%", "200px");
    
    
    // HTML Widget shenanigans
    final HTML rochsum = new HTML("Notable Sight: Rochester Castle");
    rochsum.addStyleName("rochsum");
    rochsum.setVisible(false);
    
    final HTML namursum = new HTML("Notable Sight: Citadel of Namur");
    namursum.addStyleName("namursum");
    namursum.setVisible(false);
    
    final HTML rochdescript = new HTML("<b>Description:</b> The Rochester Castle began construction" + 
    " in the late 11th century and saw extensive use as a military asset for several centuries." + 
    " Built on the bank of the River Midway in Rochester, it served as a crucial defense against" + 
    " coastal invasions. Today the castle is a Scheduled Monument in England, protecting it from" + 
    " unauthorized change, and is a frequent tourist destination as its ruins are open to the public.");
    rochdescript.addStyleName("rochdescript");
    rochdescript.setVisible(false);
    
    // Add image to vertical panel so it can be added to the root as widget
    VerticalPanel pictures = new VerticalPanel();
    pictures.setWidth("50%");
    pictures.add(rochsum);
    pictures.add(namursum);
    pictures.add(rochester);
    pictures.add(namur);
    pictures.setSpacing(5);
    
    HorizontalPanel time = new HorizontalPanel();
    time.add(lb);
    time.add(day);
    time.add(display);
    time.add(refresh);
    time.setSpacing(5);
       
    final HorizontalPanel rochpan = new HorizontalPanel();
    rochpan.setWidth("50%");
    rochpan.add(rochester);
    rochpan.add(rochdescript);
    rochpan.setSpacing(25);
    rochpan.setBorderWidth(3);
    rochpan.addStyleName("rochpan");
    rochpan.setVisible(false);
    
    
    
    // Adding ClickEvents to base buttons
    refresh.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    	   lb.setVisible(true);
    	   rochester.setVisible(false);
    	   namur.setVisible(false);
    	   lb.setItemSelected(0, true);
    	   day.setItemSelected(0, true);
    	   day.setVisible(false);
    	   rochsum.setVisible(false);
    	   namursum.setVisible(false);
    	   rochdescript.setVisible(false);
    	   rochpan.setVisible(false);
    	   display.setVisible(true);
    	}
    });
    display.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    	   lb.setVisible(false);
    	   if(day.isItemSelected(1) == true) {
    		   rochester.setVisible(true);
    		   rochsum.setVisible(true);
    		   rochdescript.setVisible(true);
    		   rochpan.setVisible(true);
    		   display.setVisible(false);
    		   day.setVisible(false);
    	   }else if (day.isItemSelected(7)){
    		   namur.setVisible(true);
    		   namursum.setVisible(true);
    	   }
    	}
    });
   
    

    //set image sources
    rochester.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Rochester_Castle_Keep_and_Bailey_0038stcp.JPG/400px-Rochester_Castle_Keep_and_Bailey_0038stcp.JPG");
    namur.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Namur_JPG07.jpg/1024px-Namur_JPG07.jpg");
    
   
    
    
    // Making the day ListBox
    day.insertItem("Select a day", 0);
    day.insertItem("May 14, 1833", 1);
    day.insertItem("May 15, 1833", 2);
    day.insertItem("May 16, 1833", 3);
    day.insertItem("May 17, 1833", 4);
    day.insertItem("May 18, 1833", 5);
    day.insertItem("May 22, 1833", 6);
    day.insertItem("May 23, 1833", 7);
    day.insertItem("May 24, 1833", 8);
    day.insertItem("May 25, 1833", 9);
    day.insertItem("May 28, 1833", 10);
    day.insertItem("May 28, 1833", 11);
    day.insertItem("May 30, 1833", 12);
    day.insertItem("May 31, 1833", 13);
    
    // Making the month ListBox
    lb.insertItem("Select a month", 0);
    lb.insertItem("May 1833", 1);
    lb.insertItem("June 1833", 2);
    lb.insertItem("July 1833", 3);
    lb.insertItem("August 1833", 4);
    lb.insertItem("September 1833", 5);
    
    	
    // Set VIC to 1 so it becomes a drop down menu
    lb.setVisibleItemCount(1);
    
    // ClickHandler for month listbox
    lb.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    	   if(lb.isItemSelected(1) == true) {
    		   day.setVisible(true);
    	   }
    	   else{
    		   day.setVisible(false);
    	   }
    	}
    });
   
    
    RootPanel.get().add(time);
    RootPanel.get().add(pictures);
    RootPanel.get().add(rochpan);
   
    
  }
}

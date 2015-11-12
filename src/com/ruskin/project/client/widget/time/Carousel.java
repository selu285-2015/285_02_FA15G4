package com.ruskin.project.client.widget.time;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Carousel implements IsWidget {
	
	final VerticalPanel carousel;
	final VerticalPanel pictures; 
	
	final HorizontalPanel time;
    final HorizontalPanel rochpan;
	
	final ListBox day;
	final ListBox lb;
	
	final Button display;
	final Button refresh;
	
	final Image rochester;
	final Image namur;
	
	final HTML rochsum = new HTML("Rochester Castle");
	final HTML namursum = new HTML("Citadel of Namur");
	final HTML rochdescript = new HTML("<b>Description:</b> The Rochester Castle began construction" + 
		    " in the late 11th century and saw extensive use as a military asset for several centuries." + 
		    " Built on the bank of the River Midway in Rochester, it served as a crucial defense against" + 
		    " coastal invasions. Today the castle is a Scheduled Monument in England, protecting it from" + 
		    " unauthorized change, and is a frequent tourist destination as its ruins are open to the public.");
	
	
	public Carousel() {
		carousel = new VerticalPanel();
		pictures = new VerticalPanel();
		time = new HorizontalPanel();
		rochpan = new HorizontalPanel();
		lb = new ListBox();
    	day = new ListBox();
    	display = new Button("Display");
    	refresh = new Button("Refresh");
    	rochester = new Image();
    	namur = new Image();
    	buildUI();
	}
    
	public void buildUI() {
    // Visibility settings of all widgets
    day.setVisible(false);
    rochester.setVisible(false);
    namur.setVisible(false);
//    namur.setSize("100%", "200px");
//    rochester.setSize("100%", "200px");
    
    // HTML Widget shenanigans
    rochsum.addStyleName("rochsum");
    rochsum.setVisible(false);
   
    namursum.addStyleName("namursum");
    namursum.setVisible(false);
    
    rochdescript.addStyleName("rochdescript");
    rochdescript.setVisible(false);
    
    // Add image to vertical panel so it can be added to the root as widget
    pictures.setWidth("50%");
    pictures.add(rochsum);
    pictures.add(namursum);
    pictures.add(rochester);
    pictures.add(namur);
    pictures.setSpacing(5);
    
  
    time.add(lb);
    time.add(day);
    time.add(display);
    time.add(refresh);
    time.setSpacing(5);
       
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
   
    carousel.add(time);
    carousel.add(pictures);
    carousel.add(rochpan);
	}

	@Override
	public Widget asWidget() {
		return carousel;
	}
}

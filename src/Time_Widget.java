package com.time.ruskin.client;

import java.util.ArrayList;



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
public class Time_Widget implements EntryPoint {
	
	String country;
	String location;
	String passThroughs;
	String sights;
	
	// Creating all widgets
    final ListBox lb = new ListBox();
    final ListBox may = new ListBox();
    final ListBox june = new ListBox();
    final ListBox july = new ListBox();
    final ListBox august = new ListBox();
    final ListBox september = new ListBox();
    final Button display = new Button("Display");
    final Image rochester = new Image();
	
    
	public void onModuleLoad() {
	  
	    
	    
	 
	    
	   
	    
	    
	    // Visibility settings of all widgets
	    may.setVisible(false);
	    june.setVisible(false);
	    july.setVisible(false);
	    august.setVisible(false);
	    september.setVisible(false);
	    rochester.setVisible(false);
	    
	    
	    // Set size of pictures
	    rochester.setSize("100%", "200px");
	    
	    
	    // HTML Widget shenanigans
	    final HTML rochSummary = new HTML("Notable Sight: Rochester Castle");
	    	rochSummary.addStyleName("rochsum");
	    	rochSummary.setVisible(false);
	    
	    
    		
        
	    
        // Add image to vertical panel so it can be added to the root as widget
	    VerticalPanel pictures = new VerticalPanel();
	    pictures.setWidth("50%");
	    pictures.add(rochSummary);
	    pictures.add(rochester);
	    pictures.setSpacing(5);
	    
	    HorizontalPanel time = new HorizontalPanel();
	    time.add(lb);
	    time.add(may);
	    time.add(june);
	    time.add(july);
	    time.add(august);
	    time.add(september);
	    time.add(display);
	    time.setSpacing(5);
	    
	    
		final HorizontalPanel rochPanel = new HorizontalPanel();
		
	    final HorizontalPanel allInfo = new HorizontalPanel();
	    	
	   
	    
	 

	    //set image sources
	    rochester.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Rochester_Castle_Keep_and_Bailey_0038stcp.JPG/400px-Rochester_Castle_Keep_and_Bailey_0038stcp.JPG");
	    
	    
	   
	    
	    
	    // Making the May ListBox
	    may.insertItem("Select a day", 0);
	    may.insertItem("May 14, 1833", 1);
	    may.insertItem("May 15, 1833", 2);
	    may.insertItem("May 16, 1833", 3);
	    may.insertItem("May 17, 1833", 4);
	    may.insertItem("May 18, 1833", 5);
	    may.insertItem("May 22, 1833", 6);
	    may.insertItem("May 23, 1833", 7);
	    may.insertItem("May 24, 1833", 8);
	    may.insertItem("May 25, 1833", 9);
	    may.insertItem("May 28, 1833", 10);
	    may.insertItem("May 28, 1833", 11);
	    may.insertItem("May 30, 1833", 12);
	    may.insertItem("May 31, 1833", 13);
	    
	    
	    // Making the June listbox
	    june.insertItem("Select a day", 0);
	    june.insertItem("June 1, 1833", 14);
	    june.insertItem("June 4, 1833", 15);
	    june.insertItem("June 5, 1833", 16);
	    june.insertItem("June 6, 1833", 17);
	    june.insertItem("June 8, 1833", 18);
	    june.insertItem("June 10, 1833", 19);
	    june.insertItem("June 11, 1833", 20);
	    june.insertItem("June 12, 1833", 21);
	    june.insertItem("June 13, 1833", 22);
	    june.insertItem("June 14, 1833", 23);
	    june.insertItem("June 17, 1833", 24);
	    june.insertItem("June 18, 1833", 25);
	    june.insertItem("June 20, 1833", 26);
	    june.insertItem("June 21, 1833", 27);
	    june.insertItem("June 22, 1833", 28);
	    june.insertItem("June 25, 1833", 29);
	    june.insertItem("June 26, 1833", 30);
	   
	    july.insertItem("Select a day", 0);
	    july.insertItem("July 1, 1833", 31);
	    july.insertItem("July 2, 1833", 32);
	    july.insertItem("July 4, 1833", 33);
	    july.insertItem("July 6, 1833", 34);
	    july.insertItem("July 8, 1833", 35);
	    july.insertItem("July 9, 1833", 36);
	    july.insertItem("July 10, 1833", 37);
	    july.insertItem("July 11, 1833", 38);
	    july.insertItem("July 12, 1833", 39);
	    july.insertItem("July 15, 1833", 40);
	    july.insertItem("July 16, 1833", 41);
	    july.insertItem("July 18, 1833", 42);
	    july.insertItem("July 20, 1833", 43);
	    july.insertItem("July 22, 1833", 44);
	    july.insertItem("July 23, 1833", 45);
	    july.insertItem("July 24, 1833", 46);
	    july.insertItem("July 26, 1833", 47);
	    july.insertItem("July 27, 1833", 48);
	    july.insertItem("July 30, 1833", 49);
	    
	    august.insertItem("Select a day", 0);
	    august.insertItem("August 3, 1833", 50);
	    august.insertItem("August 5, 1833", 51);
	    august.insertItem("August 6, 1833", 52);
	    august.insertItem("August 8, 1833", 53);
	    august.insertItem("August 9, 1833", 54);
	    august.insertItem("August 10, 1833", 55);
	    august.insertItem("August 14, 1833", 56);
	    august.insertItem("August 15, 1833", 57);
	    august.insertItem("August 16, 1833", 58);
	    august.insertItem("August 17, 1833", 59);
	    august.insertItem("August 18, 1833", 60);
	    august.insertItem("August 19, 1833", 61);
	    august.insertItem("August 22, 1833", 62);
	    august.insertItem("August 23, 1833", 63);
	    august.insertItem("August 26, 1833", 64);
	    august.insertItem("August 27, 1833", 65);
	    august.insertItem("August 30, 1833", 66);
	    august.insertItem("August 31, 1833", 67);
	    
	    september.insertItem("Select a day", 0);
	    september.insertItem("September 16, 1833", 68);
	    september.insertItem("September 17, 1833", 69);
	    september.insertItem("September 18, 1833", 70);
	    september.insertItem("September 19, 1833", 71);
	    
	    
	    // Adding ClickEvents to base buttons
	     display.addClickHandler(new ClickHandler() {
	    	   
	    	 public void onClick(ClickEvent Event) { 
	        	
	    		lb.setVisible(true);
		    	rochester.setVisible(false);
		    	rochSummary.setVisible(false);
		    	rochPanel.setVisible(false);
		    	display.setVisible(true);
		    	HTML rochCastle = new HTML("<b>Country: </b>" + country + "<br> <b>Location: </b> "
		    		 + location + "<br> <b>Pass Throughs: </b>" + passThroughs + "<br> <b>Sights: </b>"
		    		 + sights);
		    	HTML Summary = new HTML("<b>Country: </b>" + country + "<br> <b>Location: </b> "
		    		+ location + "<br> <b>Pass Throughs: </b>" + passThroughs + "<br> <b>Sights: </b>"
			    	+ sights);
		    	Summary.addStyleName("summary");
		    	allInfo.add(Summary);
			    rochPanel.add(rochCastle);
		    	
			    if(may.getSelectedIndex() == 1) {
			    	country = "Britain";
		   			location = "London, Dover";
		   			passThroughs = "Blackheath, Shooter's Hill, Dartford, Rochester, Sittingbourne, Canterbury";
		   			sights = "Rochester Castle";
			    	rochester.setVisible(true);
		    		rochSummary.setVisible(true);
		    		rochPanel.setVisible(true);
		   		}else if(may.getSelectedIndex() == 2){
		   			country = "France";
		   			location = "Calais";
		   			passThroughs = "Andres, Larecouse, St. Omere";
		   			sights = "L'hotel de Bourbon or Rossignol, Cathedral";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 3){
		   			country = "France";
		   			location = "Cassel";
		   			passThroughs = "Baileul, Armentieres";
		   			sights = "Hotel d'Angleterre, Ascension Day procession";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 4){
		   			country = "France";
		   			location = "Lille";
		   			passThroughs = "Pont a Trissins";
		   			sights = "Cathedral, Citadel, French custom house";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 5){
		   			country = "Belgium";
		   			location = "Brussels";
		   			passThroughs = "Tournay, Leuse, Ath, Enghien, Hal, Waterloo, Genappe, Sombref";
		   			sights = "Belgian Custom House, Cathedral, Market Place, Hotel de Ville, Place Royale, "
		   					+ "English Church behind House of Representatives, Laken, Palais d'Orange, Cathedral, "
		   					+ "Jardin des PlantesChurch, Battle Site";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 6){
		   			country = "Belgium";
		   			location = "Namur";
		   			passThroughs = "Huy, Liege";
		   			sights = "Meuse, Sambre, Citadel of Namur, Cathedral, Spaniard 'old' church, Bishop's Palace";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 7){
		   			country = "Belgium";
		   			location = "Spa";
		   			passThroughs = "Verviers";
		   			sights = "Mineral Waters, Church--Mass for the Dead--22 Death's heads";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 8){
		   			country = "Prussia-Germany";
		   			location = "Aix-la-Chapelle";
		   			passThroughs = "Julieres";
		   			sights = "Prussian Custom House, Cathedral, Hotel de Ville";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 9){
		   			country = "Prussia-Germany";
		   			location = "Cologne";
		   			passThroughs = "Bonn, Godesberg, Rimagen, Ruins of Godesberg, Drachenfels, "
		   					+ "Rolandseck, Ruins of Appenfels, Castle of Rheineck, Ruins of Hammerstein";
		   			sights = "Reinbergy Hotel, Hotel Couronne Impèriale, Mass, St. Gereon, "
		   					+ "Private Picture Collection, Rubens' birthhouse, St Peter's, "
		   					+ "Bridge of BoatsCollege, Church on HillRuins";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 10){
		   			country = "Prussia-Germany";
		   			location = "Andernach";
		   			passThroughs = "Ruins of Sain, Fort Francis / Petersburgh, "
		   					+ "Ehrenbreitstein (Fortress)";
		   			sights = "Roman Tower, Church";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 11){
		   			country = "Prussia-Germany";
		   			location = "Coblentz (Koblenz)";
		   			passThroughs = "Porte de Mayence, BoppartSt., Goar, Bacharah, "
		   					+ "Ruins of Holzenfels, Lahneck, Marksberg, Sternberg, Leibenstein"
		   					+ "Thurnberg, 'The Cat' Ruins, Schonberg, Rheinfels, 'a dismanteled fortification'"
		   					+ "Antenfels, Stahleck, Firstenberg, Mollingen, Sonneck, Helmburgh,"
		   					+ "Falkenberg, Rheinstein, Vauersberg, Ehrenfels";
		   			sights = "Hotel Cheval Blanc, Ehrenbreitstein Fortress";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 12){
		   			country = "Prussia-Germany";
		   			location = "Bingen";
		   			passThroughs = "Nieder Ingelheim";
		   			sights = "Hotel Chenin Blanc";
		   			allInfo.setVisible(true);
		   		}else if(may.getSelectedIndex() == 13){
		   			country = "Prussia-Germany";
		   			location = "Mayence";
		   			passThroughs = "Wiesbaden";
		   			sights = "Hotel, Cathedral";
		   			allInfo.setVisible(true);
		   		}
	    	 }
	    });	    
	    	 
	     
	     
	     	
	     
	         
	    allInfo.setWidth("50%");
	    allInfo.setHeight("50%");
	    allInfo.setSpacing(25);
	    allInfo.setBorderWidth(10);
	    allInfo.addStyleName("allinfo");
	    allInfo.setVisible(false);
	 				     
		 
	    
 	    rochPanel.setWidth("50%");
 		rochPanel.add(rochester);
 		rochPanel.setSpacing(25);
 		rochPanel.setBorderWidth(3);
 		rochPanel.addStyleName("rochpan");  
 		rochPanel.setVisible(false);	    
	    
	    
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
	    	   if(lb.getSelectedIndex() == 1) {
	    		   may.setVisible(true);
	    		   june.setVisible(false);
	    		   june.setItemSelected(0, true);
	    		   july.setVisible(false);
	    		   july.setItemSelected(0, true);
	    		   august.setVisible(false);
	    		   august.setItemSelected(0, true);
	    		   september.setVisible(false);
	    		   september.setItemSelected(0, true);
	    	   }
	    	   else if(lb.getSelectedIndex() == 2){
	    		   june.setVisible(true);
	    		   may.setVisible(false);
	    		   may.setItemSelected(0, true);
	    		   july.setVisible(false);
	    		   july.setItemSelected(0, true);
	    		   august.setVisible(false);
	    		   august.setItemSelected(0, true);
	    		   september.setVisible(false);
	    		   september.setItemSelected(0, true);
	    	   }
	    	   else if(lb.getSelectedIndex() == 3){
	    		   july.setVisible(true);
	    		   may.setVisible(false);
	    		   may.setItemSelected(0, true);
	    		   june.setVisible(false);
	    		   june.setItemSelected(0, true);
	    		   august.setVisible(false);
	    		   august.setItemSelected(0, true);
	    		   september.setVisible(false);
	    		   september.setItemSelected(0, true);
	    	   }
	    	   else if(lb.getSelectedIndex() == 4){
	    		   august.setVisible(true);
	    		   may.setVisible(false);
	    		   may.setItemSelected(0, true);
	    		   june.setVisible(false);
	    		   june.setItemSelected(0, true);
	    		   july.setVisible(false);
	    		   july.setItemSelected(0, true);
	    		   september.setVisible(false);
	    		   september.setItemSelected(0, true);
	    	   }
	    	   else if(lb.getSelectedIndex() == 5){
	    		   september.setVisible(true);
	    		   may.setVisible(false);
	    		   may.setItemSelected(0, true);
	    		   june.setVisible(false);
	    		   june.setItemSelected(0, true);
	    		   july.setVisible(false);
	    		   july.setItemSelected(0, true);
	    		   august.setVisible(false);
	    		   august.setItemSelected(0, true);
	    	   }
	    	   else{
	    		   may.setVisible(false);
	    		   june.setVisible(false);
	    		   july.setVisible(false);
	    		   august.setVisible(false);
	    		   september.setVisible(false);
	    	   }
	    	}
	    });
	   
	    
	    RootPanel.get().add(time);
	    RootPanel.get().add(pictures);
	    RootPanel.get().add(rochPanel);
	    RootPanel.get().add(allInfo);
	   
	    
	  }
 
	

}
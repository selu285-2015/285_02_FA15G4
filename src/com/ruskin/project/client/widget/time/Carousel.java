package com.ruskin.project.client.widget.time;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.client.lists.AllList;
import com.ruskin.project.shared.GWTContact;

public class Carousel implements IsWidget {
	
	final MainWidget master;
	final VerticalPanel carousel;
	
	final HorizontalPanel time;
    final HorizontalPanel allInfo;
    final ScrollPanel scrollable;
	
	final ListBox lb;
	final ListBox may;
	final ListBox june;
	final ListBox july;
	final ListBox august;
	final ListBox september;
	
	final Button display;
	
	String country;
	String sights;
	String passthroughs;
	String location;
	
	public Carousel(MainWidget master) {
		this.master = master;
		carousel = new VerticalPanel();
		time = new HorizontalPanel();
		time.setHeight("50px");
		allInfo = new HorizontalPanel();
		scrollable = new ScrollPanel();
		
		lb = new ListBox();
    	may = new ListBox();
    	june = new ListBox();
    	july = new ListBox();
    	august = new ListBox();
    	september = new ListBox();
    	
    	display = new Button("Display");
    	buildUI();
	}
    
	public void buildUI() {
    // Visibility settings of all widget
		scrollable.setWidth("1000px");
		
		may.setVisible(false);
		june.setVisible(false);
		july.setVisible(false);
		august.setVisible(false);
		september.setVisible(false);
  
		time.add(lb);
		time.add(may);
		time.add(june);
		time.add(july);
		time.add(august);
		time.add(september);
		time.add(display);
		time.setSpacing(5);
 
	    // Making the may ListBox
	    may.addItem("Select a date");
	    may.addItem("14 May, 1833");
	    may.addItem("15 May, 1833");
	    may.addItem("16 May, 1833");
	    may.addItem("17 May, 1833");
	    may.addItem("18 May, 1833");
	    may.addItem("19 May, 1833");
	    may.addItem("23 May, 1833");
	    may.addItem("24 May, 1833");
	    may.addItem("25 May, 1833");
	    may.addItem("28 May, 1833");
	    may.addItem("29 May, 1833");
	    may.addItem("30 May, 1833");
	    may.addItem("31 May, 1833");
	    
	    // Making the June ListBox
	    june.addItem("Select a date");
	    june.addItem("1 June, 1833");
	    june.addItem("4 June, 1833");
	    june.addItem("5 June, 1833");
	    june.addItem("6 June, 1833");
	    june.addItem("8 June, 1833");
	    june.addItem("10 June, 1833");
	    june.addItem("11 June, 1833");
	    june.addItem("12 June, 1833");
	    june.addItem("13 June, 1833");
	    june.addItem("14 June, 1833");
	    june.addItem("17 June, 1833");
	    june.addItem("18 June, 1833");
	    june.addItem("20 June, 1833");
	    june.addItem("21 June, 1833");
	    june.addItem("22 June, 1833");
	    june.addItem("25 June, 1833");
	    june.addItem("26 June, 1833");
	    
	    // Making the July ListBox
	    july.addItem("Select a date");
	    july.addItem("1 July, 1833");
	    july.addItem("2 July, 1833");
	    july.addItem("4 July, 1833");
	    july.addItem("6 July, 1833");
	    july.addItem("8 July, 1833");
	    july.addItem("9 July, 1833");
	    july.addItem("10 July, 1833");
	    july.addItem("11 July, 1833");
	    july.addItem("12 July, 1833");
	    july.addItem("15 July, 1833");
	    july.addItem("16 July, 1833");
	    july.addItem("18 July, 1833");
	    july.addItem("20 July, 1833");
	    july.addItem("22 July, 1833");
	    july.addItem("23 July, 1833");
	    july.addItem("24 July, 1833");
	    july.addItem("26 July, 1833");
	    july.addItem("27 July, 1833");
	    july.addItem("30 July, 1833");
	    
	    // Making the August ListBox
	    august.addItem("Select a date");
	    august.addItem("3 August, 1833");
	    august.addItem("5 August, 1833");
	    august.addItem("6 August, 1833");
	    august.addItem("8 August, 1833");
	    august.addItem("9 August, 1833");
	    august.addItem("10 August, 1833");
	    august.addItem("14 August, 1833");
	    august.addItem("15 August, 1833");
	    august.addItem("16 August, 1833");
	    august.addItem("17 August, 1833");
	    august.addItem("18 August, 1833");
	    august.addItem("19 August, 1833");
	    august.addItem("22 August, 1833");
	    august.addItem("23 August, 1833");
	    august.addItem("26 August, 1833");
	    august.addItem("27 August, 1833");
	    august.addItem("30 August, 1833");
	    august.addItem("31 August, 1833");
	    
	    // Making the September ListBox
	    september.addItem("Select a Date");
	    september.addItem("16 September, 1833");
	    september.addItem("17 September, 1833");
	    september.addItem("18 September, 1833");
	    september.addItem("19 September, 1833");
    
    // Making the month ListBox
    lb.addItem("Select a Month");
    lb.addItem("May");
    lb.addItem("June");
    lb.addItem("July");
    lb.addItem("August");
    lb.addItem("September");
    	
    // Set VIC to 1 so it becomes a drop down menu
    lb.setVisibleItemCount(1);
    
    // ClickHandler for month listbox
    lb.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    		String month = lb.getItemText(lb.getSelectedIndex()); 
    		may.setVisible(false);
    		june.setVisible(false);
    		july.setVisible(false);
    		august.setVisible(false);
    		september.setVisible(false);
    		if (month.matches("May")) {
    			may.setVisible(true);
    		}
    		else if (month.matches("June")) {
    			june.setVisible(true);
    		}
    		else if (month.matches("July")) {
    			july.setVisible(true);
    		}
    		else if (month.matches("August")) {
    			august.setVisible(true);
    		}
    		else if (month.matches("September")) {
    			september.setVisible(true);
    		}
    	}
    });
    
 // ClickHandler for may listbox
    may.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    		allInfo.clear();
    		String day = may.getItemText(may.getSelectedIndex());
    		int ref = AllList.getRef(day);
    		for (GWTContact c : AllList.getAllContacts()) {
    			if (ref >= c.getDateRef()) {
    				HTML Summary = new HTML("<b>Arrival Date: </b>" + c.getArrivalDate()+ "<b>Departure Date: </b>" + c.getDepartDate() + 
    						"<b>Country: </b>" + c.getCountry() + "<br> <b>Location: </b> " + c.getLocation()); 
    	    		
    	    		Summary.addStyleName("summary");
    				allInfo.add(Summary);
    				allInfo.setVisible(true);
    			}
    		}
    	}
    });
    
 // ClickHandler for may listbox
    june.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    		allInfo.clear();
    		String day = june.getItemText(june.getSelectedIndex());
    		int ref = AllList.getRef(day);
    		for (GWTContact c : AllList.getAllContacts()) {
    			if (ref >= c.getDateRef()) {
    				HTML Summary = new HTML("<b>Arrival Date: </b>" + c.getArrivalDate()+ "<b>Departure Date: </b>" + c.getDepartDate() + 
    						"<b>Country: </b>" + c.getCountry() + "<br> <b>Location: </b> " + c.getLocation()); 
    	    		
    	    		Summary.addStyleName("summary");
    				allInfo.add(Summary);
    				allInfo.setVisible(true);
    			}
    		}
    	}
    });
    
    // ClickHandler for july listbox
    july.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    		allInfo.clear();
    		String day = july.getItemText(july.getSelectedIndex());
    		int ref = AllList.getRef(day);
    		for (GWTContact c : AllList.getAllContacts()) {
    			if (ref >= c.getDateRef()) {
    				HTML Summary = new HTML("<b>Arrival Date: </b>" + c.getArrivalDate()+ "<b>Departure Date: </b>" + c.getDepartDate() + 
    						"<b>Country: </b>" + c.getCountry() + "<br> <b>Location: </b> " + c.getLocation()); 
    	    		
    	    		Summary.addStyleName("summary");
    				allInfo.add(Summary);
    				allInfo.setVisible(true);
    			}
    		}
    	}
    });
    
    // ClickHandler for august listbox
    august.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    		allInfo.clear();
    		String day = august.getItemText(august.getSelectedIndex());
    		int ref = AllList.getRef(day);
    		for (GWTContact c : AllList.getAllContacts()) {
    			if (ref >= c.getDateRef()) {
    				HTML Summary = new HTML("<b>Arrival Date: </b>" + c.getArrivalDate()+ "<b>Departure Date: </b>" + c.getDepartDate() + 
    						"<b>Country: </b>" + c.getCountry() + "<br> <b>Location: </b> " + c.getLocation()); 
    	    		
    	    		Summary.addStyleName("summary");
    				allInfo.add(Summary);
        			allInfo.setVisible(true);
    			}
    		}
    	}
    });
    
    // ClickHandler for september listbox
    september.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent Event) {
    		allInfo.clear();
    		String day = september.getItemText(september.getSelectedIndex());
    		int ref = AllList.getRef(day);
    		for (GWTContact c : AllList.getAllContacts()) {
    			if (ref >= c.getDateRef()) {
    				HTML Summary = new HTML("<b>Arrival Date: </b>" + c.getArrivalDate()+ "<b>Departure Date: </b>" + c.getDepartDate() + 
    						"<b>Country: </b>" + c.getCountry() + "<br> <b>Location: </b> " + c.getLocation()); 
    	    		
    	    		Summary.addStyleName("summary");
    				allInfo.add(Summary);
        			allInfo.setVisible(true);
    			}
    		}
    	}
    });
//    allInfo.setHeight("250px");
    allInfo.setSpacing(25); 
    allInfo.setBorderWidth(10); 
    allInfo.addStyleName("allinfo"); 
	allInfo.setVisible(false);

	scrollable.add(allInfo);
	scrollable.setHeight("250px");
    carousel.add(time);
    carousel.add(scrollable);
	}

	@Override
	public Widget asWidget() {
		return carousel;
	}
}

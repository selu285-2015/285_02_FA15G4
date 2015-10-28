package com.ruskin.project.shared;


public class GWTContact extends ReducedContact{

	private String time;
	
	private GWTContact() {
		super();
	}

	public static GWTContact createGWTContact(String id){
		GWTContact contact = new GWTContact();
		contact.id = id;
		
		return contact;	
	}	

	public String getId() {
		return id;
	}

	public String getDate() {
		return time;
	}

	public void setDate(String time) {
		this.time = time;
	}

}

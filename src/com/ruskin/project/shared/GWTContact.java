package com.ruskin.project.shared;


public class GWTContact extends ReducedContact{

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

}

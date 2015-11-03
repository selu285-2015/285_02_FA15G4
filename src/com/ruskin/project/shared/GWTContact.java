package com.ruskin.project.shared;


public class GWTContact extends ReducedContact{

	private String Departtime;
	private String Arrivaltime;
	private String location;
	private String country;
	private String link;
	private String sights;
	
	public GWTContact() {
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

	public String getDepartDate() {
		return Departtime;
	}
	
	public String getArrivalDate() {
		return Arrivaltime;
	}

	public String getCountry() {
		return country;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getLink() {
		return link;
	}
	
	public String getSights() {
		return sights;
	}
	
	public void setDepartDate(String Departtime) {
		this.Departtime = Departtime;
	}
	
	public void setArrivalDate(String Arrivaltime) {
		this.Arrivaltime = Arrivaltime;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public void setSights(String sights) {
		this.sights = sights;
	}
}

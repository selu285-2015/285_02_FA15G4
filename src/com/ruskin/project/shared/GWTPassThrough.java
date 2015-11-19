package com.ruskin.project.shared;

public class GWTPassThrough extends ReducedContact{
	private String Departtime;
	private String Reference;
	private String Arrivaltime;
	private String location;
	private String country;
	private String link;
	private String sights;
	
	public GWTPassThrough() {
		super();
	}

	public static GWTPassThrough createGWTPassThrough(String id){
		GWTPassThrough PassThrough = new GWTPassThrough();
		PassThrough.id = id;
		return PassThrough;	
	}	

	public String getId() {
		return id;
	}
	
	public String getReference() {
		return Reference;
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
	
	public void setReference (String Reference) {
		this.Reference = Reference;
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

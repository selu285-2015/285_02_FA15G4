package com.ruskin.project.shared;

import org.gwtopenmaps.openlayers.client.LonLat;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ReducedContact implements IsSerializable {
	
	
	protected String id;
	private double longitude;
	private double latitude;
	
	
	public ReducedContact(){
		
		
	}	
	
	public ReducedContact(String id, double lon, double lat){
		this.id = id;
		this.longitude = lon;
		this.latitude = lat;		
	}

	public String getId() {
		return id;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String toString(){	
		return  new StringBuilder()
		.append("Contact [id =").append(id).append(", Longitude = ").append(longitude).append(
				", Latitude = ").append(latitude).append("]").toString();
	}

	public LonLat getCoordinate() {
		return new LonLat(longitude,latitude);
	}
	
}

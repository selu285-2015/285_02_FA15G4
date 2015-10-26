package com.ruskin.project.server;

import java.awt.geom.Point2D;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class Contact{
	
	private String id;

	// latitude (xs:double) or latLon 
	private double latitude;

	// longitude (xs:double) or latLon 
	private double longitude;

	/**
	 * Constructs an instance with a new id and revision. These may be overwritten.
	 */
	public Contact()
	{
		this(UUID.randomUUID().toString());
	}

	/**
	 * Constructs a new instance with the provided id, a new revision, and defaults for all other fields.
	 *
	 * @param id - the id
	 *           
	 */
	public Contact(final String id){
		this.id = id;
		latitude = 0;
		longitude = 0;
	}

	/**
	 * clone of the supplied contact.
	 */
	public Contact(final Contact c){
		id = c.getId();
		latitude = c.getLatitude();
		longitude = c.getLongitude();
	}

	public double getLatitude(){
		return latitude;
	}

	public void setLatitude(final double latitude){
		this.latitude = latitude;
	}

	public double getLongitude(){
		return longitude;
	}

	public void setLongitude(final double longitude){
		this.longitude = longitude;
	}

	public void setId(final String id){
		this.id = id;
	}
	
	@XmlElement(name = "id")
	public String getId(){
		return id;
	}
	
	@XmlTransient
	// @XmlElement(name = "position")
	public Point2D.Double getPosition() {
		return new Point2D.Double(longitude, latitude);
	}


	@Override
	public String toString(){
		return new StringBuilder()
				.append("Contact [id=").append(id).append(", latitude=").append(latitude).append(", longitude=").append(longitude)
				.append("]").toString();
	}

}

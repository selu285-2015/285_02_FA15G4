package com.ruskin.project.client;

import org.gwtopenmaps.openlayers.client.LonLat;

public final class Utils {

	private Utils() {
		//prevent instantiation if needed
	}
	
	public static String toString(final LonLat ll){

		return "( " + ll.lon() + ", " + ll.lat() + " )";

	}

}

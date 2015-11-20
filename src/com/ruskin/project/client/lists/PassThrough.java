package com.ruskin.project.client.lists;

import java.util.ArrayList;
import java.util.List;

import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.GWTPassThrough;

public class PassThrough extends ArrayList<GWTPassThrough>{
	
	static List<GWTPassThrough> list = new ArrayList<>();
	
	public PassThrough() {
		buildList();
	}

	private List<GWTPassThrough> buildList() {
		
		GWTPassThrough gwtC = GWTPassThrough.createGWTPassThrough("Blackheath");
		gwtC.setReference("Dover");
		gwtC.setCountry("Great Britain");
		gwtC.setLocation("Blackheath");
		gwtC.setLatitude(51.4647);
		gwtC.setLongitude(0.0079);
		
		GWTPassThrough gwtC2 = GWTPassThrough.createGWTPassThrough("Shooter's Hill");
		gwtC2.setReference("Dover");
		gwtC2.setCountry("Great Britain");
		gwtC2.setLocation("Shooter's Hill");
		gwtC2.setLongitude(0.06697);
		gwtC2.setLatitude(51.4647);
		
		GWTPassThrough gwtC3 = GWTPassThrough.createGWTPassThrough("Dartford");
		gwtC3.setReference("Dover");
		gwtC3.setCountry("Great Britain");
		gwtC3.setLocation("Dartford");
		gwtC3.setLongitude(0.21423);
		gwtC3.setLatitude(51.44657);
		
		GWTPassThrough gwtC4 = GWTPassThrough.createGWTPassThrough("Rochester");
		gwtC4.setReference("Dover");
		gwtC4.setCountry("Great Britain");
		gwtC4.setLocation("Rochester");
		gwtC4.setLongitude(0.50546);
		gwtC4.setLatitude(51.38764);
		
		GWTPassThrough gwtC5 = GWTPassThrough.createGWTPassThrough("Sittingbourne");
		gwtC5.setReference("Dover");
		gwtC5.setCountry("Great Britain");
		gwtC5.setLocation("Sittingbourne");
		gwtC5.setLongitude(0.73282);
		gwtC5.setLatitude(51.34128);
		
		GWTPassThrough gwtC6 = GWTPassThrough.createGWTPassThrough("Canterbury");
		gwtC6.setReference("Dover");
		gwtC6.setCountry("Great Britain");
		gwtC6.setLocation("Canterbury");
		gwtC6.setLongitude(1.07992);
		gwtC6.setLatitude(51.27904);
		
		GWTPassThrough gwtC7 = GWTPassThrough.createGWTPassThrough("Andres");
		gwtC7.setReference("Cassel");
		gwtC7.setCountry("France");
		gwtC7.setLocation("Andres");
		gwtC7.setLongitude(1.92094);
		gwtC7.setLatitude(50.86556);
		
		GWTPassThrough gwtC8 = GWTPassThrough.createGWTPassThrough("Larecouse");
		gwtC8.setReference("Cassel");
		gwtC8.setCountry("France");
		gwtC8.setLocation("Larecouse");
		gwtC8.setLongitude(1.93844);
		gwtC8.setLatitude(50.78416);
		
		GWTPassThrough gwtC9 = GWTPassThrough.createGWTPassThrough("St. Omere");
		gwtC9.setReference("Cassel");
		gwtC9.setCountry("France");
		gwtC9.setLocation("St. Omere");
		gwtC9.setLongitude(2.25);
		gwtC9.setLatitude(50.75);
		
		GWTPassThrough gwtC10 = GWTPassThrough.createGWTPassThrough("Baileul");
		gwtC10.setReference("Lille");
		gwtC10.setCountry("France");
		gwtC10.setLocation("Baileul");
		gwtC10.setLongitude(2.73594);
		gwtC10.setLatitude(50.73592);
		
		GWTPassThrough gwtC11 = GWTPassThrough.createGWTPassThrough("Armentieres");
		gwtC11.setReference("Lille");
		gwtC11.setCountry("France");
		gwtC11.setLocation("Armentieres");
		gwtC11.setLongitude(2.88214);
		gwtC11.setLatitude(50.68568);
		
		list.add(gwtC);
		list.add(gwtC2);
		list.add(gwtC3);
		list.add(gwtC4);
		list.add(gwtC5);
		list.add(gwtC6);
		list.add(gwtC7);
		list.add(gwtC8);
		list.add(gwtC9);
		list.add(gwtC10);
		list.add(gwtC11);
		
		return list;
	}
	
	public static List<GWTPassThrough> getPass(String reference) {
	
		List<GWTPassThrough> reducedList = new ArrayList<>();
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getReference().matches(reference)) {
				reducedList.add(list.get(i));
			}
		}
		return reducedList;
	}

	public static int getSize() {
		return list.size();
	}
}

package com.ruskin.project.client.lists;

import java.util.ArrayList;
import java.util.List;

import org.apache.jsp.ah.capabilitiesStatusBody_jsp;

import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.ReducedContact;

public class MaryList extends ArrayList<GWTContact>{
	
	static List<GWTContact> list = new ArrayList<>();
	
	public MaryList() {
		buildList();
	}

	private List<GWTContact> buildList() {
		
		GWTContact gwtC = GWTContact.createGWTContact("London");
		gwtC.setCountry("Great Britain");
		gwtC.setLocation("London");
		gwtC.setLatitude(51.50853);
		gwtC.setLongitude(-0.12574);
		gwtC.setArrivalDate("N/A");
		gwtC.setDepartDate("14 May, 1833");
		
		GWTContact gwtC2 = GWTContact.createGWTContact("Dover");
		gwtC2.setCountry("Great Britain");
		gwtC2.setLocation("Dover");
		gwtC2.setLongitude(1.3);
		gwtC2.setLatitude(51.13333);
		gwtC2.setArrivalDate("14 May, 1833");
		gwtC2.setDepartDate("15 May, 1833");
		
		GWTContact gwtC3 = GWTContact.createGWTContact("Calais");
		gwtC3.setCountry("France");
		gwtC3.setLocation("Calais");
		gwtC3.setLongitude(1.85635);
		gwtC3.setLatitude(50.95194);
		gwtC3.setArrivalDate("15 May, 1833");
		gwtC3.setDepartDate("16 May, 1833");
		gwtC3.setSights("L'hotel de Bourbon or Rossignol, Cathedral");
		
		GWTContact gwtC4 = GWTContact.createGWTContact("Cassel");
		gwtC4.setCountry("France");
		gwtC4.setLocation("Cassel");
		gwtC4.setLongitude(2.48527);
		gwtC4.setLatitude(50.80109);
		gwtC4.setArrivalDate("16 May, 1833");
		gwtC4.setDepartDate("17 May, 1833");
		gwtC4.setSights("Hotel d'Angleterre, Ascension Day procession");
		
		GWTContact gwtC5 = GWTContact.createGWTContact("Lillie");
		gwtC5.setCountry("France");
		gwtC5.setLocation("Lillie");
		gwtC5.setLongitude(3.05858);
		gwtC5.setLatitude(50.63297);
		gwtC5.setArrivalDate("17 May, 1833");
		gwtC5.setDepartDate("18 May, 1833");
		gwtC5.setSights("Cathedral, Citadel");

		
		GWTContact gwtC6 = GWTContact.createGWTContact("Brussels");
		gwtC6.setCountry("Belgium");
		gwtC6.setLocation("Brussels");
		gwtC6.setLongitude(4.34878);
		gwtC6.setLatitude(50.85045);
		gwtC6.setArrivalDate("18 May, 1833");
		gwtC6.setDepartDate("22 May, 1833");
		gwtC6.setSights("Market Place, Hotel de Ville, Place Royale, English Church behind House of Representatives, Laken, Palais d'Orange, Cathedral, Jardin des Plantes");
		
		GWTContact gwtC7 = GWTContact.createGWTContact("Namur");
		gwtC7.setCountry("Belgium");
		gwtC7.setLocation("Namur");
		gwtC7.setLongitude(4.86746);
		gwtC7.setLatitude(50.4669);
		gwtC7.setArrivalDate("22 May, 1833");
		gwtC7.setDepartDate("23 May, 1833");
		gwtC7.setSights("Meuse, Sambre, Citadel of Namur");
		
		GWTContact gwtC8 = GWTContact.createGWTContact("Andernach");
		gwtC8.setCountry("Belgium");
		gwtC8.setLocation("Andernach");
		gwtC8.setLongitude(5.86674);
		gwtC8.setLatitude(50.48375);
		gwtC8.setArrivalDate("23 May, 1833");
		gwtC8.setDepartDate("24 May, 1833");
		gwtC8.setSights("Mineral Waters, Church--Mass for the Dead--22 Death's heads");
		
		GWTContact gwtC9 = GWTContact.createGWTContact("Aix-la-Chapelle");
		gwtC9.setCountry("Germany");
		gwtC9.setLocation("Aix-la-Chapelle");
		gwtC9.setLongitude(6.0917);
		gwtC9.setLatitude(50.7708);
		gwtC9.setArrivalDate("24 May, 1833");
		gwtC9.setDepartDate("25 May, 1833");
		gwtC9.setSights("Cathedral, Hotel de Ville");
		
		GWTContact gwtC10 = GWTContact.createGWTContact("Cologne");
		gwtC10.setCountry("Germany");
		gwtC10.setLocation("Cologne");
		gwtC10.setLongitude(6.93487);
		gwtC10.setLatitude(50.94234);
		gwtC10.setArrivalDate("25 May, 1833");
		gwtC10.setDepartDate("28 May, 1833");
		gwtC10.setSights("Reinbergy Hotel, Hotel Couronne Impèriale, Mass, St. Gereon, Private Picture Collection, Rubens' birthhouse, St Peter's, Bridge of Boats");
		
		GWTContact gwtC11 = GWTContact.createGWTContact("Andernach");
		gwtC11.setCountry("Germany");
		gwtC11.setLocation("Andernach");
		gwtC11.setLongitude(7.4004);
		gwtC11.setLatitude(50.4412);
		gwtC11.setArrivalDate("28 May, 1833");
		gwtC11.setDepartDate("29 May, 1833");
		
		GWTContact gwtC12 = GWTContact.createGWTContact("Coblentz(Koblenz)");
		gwtC12.setCountry("Germany");
		gwtC12.setLocation("Coblentz(Koblenz)");
		gwtC12.setLongitude(7.584881);
		gwtC12.setLatitude(50.37302);
		gwtC12.setArrivalDate("29 May, 1833");
		gwtC12.setDepartDate("30 May, 1833");
		
		GWTContact gwtC13 = GWTContact.createGWTContact("Bingen");
		gwtC13.setCountry("Germany");
		gwtC13.setLocation("Bingen");
		gwtC13.setLongitude(7.89);
		gwtC13.setLatitude(49.965);
		gwtC13.setArrivalDate("30 May, 1833");
		gwtC13.setDepartDate("31 May, 1833");
		
		GWTContact gwtC14 = GWTContact.createGWTContact("Mayence");
		gwtC14.setCountry("Germany");
		gwtC14.setLocation("Mayence");
		gwtC14.setLongitude(8.263507);
		gwtC14.setLatitude(50.00558);
		gwtC14.setArrivalDate("31 May, 1833");
		gwtC14.setDepartDate("1 June, 1833");
		
		GWTContact gwtC15 = GWTContact.createGWTContact("Frankfurt");
		gwtC15.setCountry("Germany");
		gwtC15.setLocation("Frankfurt");
		gwtC15.setLongitude(8.66958);
		gwtC15.setLatitude(50.13144);
		gwtC15.setArrivalDate("1 June, 1833");
		gwtC15.setDepartDate("4 June, 1833");
		
		GWTContact gwtC16 = GWTContact.createGWTContact("Heidelberg");
		gwtC16.setCountry("Germany");
		gwtC16.setLocation("Heidelberg");
		gwtC16.setLongitude(8.68885);
		gwtC16.setLatitude(49.41132);
		gwtC16.setArrivalDate("4 June, 1833");
		gwtC16.setDepartDate("5 June, 1833");
		
		GWTContact gwtC17 = GWTContact.createGWTContact("Carlsruhe");
		gwtC17.setCountry("Germany");
		gwtC17.setLocation("Carlsruhe");
		gwtC17.setLongitude(8.394302);
		gwtC17.setLatitude(49.00481);
		gwtC17.setArrivalDate("5 June, 1833");
		gwtC17.setDepartDate("6 June, 1833");
		
		GWTContact gwtC18 = GWTContact.createGWTContact("Kehl");
		gwtC18.setCountry("Germany");
		gwtC18.setLocation("Kehl");
		gwtC18.setLongitude(7.817);
		gwtC18.setLatitude(48.583);
		gwtC18.setArrivalDate("6 June, 1833");
		gwtC18.setDepartDate("8 June, 1833");
		
		GWTContact gwtC19 = GWTContact.createGWTContact("Schaffhausen");
		gwtC19.setCountry("Switzerland");
		gwtC19.setLocation("Schaffhausen");
		gwtC19.setLongitude(8.63493);
		gwtC19.setLatitude(47.69732);
		gwtC19.setArrivalDate("8 June, 1833");
		gwtC19.setDepartDate("10 June, 1833");
		
		GWTContact gwtC20 = GWTContact.createGWTContact("Lake Constance");
		gwtC20.setCountry("Switzerland");
		gwtC20.setLocation("Constance");
		gwtC20.setLongitude(9.46667);
		gwtC20.setLatitude(47.58333);
		gwtC20.setArrivalDate("10 June, 1833");
		gwtC20.setDepartDate("11 June, 1833");
		
		GWTContact gwtC21 = GWTContact.createGWTContact("Pfeffers");
		gwtC21.setCountry("Switzerland");
		gwtC21.setLocation("Pfeffers");
		gwtC21.setLongitude(9.44103);
		gwtC21.setLatitude(47.04896);
		gwtC21.setArrivalDate("11 June, 1833");
		gwtC21.setDepartDate("12 June, 1833");
		
		GWTContact gwtC22 = GWTContact.createGWTContact("Coire");
		gwtC22.setCountry("Switzerland");
		gwtC22.setLocation("Coire");
		gwtC22.setLongitude(9.53287);
		gwtC22.setLatitude(46.84986);
		gwtC22.setArrivalDate("12 June, 1833");
		gwtC22.setDepartDate("13 June, 1833");
		
		GWTContact gwtC23 = GWTContact.createGWTContact("Chiavenna");
		gwtC23.setCountry("Italy");
		gwtC23.setLocation("Chiavenna");
		gwtC23.setLongitude(9.39816);
		gwtC23.setLatitude(46.32063);
		gwtC23.setArrivalDate("13 June, 1833");
		gwtC23.setDepartDate("14 June, 1833");
		
		GWTContact gwtC24 = GWTContact.createGWTContact("Cadenabbia");
		gwtC24.setCountry("Italy");
		gwtC24.setLocation("Cadenabbia");
		gwtC24.setLongitude(9.23615);
		gwtC24.setLatitude(45.98861);
		gwtC24.setArrivalDate("14 June, 1833");
		gwtC24.setDepartDate("17 June, 1833");
		
		GWTContact gwtC25 = GWTContact.createGWTContact("Como");
		gwtC25.setCountry("Italy");
		gwtC25.setLocation("Como");
		gwtC25.setLongitude(9.08744);
		gwtC25.setLatitude(45.80998);
		gwtC25.setArrivalDate("17 June, 1833");
		gwtC25.setDepartDate("18 June, 1833");
		
		GWTContact gwtC26 = GWTContact.createGWTContact("Milan");
		gwtC26.setCountry("Italy");
		gwtC26.setLocation("Milan");
		gwtC26.setLongitude(9.183058);
		gwtC26.setLatitude(45.38364);
		gwtC26.setArrivalDate("18 June, 1833");
		gwtC26.setDepartDate("20 June, 1833");
		
		GWTContact gwtC27 = GWTContact.createGWTContact("Pavia");
		gwtC27.setCountry("Italy");
		gwtC27.setLocation("Pavia");
		gwtC27.setLongitude(9.16145);
		gwtC27.setLatitude(45.18446);
		gwtC27.setArrivalDate("20 June, 1833");
		gwtC27.setDepartDate("21 June, 1833");
		
		GWTContact gwtC28 = GWTContact.createGWTContact("Novi");
		gwtC28.setCountry("Italy");
		gwtC28.setLocation("Novi");
		gwtC28.setLongitude(8.787);
		gwtC28.setLatitude(44.76246);
		gwtC28.setArrivalDate("21 June, 1833");
		gwtC28.setDepartDate("22 June, 1833");
		
		GWTContact gwtC29 = GWTContact.createGWTContact("Genoa");
		gwtC29.setCountry("Italy");
		gwtC29.setLocation("Genoa");
		gwtC29.setLongitude(8.95729);
		gwtC29.setLatitude(44.41286);
		gwtC29.setArrivalDate("22 June, 1833");
		gwtC29.setDepartDate("25 June, 1833");
		
		GWTContact gwtC30 = GWTContact.createGWTContact("Alexandria");
		gwtC30.setCountry("Italy");
		gwtC30.setLocation("Alexandria");
		gwtC30.setLongitude(8.61);
		gwtC30.setLatitude(44.9);
		gwtC30.setArrivalDate("25 June, 1833");
		gwtC30.setDepartDate("26 June, 1833");
		
		GWTContact gwtC31 = GWTContact.createGWTContact("Turin");
		gwtC31.setCountry("Italy");
		gwtC31.setLocation("Turin");
		gwtC31.setLongitude(7.73357);
		gwtC31.setLatitude(45.21154);
		gwtC31.setArrivalDate("26 June, 1833");
		gwtC31.setDepartDate("1 July, 1833");
		
		GWTContact gwtC32 = GWTContact.createGWTContact("Navaro");
		gwtC32.setCountry("Italy");
		gwtC32.setLocation("Navaro");
		gwtC32.setLongitude(8.62328);
		gwtC32.setLatitude(45.44834);
		gwtC32.setArrivalDate("1 July, 1833");
		gwtC32.setDepartDate("2 July, 1833");
		
		GWTContact gwtC33 = GWTContact.createGWTContact("Arona");
		gwtC33.setCountry("Italy");
		gwtC33.setLocation("Arona");
		gwtC33.setLongitude(8.55715);
		gwtC33.setLatitude(45.7589);
		gwtC33.setArrivalDate("2 July, 1833");
		gwtC33.setDepartDate("4 July, 1833");
		
		GWTContact gwtC34 = GWTContact.createGWTContact("Duomo d'Ossala");
		gwtC34.setCountry("Italy");
		gwtC34.setLocation("Duomo d'Ossala");
		gwtC34.setLongitude(8.29313);
		gwtC34.setLatitude(46.1165);
		gwtC34.setArrivalDate("4 July, 1833");
		gwtC34.setDepartDate("5 July, 1833");
		
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
		list.add(gwtC12);
		list.add(gwtC13);
		list.add(gwtC14);
		list.add(gwtC15);
		list.add(gwtC16);
		list.add(gwtC17);
		list.add(gwtC18);
		list.add(gwtC19);
		list.add(gwtC20);
		list.add(gwtC21);
		list.add(gwtC22);
		list.add(gwtC23);
		list.add(gwtC24);
		list.add(gwtC25);
		list.add(gwtC26);
		list.add(gwtC27);
		list.add(gwtC28);
		list.add(gwtC29);
		list.add(gwtC30);
		list.add(gwtC31);
		list.add(gwtC32);
		list.add(gwtC33);
		list.add(gwtC34);
		
		return list;
	}
	
	public static GWTContact getContact(String id) {
		GWTContact c = new GWTContact();
		int location = -1;
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getId().matches(id)) {
				location = i;
			}
		}
		if(location >=0 ) {
			return list.get(location);
		}
		return c;
	}
	
	public static ReducedContact getReducedContact(int location) {
		ReducedContact c = new ReducedContact(list.get(location).getId(), list.get(location).getLongitude(), list.get(location).getLatitude());
		return c;
	}

	public static int getSize() {
		return list.size();
	}

}

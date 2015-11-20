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
		
		GWTPassThrough gwtC12 = GWTPassThrough.createGWTPassThrough("Pont a Trissins");
		gwtC12.setReference("Brussels");
		gwtC12.setCountry("Belgium");
		gwtC12.setLocation("Pont a Trissins");
		gwtC12.setLongitude(3.19354);
		gwtC12.setLatitude(50.6175);
		
		GWTPassThrough gwtC13 = GWTPassThrough.createGWTPassThrough("Tournay");
		gwtC13.setReference("Brussels");
		gwtC13.setCountry("Belgium");
		gwtC13.setLocation("Tournay");
		gwtC13.setLongitude(3.38932);
		gwtC13.setLatitude(50.60715);
		
		GWTPassThrough gwtC14 = GWTPassThrough.createGWTPassThrough("Leuse");
		gwtC14.setReference("Brussels");
		gwtC14.setCountry("Belgium");
		gwtC14.setLocation("Leuse");
		gwtC14.setLongitude(3.6);
		gwtC14.setLatitude(50.6);
		
		GWTPassThrough gwtC15 = GWTPassThrough.createGWTPassThrough("Ath");
		gwtC15.setReference("Brussels");
		gwtC15.setCountry("Belgium");
		gwtC15.setLocation("Ath");
		gwtC15.setLongitude(3.77801);
		gwtC15.setLatitude(50.62937);
		
		GWTPassThrough gwtC16 = GWTPassThrough.createGWTPassThrough("Enghien");
		gwtC16.setReference("Brussels");
		gwtC16.setCountry("Belgium");
		gwtC16.setLocation("Enghien");
		gwtC16.setLongitude(4.03284);
		gwtC16.setLatitude(50.68373);
		
		GWTPassThrough gwtC17 = GWTPassThrough.createGWTPassThrough("Hal");
		gwtC17.setReference("Brussels");
		gwtC17.setCountry("Belgium");
		gwtC17.setLocation("Hal");
		gwtC17.setLongitude(4.23454);
		gwtC17.setLatitude(50.73385);
		
		GWTPassThrough gwtC18 = GWTPassThrough.createGWTPassThrough("Waterloo");
		gwtC18.setReference("Namur");
		gwtC18.setCountry("Belgium");
		gwtC18.setLocation("Waterloo");
		gwtC18.setLongitude(4.3991);
		gwtC18.setLatitude(50.71469);
		
		GWTPassThrough gwtC19 = GWTPassThrough.createGWTPassThrough("Genappe");
		gwtC19.setReference("Namur");
		gwtC19.setCountry("Belgium");
		gwtC19.setLocation("Genappe");
		gwtC19.setLongitude(4.45152);
		gwtC19.setLatitude(50.61173);
		
		GWTPassThrough gwtC20 = GWTPassThrough.createGWTPassThrough("Sombref");
		gwtC20.setReference("Namur");
		gwtC20.setCountry("Belgium");
		gwtC20.setLocation("Sombref");
		gwtC20.setLongitude(4.60087);
		gwtC20.setLatitude(50.52865);
		
		GWTPassThrough gwtC21 = GWTPassThrough.createGWTPassThrough("Huy");
		gwtC21.setReference("Spa");
		gwtC21.setCountry("Belgium");
		gwtC21.setLocation("Huy");
		gwtC21.setLongitude(5.26284);
		gwtC21.setLatitude(50.51894);
		
		GWTPassThrough gwtC22 = GWTPassThrough.createGWTPassThrough("Liege");
		gwtC22.setReference("Spa");
		gwtC22.setCountry("Belgium");
		gwtC22.setLocation("Liege");
		gwtC22.setLongitude(5.56749);
		gwtC22.setLatitude(50.63373);
		
		GWTPassThrough gwtC23 = GWTPassThrough.createGWTPassThrough("Viviers");
		gwtC23.setReference("Aix-la-Chapelle");
		gwtC23.setCountry("Belgium");
		gwtC23.setLocation("Viviers");
		gwtC23.setLongitude(5.86241);
		gwtC23.setLatitude(50.58907);
		
		GWTPassThrough gwtC24 = GWTPassThrough.createGWTPassThrough("Juilieres");
		gwtC24.setReference("Cologne");
		gwtC24.setCountry("Germany");
		gwtC24.setLocation("Juilieres");
		
		GWTPassThrough gwtC25 = GWTPassThrough.createGWTPassThrough("Bonn");
		gwtC25.setReference("Andernach");
		gwtC25.setCountry("Germany");
		gwtC25.setLocation("Bonn");
		
		GWTPassThrough gwtC26 = GWTPassThrough.createGWTPassThrough("Godesberg");
		gwtC26.setReference("Andernach");
		gwtC26.setCountry("Germany");
		gwtC26.setLocation("Godesberg");
		
		GWTPassThrough gwtC27 = GWTPassThrough.createGWTPassThrough("Rimagen");
		gwtC27.setReference("Andernach");
		gwtC27.setCountry("Germany");
		gwtC27.setLocation("Rimagen");
		
		GWTPassThrough gwtC28 = GWTPassThrough.createGWTPassThrough("Ruins of Godesberg");
		gwtC28.setReference("Andernach");
		gwtC28.setCountry("Germany");
		gwtC28.setLocation("Ruins of Godesberg");
		
		GWTPassThrough gwtC29 = GWTPassThrough.createGWTPassThrough("Drachenfels");
		gwtC29.setReference("Andernach");
		gwtC29.setCountry("Germany");
		gwtC29.setLocation("Drachenfels");
		
		GWTPassThrough gwtC30 = GWTPassThrough.createGWTPassThrough("Rolandseck");
		gwtC30.setReference("Andernach");
		gwtC30.setCountry("Germany");
		gwtC30.setLocation("Rolandseck");
		
		GWTPassThrough gwtC31 = GWTPassThrough.createGWTPassThrough("Ruins of Appenfels");
		gwtC31.setReference("Andernach");
		gwtC31.setCountry("Germany");
		gwtC31.setLocation("Ruins of Appenfels");
		
		GWTPassThrough gwtC32 = GWTPassThrough.createGWTPassThrough("Castle of Rheineck");
		gwtC32.setReference("Andernach");
		gwtC32.setCountry("Germany");
		gwtC32.setLocation("Castle of Rheineck");
		
		GWTPassThrough gwtC33 = GWTPassThrough.createGWTPassThrough("Ruins of Hammerstein");
		gwtC33.setReference("Andernach");
		gwtC33.setCountry("Germany");
		gwtC33.setLocation("Ruins of Hammerstein");
		
		GWTPassThrough gwtC34 = GWTPassThrough.createGWTPassThrough("Ruins of Sain");
		gwtC34.setReference("Coblentz(Koblenz)");
		gwtC34.setCountry("Germany");
		gwtC34.setLocation("Ruins of Sain");
		
		GWTPassThrough gwtC35 = GWTPassThrough.createGWTPassThrough("Fort Francis/Petersburgh");
		gwtC35.setReference("Coblentz(Koblenz)");
		gwtC35.setCountry("Germany");
		gwtC35.setLocation("Fort Francis/Petersburgh");
		
		GWTPassThrough gwtC36 = GWTPassThrough.createGWTPassThrough("Ehrenbreitstein(Fortress)");
		gwtC36.setReference("Coblentz(Koblenz)");
		gwtC36.setCountry("Germany");
		gwtC36.setLocation("Ehrenbreitstein(Fortress)");
		
		GWTPassThrough gwtC37 = GWTPassThrough.createGWTPassThrough("Porte de Mayence");
		gwtC37.setReference("Bingen");
		gwtC37.setCountry("Germany");
		gwtC37.setLocation("Porte de Mayence");
		
		GWTPassThrough gwtC38 = GWTPassThrough.createGWTPassThrough("Boppart");
		gwtC38.setReference("Bingen");
		gwtC38.setCountry("Germany");
		gwtC38.setLocation("Boppart");
		
		GWTPassThrough gwtC39 = GWTPassThrough.createGWTPassThrough("St. Goar");
		gwtC39.setReference("Bingen");
		gwtC39.setCountry("Germany");
		gwtC39.setLocation("St. Goar");
		
		GWTPassThrough gwtC40 = GWTPassThrough.createGWTPassThrough("Bacharah");
		gwtC40.setReference("Bingen");
		gwtC40.setCountry("Germany");
		gwtC40.setLocation("Bacharah");
		
		GWTPassThrough gwtC41 = GWTPassThrough.createGWTPassThrough("Ruins of Holzenfels");
		gwtC41.setReference("Bingen");
		gwtC41.setCountry("Germany");
		gwtC41.setLocation("Ruins of Holzenfels");
		
		GWTPassThrough gwtC42 = GWTPassThrough.createGWTPassThrough("Lahneck");
		gwtC42.setReference("Bingen");
		gwtC42.setCountry("Germany");
		gwtC42.setLocation("Lahneck");
		
		GWTPassThrough gwtC43 = GWTPassThrough.createGWTPassThrough("Marksberg");
		gwtC43.setReference("Bingen");
		gwtC43.setCountry("Germany");
		gwtC43.setLocation("Marksberg");
		
		GWTPassThrough gwtC44 = GWTPassThrough.createGWTPassThrough("Sternberg");
		gwtC44.setReference("Bingen");
		gwtC44.setCountry("Germany");
		gwtC44.setLocation("Sternberg");
		
		GWTPassThrough gwtC45 = GWTPassThrough.createGWTPassThrough("Leibenstein");
		gwtC45.setReference("Bingen");
		gwtC45.setCountry("Germany");
		gwtC45.setLocation("Leibenstein");
		
		GWTPassThrough gwtC46 = GWTPassThrough.createGWTPassThrough("Thurnberg");
		gwtC46.setReference("Bingen");
		gwtC46.setCountry("Germany");
		gwtC46.setLocation("Thurnberg");
		
		GWTPassThrough gwtC47 = GWTPassThrough.createGWTPassThrough("'The Cat' Ruins");
		gwtC47.setReference("Bingen");
		gwtC47.setCountry("Germany");
		gwtC47.setLocation("'The Cat' Ruins");
		
		GWTPassThrough gwtC48 = GWTPassThrough.createGWTPassThrough("Schonberg");
		gwtC48.setReference("Bingen");
		gwtC48.setCountry("Germany");
		gwtC48.setLocation("Schonberg");
		
		GWTPassThrough gwtC49 = GWTPassThrough.createGWTPassThrough("Rheinfels");
		gwtC49.setReference("Bingen");
		gwtC49.setCountry("Germany");
		gwtC49.setLocation("Rheinfels");
		
		GWTPassThrough gwtC50 = GWTPassThrough.createGWTPassThrough("'A dismanteled fortification'");
		gwtC50.setReference("Bingen");
		gwtC50.setCountry("Germany");
		gwtC50.setLocation("'A dismanteled fortification'");
		
		GWTPassThrough gwtC51 = GWTPassThrough.createGWTPassThrough("Antenfels");
		gwtC51.setReference("Bingen");
		gwtC51.setCountry("Germany");
		gwtC51.setLocation("Antenfels");
		
		GWTPassThrough gwtC52 = GWTPassThrough.createGWTPassThrough("Stahleck");
		gwtC52.setReference("Bingen");
		gwtC52.setCountry("Germany");
		gwtC52.setLocation("Stahleck");
		
		GWTPassThrough gwtC53 = GWTPassThrough.createGWTPassThrough("Firstenberg");
		gwtC53.setReference("Bingen");
		gwtC53.setCountry("Germany");
		gwtC53.setLocation("Firstenberg");
		
		GWTPassThrough gwtC54 = GWTPassThrough.createGWTPassThrough("Mollingen");
		gwtC54.setReference("Bingen");
		gwtC54.setCountry("Germany");
		gwtC54.setLocation("Mollingen");
		
		GWTPassThrough gwtC55 = GWTPassThrough.createGWTPassThrough("Sonneck");
		gwtC55.setReference("Bingen");
		gwtC55.setCountry("Germany");
		gwtC55.setLocation("Sonneck");
		
		GWTPassThrough gwtC56 = GWTPassThrough.createGWTPassThrough("Helmburgh");
		gwtC56.setReference("Bingen");
		gwtC56.setCountry("Germany");
		gwtC56.setLocation("Helmburgh");
		
		GWTPassThrough gwtC57 = GWTPassThrough.createGWTPassThrough("Falkenberg");
		gwtC57.setReference("Bingen");
		gwtC57.setCountry("Germany");
		gwtC57.setLocation("Falkenberg");
		
		GWTPassThrough gwtC58 = GWTPassThrough.createGWTPassThrough("Rheinsten");
		gwtC58.setReference("Bingen");
		gwtC58.setCountry("Germany");
		gwtC58.setLocation("Rheinsten");
		
		GWTPassThrough gwtC59 = GWTPassThrough.createGWTPassThrough("Vauersberg");
		gwtC59.setReference("Bingen");
		gwtC59.setCountry("Germany");
		gwtC59.setLocation("Vauersberg");
		
		GWTPassThrough gwtC60 = GWTPassThrough.createGWTPassThrough("Ehrenfels");
		gwtC60.setReference("Bingen");
		gwtC60.setCountry("Germany");
		gwtC60.setLocation("Ehrenfels");
		
		
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
		list.add(gwtC35);
		list.add(gwtC36);
		list.add(gwtC37);
		list.add(gwtC38);
		list.add(gwtC39);
		list.add(gwtC40);
		list.add(gwtC41);
		list.add(gwtC42);
		list.add(gwtC43);
		list.add(gwtC44);
		list.add(gwtC45);
		list.add(gwtC46);
		list.add(gwtC47);
		list.add(gwtC48);
		list.add(gwtC49);
		list.add(gwtC50);
		list.add(gwtC51);
		list.add(gwtC52);
		list.add(gwtC53);
		list.add(gwtC54);
		list.add(gwtC55);
		list.add(gwtC56);
		list.add(gwtC57);
		list.add(gwtC58);
		list.add(gwtC59);
		list.add(gwtC60);
//		list.add(gwtC61);
//		list.add(gwtC62);
//		list.add(gwtC63);
//		list.add(gwtC64);
//		list.add(gwtC65);
//		list.add(gwtC66);
//		list.add(gwtC67);
//		list.add(gwtC68);
//		list.add(gwtC69);
		
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

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
		gwtC4.setSights("Rochester Castle");
		
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
		gwtC13.setSights("Tournay");
		
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
		gwtC18.setSights("Church, Battle Sight");
		
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
		gwtC22.setSights("Cathedral, Spaniard 'old' church, Bishop's Palace");
		
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
		gwtC25.setSights("College, Church on Hill");
		
		GWTPassThrough gwtC26 = GWTPassThrough.createGWTPassThrough("Godesberg");
		gwtC26.setReference("Andernach");
		gwtC26.setCountry("Germany");
		gwtC26.setLocation("Godesberg");
		gwtC26.setSights("Ruins");
		
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
		
		GWTPassThrough gwtC61 = GWTPassThrough.createGWTPassThrough("Nieder Ingelheim");
		gwtC61.setReference("Mayence");
		gwtC61.setCountry("Germany");
		gwtC61.setLocation("Nieder Ingelheim");
		
		GWTPassThrough gwtC62 = GWTPassThrough.createGWTPassThrough("Wiesbaden");
		gwtC62.setReference("Frankfurt");
		gwtC62.setCountry("Germany");
		gwtC62.setLocation("Wiesbaden");
		
		GWTPassThrough gwtC63 = GWTPassThrough.createGWTPassThrough("Langen");
		gwtC63.setReference("Heidelberg");
		gwtC63.setCountry("Germany");
		gwtC63.setLocation("Langen");
		
		GWTPassThrough gwtC64 = GWTPassThrough.createGWTPassThrough("Darmstadt");
		gwtC64.setReference("Heidelberg");
		gwtC64.setCountry("Germany");
		gwtC64.setLocation("Darmstadt");
		
		GWTPassThrough gwtC65 = GWTPassThrough.createGWTPassThrough("Biekenbach");
		gwtC65.setReference("Heidelberg");
		gwtC65.setCountry("Germany");
		gwtC65.setLocation("Biekenbach");
		
		GWTPassThrough gwtC66 = GWTPassThrough.createGWTPassThrough("Happenheim");
		gwtC66.setReference("Heidelberg");
		gwtC66.setCountry("Germany");
		gwtC66.setLocation("Happenheim");
		
		GWTPassThrough gwtC67 = GWTPassThrough.createGWTPassThrough("Weinham");
		gwtC67.setReference("Heidelberg");
		gwtC67.setCountry("Germany");
		gwtC67.setLocation("Weinham");
		
		GWTPassThrough gwtC68 = GWTPassThrough.createGWTPassThrough("Weisloch");
		gwtC68.setReference("Carlsruhe");
		gwtC68.setCountry("Germany");
		gwtC68.setLocation("Weisloch");
		
		GWTPassThrough gwtC69 = GWTPassThrough.createGWTPassThrough("Brucksal");
		gwtC69.setReference("Carlsruhe");
		gwtC69.setCountry("Germany");
		gwtC69.setLocation("Brucksal");
		
		GWTPassThrough gwtC70 = GWTPassThrough.createGWTPassThrough("Ettligen");
		gwtC70.setReference("Kehl");
		gwtC70.setCountry("Germany");
		gwtC70.setLocation("Ettligen");
		
		GWTPassThrough gwtC71 = GWTPassThrough.createGWTPassThrough("Bastad");
		gwtC71.setReference("Kehl");
		gwtC71.setCountry("Germany");
		gwtC71.setLocation("Bastad");
		
		GWTPassThrough gwtC72 = GWTPassThrough.createGWTPassThrough("Baden");
		gwtC72.setReference("Kehl");
		gwtC72.setCountry("Germany");
		gwtC72.setLocation("Baden");
		
		GWTPassThrough gwtC73 = GWTPassThrough.createGWTPassThrough("Stolshofen");
		gwtC73.setReference("Kehl");
		gwtC73.setCountry("Germany");
		gwtC73.setLocation("Stolshofen");
		
		GWTPassThrough gwtC74 = GWTPassThrough.createGWTPassThrough("Bishoffsheim");
		gwtC74.setReference("Kehl");
		gwtC74.setCountry("Germany");
		gwtC74.setLocation("Bishoffsheim");
		
		GWTPassThrough gwtC75 = GWTPassThrough.createGWTPassThrough("Offenbourg");
		gwtC75.setReference("Schaffhausen");
		gwtC75.setCountry("Germany");
		gwtC75.setLocation("Offenbourg");
		
		GWTPassThrough gwtC76 = GWTPassThrough.createGWTPassThrough("Biberach");
		gwtC76.setReference("Schaffhausen");
		gwtC76.setCountry("Germany");
		gwtC76.setLocation("Biberach");
		
		GWTPassThrough gwtC77 = GWTPassThrough.createGWTPassThrough("Hausach");
		gwtC77.setReference("Schaffhausen");
		gwtC77.setCountry("Germany");
		gwtC77.setLocation("Hausach");
		
		GWTPassThrough gwtC78 = GWTPassThrough.createGWTPassThrough("Hornberg");
		gwtC78.setReference("Schaffhausen");
		gwtC78.setCountry("Germany");
		gwtC78.setLocation("Hornberg");
		
		GWTPassThrough gwtC79 = GWTPassThrough.createGWTPassThrough("Schittach");
		gwtC79.setReference("Schaffhausen");
		gwtC79.setCountry("Germany");
		gwtC79.setLocation("Schittach");
		
		GWTPassThrough gwtC80 = GWTPassThrough.createGWTPassThrough("Villengen");
		gwtC80.setReference("Schaffhausen");
		gwtC80.setCountry("Germany");
		gwtC80.setLocation("Villengen");
		
		GWTPassThrough gwtC81 = GWTPassThrough.createGWTPassThrough("Donauschingen");
		gwtC81.setReference("Schaffhausen");
		gwtC81.setCountry("Germany");
		gwtC81.setLocation("Donauschingen");
		
		GWTPassThrough gwtC82 = GWTPassThrough.createGWTPassThrough("Blonberg");
		gwtC82.setReference("Schaffhausen");
		gwtC82.setCountry("Switzerland");
		gwtC82.setLocation("Blonberg");
		
		GWTPassThrough gwtC83 = GWTPassThrough.createGWTPassThrough("Rorschach");
		gwtC83.setReference("Pfeffers");
		gwtC83.setCountry("Switzerland");
		gwtC83.setLocation("Rorschach");
		gwtC83.setLongitude(9.4903);
		gwtC83.setLatitude(47.478);
		
		GWTPassThrough gwtC84 = GWTPassThrough.createGWTPassThrough("Wirtenberg(Werdenberg)");
		gwtC84.setReference("Pfeffers");
		gwtC84.setCountry("Switzerland");
		gwtC84.setLocation("Wirtenberg(Werdenberg)");
		gwtC84.setLongitude(9.45494);
		gwtC84.setLatitude(47.16976);
		
		GWTPassThrough gwtC85 = GWTPassThrough.createGWTPassThrough("Sargens");
		gwtC85.setReference("Pfeffers");
		gwtC85.setCountry("Switzerland");
		gwtC85.setLocation("Sargens");
		gwtC85.setLongitude(9.44103);
		gwtC85.setLatitude(47.04896);
		
		GWTPassThrough gwtC86 = GWTPassThrough.createGWTPassThrough("Sargens");
		gwtC86.setReference("Coire");
		gwtC86.setCountry("Switzerland");
		gwtC86.setLocation("Sargens");
		gwtC86.setLongitude(9.44103);
		gwtC86.setLatitude(47.04896);
		
		GWTPassThrough gwtC87 = GWTPassThrough.createGWTPassThrough("Splugen(Mt. pass)");
		gwtC87.setReference("Chiavenna");
		gwtC87.setCountry("Switzerland");
		gwtC87.setLocation("Splugen(Mt. pass)");
		
		GWTPassThrough gwtC88 = GWTPassThrough.createGWTPassThrough("Pass of Via Mala");
		gwtC88.setReference("Chiavenna");
		gwtC88.setCountry("Switzerland");
		gwtC88.setLocation("Pass of Via Mala");
		gwtC88.setLongitude(9.44694);
		gwtC88.setLatitude(46.66098);
		
		GWTPassThrough gwtC89 = GWTPassThrough.createGWTPassThrough("Splugen(village)");
		gwtC89.setReference("Chiavenna");
		gwtC89.setCountry("Switzerland");
		gwtC89.setLocation("Splugen(village)");
		gwtC89.setLongitude(9.3231);
		gwtC89.setLatitude(46.5531);
		
		GWTPassThrough gwtC90 = GWTPassThrough.createGWTPassThrough("Riva");
		gwtC90.setReference("Cadenabbia");
		gwtC90.setCountry("Italy");
		gwtC90.setLocation("Riva");
		gwtC90.setLongitude(9.43417);
		gwtC90.setLatitude(46.23691);
		
		GWTPassThrough gwtC91 = GWTPassThrough.createGWTPassThrough("Dimaso");
		gwtC91.setReference("Cadenabbia");
		gwtC91.setCountry("Italy");
		gwtC91.setLocation("Dimaso");
		gwtC91.setLongitude(9.3315);
		gwtC91.setLatitude(46.15284);
		
		GWTPassThrough gwtC92 = GWTPassThrough.createGWTPassThrough("Novi");
		gwtC92.setReference("Alexandria");
		gwtC92.setCountry("Italy");
		gwtC92.setLocation("Novi");
		gwtC92.setLongitude(8.787);
		gwtC92.setLatitude(44.76246);
		
		GWTPassThrough gwtC93 = GWTPassThrough.createGWTPassThrough("Marengo");
		gwtC93.setReference("Turin");
		gwtC93.setCountry("Italy");
		gwtC93.setLocation("Marengo");
		gwtC93.setLongitude(8.67691);
		gwtC93.setLatitude(44.88859);
		
		GWTPassThrough gwtC94 = GWTPassThrough.createGWTPassThrough("Nagero");
		gwtC94.setReference("Arona");
		gwtC94.setCountry("Italy");
		gwtC94.setLocation("Nagero");
		gwtC94.setLongitude(8.57861);
		gwtC94.setLatitude(45.77555);
		
		GWTPassThrough gwtC95 = GWTPassThrough.createGWTPassThrough("Varesa");
		gwtC95.setReference("Arona");
		gwtC95.setCountry("Italy");
		gwtC95.setLocation("Varesa");
		gwtC95.setLongitude(8.82511);
		gwtC95.setLatitude(45.82058);
		
		GWTPassThrough gwtC136 = GWTPassThrough.createGWTPassThrough("Borromean Islands");
		gwtC136.setReference("Duomo d'Ossala");
		gwtC136.setCountry("Italy");
		gwtC136.setLocation("Borromean Islands");
		gwtC136.setSights("Isola Bella, Palace of Borromean Family");
		
		GWTPassThrough gwtC96 = GWTPassThrough.createGWTPassThrough("Sa Madre");
		gwtC96.setReference("Duomo d'Ossala");
		gwtC96.setCountry("Italy");
		gwtC96.setLocation("Sa Madre");
		gwtC96.setLongitude(8.53809);
		gwtC96.setLatitude(45.91169);
		
		GWTPassThrough gwtC97 = GWTPassThrough.createGWTPassThrough("Bavenna");
		gwtC97.setReference("Duomo d'Ossala");
		gwtC97.setCountry("Italy");
		gwtC97.setLocation("Bavenna");
		gwtC97.setLongitude(8.50033);
		gwtC97.setLatitude(45.90818);
		
		GWTPassThrough gwtC98 = GWTPassThrough.createGWTPassThrough("Village of Simplon");
		gwtC98.setReference("Sion");
		gwtC98.setCountry("Switzerland");
		gwtC98.setLocation("Village of Simplon");
		
		GWTPassThrough gwtC99 = GWTPassThrough.createGWTPassThrough("St. Bernard");
		gwtC99.setReference("Sion");
		gwtC99.setCountry("Switzerland");
		gwtC99.setLocation("St. Bernard");
		
		GWTPassThrough gwtC100 = GWTPassThrough.createGWTPassThrough("Brigg");
		gwtC100.setReference("Sion");
		gwtC100.setCountry("Switzerland");
		gwtC100.setLocation("Brigg");
		gwtC100.setSights("Brigg ('Seen from far away')");
		
		GWTPassThrough gwtC137 = GWTPassThrough.createGWTPassThrough("Pissevache");
		gwtC137.setReference("Matigny");
		gwtC137.setCountry("Switzerland");
		gwtC137.setLocation("Pissevache");
		gwtC137.setSights("Waterfall");
		
		GWTPassThrough gwtC101 = GWTPassThrough.createGWTPassThrough("Liddes");
		gwtC101.setReference("St. Bernard Convent");
		gwtC101.setCountry("Switzerland");
		gwtC101.setLocation("Liddes");
		
		GWTPassThrough gwtC102 = GWTPassThrough.createGWTPassThrough("Chillon");
		gwtC102.setReference("Lausanne");
		gwtC102.setCountry("Switzerland");
		gwtC102.setLocation("Chillon");
		
		GWTPassThrough gwtC103 = GWTPassThrough.createGWTPassThrough("Vevay");
		gwtC103.setReference("Lausanne");
		gwtC103.setCountry("Switzerland");
		gwtC103.setLocation("Vevay");
		
		GWTPassThrough gwtC104 = GWTPassThrough.createGWTPassThrough("Moudon");
		gwtC104.setReference("Fribourg");
		gwtC104.setCountry("Switzerland");
		gwtC104.setLocation("Moudon");
		
		GWTPassThrough gwtC105 = GWTPassThrough.createGWTPassThrough("Payerne");
		gwtC105.setReference("Fribourg");
		gwtC105.setCountry("Switzerland");
		gwtC105.setLocation("Payerne");
		
		GWTPassThrough gwtC106 = GWTPassThrough.createGWTPassThrough("Thun");
		gwtC106.setReference("Interlaken");
		gwtC106.setCountry("Switzerland");
		gwtC106.setLocation("Thun");
		gwtC106.setSights("view of Alps and Jungfrau leaving Berne");
		
		GWTPassThrough gwtC107 = GWTPassThrough.createGWTPassThrough("Newhouse(Neuhaus)");
		gwtC107.setReference("Interlaken");
		gwtC107.setCountry("Switzerland");
		gwtC107.setLocation("Newhouse(Neuhaus)");
		gwtC107.setSights("left carriage at Freyerhof Inn and rowed 3 hours to Neuhaus, "
				+ "and 1 league in char a banc through Unterseen to Interlaken");
		
		GWTPassThrough gwtC108 = GWTPassThrough.createGWTPassThrough("Thun");
		gwtC108.setReference("Berne");
		gwtC108.setCountry("Switzerland");
		gwtC108.setLocation("Thun");
		
		GWTPassThrough gwtC109 = GWTPassThrough.createGWTPassThrough("Worb");
		gwtC109.setReference("Sursees");
		gwtC109.setCountry("Switzerland");
		gwtC109.setLocation("Worb");
		
		GWTPassThrough gwtC110 = GWTPassThrough.createGWTPassThrough("Walkringen");
		gwtC110.setReference("Sursees");
		gwtC110.setCountry("Switzerland");
		gwtC110.setLocation("Walkringen");
		
		GWTPassThrough gwtC111 = GWTPassThrough.createGWTPassThrough("Lumiswald");
		gwtC111.setReference("Sursees");
		gwtC111.setCountry("Switzerland");
		gwtC111.setLocation("Lumiswald");
		
		GWTPassThrough gwtC112 = GWTPassThrough.createGWTPassThrough("Sommiswald");
		gwtC112.setReference("Sursees");
		gwtC112.setCountry("Switzerland");
		gwtC112.setLocation("Sommiswald");
		
		GWTPassThrough gwtC113 = GWTPassThrough.createGWTPassThrough("Hutwyl/Hutwill");
		gwtC113.setReference("Sursees");
		gwtC113.setCountry("Switzerland");
		gwtC113.setLocation("Hutwyl/Hutwill");
		
		GWTPassThrough gwtC114 = GWTPassThrough.createGWTPassThrough("Kussnacht");
		gwtC114.setReference("Arth");
		gwtC114.setCountry("Switzerland");
		gwtC114.setLocation("Kussnacht");
		gwtC114.setSights("intended to ascend Righi but raining; continuing along sides of hills" 
		+ " bordering Lucerne Lake and then along edge of Zug");
		
		GWTPassThrough gwtC115 = GWTPassThrough.createGWTPassThrough("Righi");
		gwtC115.setReference("Arth");
		gwtC115.setCountry("Switzerland");
		gwtC115.setLocation("Righi");
		gwtC115.setSights("Staffel Inn to Cuim");
		
		GWTPassThrough gwtC116 = GWTPassThrough.createGWTPassThrough("Staffel");
		gwtC116.setReference("Arth");
		gwtC116.setCountry("Switzerland");
		gwtC116.setLocation("Staffel");
		
		GWTPassThrough gwtC117 = GWTPassThrough.createGWTPassThrough("Schwyz");
		gwtC117.setReference("Einsiedeln");
		gwtC117.setCountry("Switzerland");
		gwtC117.setLocation("Schwyz");
		gwtC117.setSights("vale below Mytten Berg; site of disaster Sept 1806" 
		+ " rock slide covering village Lake Lowerz");
		
		GWTPassThrough gwtC118 = GWTPassThrough.createGWTPassThrough("Stein");
		gwtC118.setReference("Basel");
		gwtC118.setCountry("Switzerland");
		gwtC118.setLocation("Stein");
		
		GWTPassThrough gwtC119 = GWTPassThrough.createGWTPassThrough("Rheinfell");
		gwtC119.setReference("Basel");
		gwtC119.setCountry("Switzerland");
		gwtC119.setLocation("Rheinfell");
		
		GWTPassThrough gwtC120 = GWTPassThrough.createGWTPassThrough("Luckstall");
		gwtC120.setReference("Bienne");
		gwtC120.setCountry("Switzerland");
		gwtC120.setLocation("Luckstall");
		gwtC120.setSights("barricades for battle");
		
		GWTPassThrough gwtC121 = GWTPassThrough.createGWTPassThrough("Ballstadt");
		gwtC121.setReference("Bienne");
		gwtC121.setCountry("Switzerland");
		gwtC121.setLocation("Ballstadt");
		gwtC121.setSights("Ruins of Castle in Hills");
		
		GWTPassThrough gwtC122 = GWTPassThrough.createGWTPassThrough("Soleure");
		gwtC122.setReference("Bienne");
		gwtC122.setCountry("Switzerland");
		gwtC122.setLocation("Soleure");
		gwtC122.setSights("Roman Tower");
		
		GWTPassThrough gwtC123 = GWTPassThrough.createGWTPassThrough("Iverdon/Yverdon");
		gwtC123.setReference("Morges");
		gwtC123.setCountry("Switzerland");
		gwtC123.setLocation("Iverdon/Yverdon");
		
		GWTPassThrough gwtC124 = GWTPassThrough.createGWTPassThrough("Orges");
		gwtC124.setReference("Morges");
		gwtC124.setCountry("Switzerland");
		gwtC124.setLocation("Orges");
		
		GWTPassThrough gwtC125 = GWTPassThrough.createGWTPassThrough("Orbe");
		gwtC125.setReference("Morges");
		gwtC125.setCountry("Switzerland");
		gwtC125.setLocation("Orbe");
		
		GWTPassThrough gwtC126 = GWTPassThrough.createGWTPassThrough("Montavert/Mer de Glace");
		gwtC126.setReference("Chamouni");
		gwtC126.setCountry("France");
		gwtC126.setLocation("Montavert/Mer de Glace");
		gwtC126.setLongitude(6.844449);
		gwtC126.setLatitude(45.90375);
		
		GWTPassThrough gwtC127 = GWTPassThrough.createGWTPassThrough("Vale of Chamonix");
		gwtC127.setReference("Chamouni");
		gwtC127.setCountry("France");
		gwtC127.setLocation("Vale of Chamonix");
		gwtC127.setLongitude(6.865575);
		gwtC127.setLatitude(45.832119);
		gwtC127.setSights("Mer de Glace");
		
		GWTPassThrough gwtC128 = GWTPassThrough.createGWTPassThrough("Martigny");
		gwtC128.setReference("Geneva");
		gwtC128.setCountry("Switzerland");
		gwtC128.setLocation("Martigny");
		
		GWTPassThrough gwtC129 = GWTPassThrough.createGWTPassThrough("Sallanches");
		gwtC129.setReference("Geneva");
		gwtC129.setCountry("Switzerland");
		gwtC129.setLocation("Sallanches");
		
		GWTPassThrough gwtC130 = GWTPassThrough.createGWTPassThrough("Jura Mountains");
		gwtC130.setReference("Nantua");
		gwtC130.setCountry("France");
		gwtC130.setLocation("Jura Mountains");
		gwtC130.setLongitude(7);
		gwtC130.setLatitude(47.16667);
		gwtC130.setSights("Fort, Perti du Thone, customs on border of France");
		
		GWTPassThrough gwtC131 = GWTPassThrough.createGWTPassThrough("Villefranche");
		gwtC131.setReference("Chalons sur Saone");
		gwtC131.setCountry("France");
		gwtC131.setLocation("Villefranche");
		gwtC131.setLongitude(3.13333);
		gwtC131.setLatitude(47.93333);
		
		GWTPassThrough gwtC132 = GWTPassThrough.createGWTPassThrough("Macon");
		gwtC132.setReference("Chalons sur Saone");
		gwtC132.setCountry("France");
		gwtC132.setLocation("Macon");
		gwtC132.setLongitude(4.83333);
		gwtC132.setLatitude(46.3);
		
		GWTPassThrough gwtC133 = GWTPassThrough.createGWTPassThrough("Auxerre");
		gwtC133.setReference("Fontainbleau");
		gwtC133.setCountry("France");
		gwtC133.setLocation("Auxerre");
		gwtC133.setLongitude(3.56667);
		gwtC133.setLatitude(47.8);
		
		GWTPassThrough gwtC134 = GWTPassThrough.createGWTPassThrough("Sens");
		gwtC134.setReference("Fontainbleau");
		gwtC134.setCountry("France");
		gwtC134.setLocation("Sens");
		gwtC134.setLongitude(3.28333);
		gwtC134.setLatitude(48.2);
		gwtC134.setSights("Cathedral with monument to Bourbons");
		
		GWTPassThrough gwtC135 = GWTPassThrough.createGWTPassThrough("Boulogne");
		gwtC135.setReference("Calais");
		gwtC135.setCountry("France");
		gwtC135.setLocation("Boulogne");
		gwtC135.setLongitude(1.61389);
		gwtC135.setLatitude(50.72556);
		gwtC135.setSights("Hotel de Nord");
		
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
		list.add(gwtC61);
		list.add(gwtC62);
		list.add(gwtC63);
		list.add(gwtC64);
		list.add(gwtC65);
		list.add(gwtC66);
		list.add(gwtC67);
		list.add(gwtC68);
		list.add(gwtC69);
		list.add(gwtC70);
		list.add(gwtC71);
		list.add(gwtC72);
		list.add(gwtC73);
		list.add(gwtC74);
		list.add(gwtC75);
		list.add(gwtC76);
		list.add(gwtC77);
		list.add(gwtC78);
		list.add(gwtC79);
		list.add(gwtC80);
		list.add(gwtC81);
		list.add(gwtC82);
		list.add(gwtC83);
		list.add(gwtC84);
		list.add(gwtC85);
		list.add(gwtC86);
		list.add(gwtC87);
		list.add(gwtC88);
		list.add(gwtC89);
		list.add(gwtC90);
		list.add(gwtC91);
		list.add(gwtC92);
		list.add(gwtC93);
		list.add(gwtC94);
		list.add(gwtC95);
		list.add(gwtC96);
		list.add(gwtC97);
		list.add(gwtC98);
		list.add(gwtC99);
		list.add(gwtC100);
		list.add(gwtC101);
		list.add(gwtC102);
		list.add(gwtC103);
		list.add(gwtC104);
		list.add(gwtC105);
		list.add(gwtC106);
		list.add(gwtC107);
		list.add(gwtC108);
		list.add(gwtC109);
		list.add(gwtC110);
		list.add(gwtC111);
		list.add(gwtC112);
		list.add(gwtC113);
		list.add(gwtC114);
		list.add(gwtC115);
		list.add(gwtC116);
		list.add(gwtC117);
		list.add(gwtC118);
		list.add(gwtC119);
		list.add(gwtC120);
		list.add(gwtC121);
		list.add(gwtC122);
		list.add(gwtC123);
		list.add(gwtC124);
		list.add(gwtC125);
		list.add(gwtC126);
		list.add(gwtC127);
		list.add(gwtC128);
		list.add(gwtC129);
		list.add(gwtC130);
		list.add(gwtC131);
		list.add(gwtC132);
		list.add(gwtC133);
		list.add(gwtC134);
		list.add(gwtC135);
		list.add(gwtC136);
		list.add(gwtC137);
		
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

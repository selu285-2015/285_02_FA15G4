package com.ruskin.project.client.lists;

import java.util.ArrayList;
import java.util.List;

import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.ReducedContact;

public class AllList extends ArrayList<GWTContact>{
	
	static List<GWTContact> list = new ArrayList<>();
	
	public AllList() {
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
//		gwtC3.setSights("L'hotel de Bourbon or Rossignol, Cathedral");
		
		GWTContact gwtC4 = GWTContact.createGWTContact("Cassel");
		gwtC4.setCountry("France");
		gwtC4.setLocation("Cassel");
		gwtC4.setLongitude(2.48527);
		gwtC4.setLatitude(50.80109);
		gwtC4.setArrivalDate("16 May, 1833");
		gwtC4.setDepartDate("17 May, 1833");
//		gwtC4.setSights("Hotel d'Angleterre, Ascension Day procession");
		
		GWTContact gwtC5 = GWTContact.createGWTContact("Lille");
		gwtC5.setCountry("France");
		gwtC5.setLocation("Lille");
		gwtC5.setLongitude(3.05858);
		gwtC5.setLatitude(50.63297);
		gwtC5.setArrivalDate("17 May, 1833");
		gwtC5.setDepartDate("18 May, 1833");
//		gwtC5.setSights("Cathedral, Citadel");

		
		GWTContact gwtC6 = GWTContact.createGWTContact("Brussels");
		gwtC6.setCountry("Belgium");
		gwtC6.setLocation("Brussels");
		gwtC6.setLongitude(4.34878);
		gwtC6.setLatitude(50.85045);
		gwtC6.setArrivalDate("18 May, 1833");
		gwtC6.setDepartDate("22 May, 1833");
//		gwtC6.setSights("Market Place, Hotel de Ville, Place Royale, English Church behind House of Representatives, Laken, Palais d'Orange, Cathedral, Jardin des Plantes");
		
		GWTContact gwtC7 = GWTContact.createGWTContact("Namur");
		gwtC7.setCountry("Belgium");
		gwtC7.setLocation("Namur");
		gwtC7.setLongitude(4.86746);
		gwtC7.setLatitude(50.4669);
		gwtC7.setArrivalDate("22 May, 1833");
		gwtC7.setDepartDate("23 May, 1833");
//		gwtC7.setSights("Meuse, Sambre, Citadel of Namur");
		
		GWTContact gwtC8 = GWTContact.createGWTContact("Andernach");
		gwtC8.setCountry("Belgium");
		gwtC8.setLocation("Andernach");
		gwtC8.setLongitude(5.86674);
		gwtC8.setLatitude(50.48375);
		gwtC8.setArrivalDate("23 May, 1833");
		gwtC8.setDepartDate("24 May, 1833");
//		gwtC8.setSights("Mineral Waters, Church--Mass for the Dead--22 Death's heads");
		
		GWTContact gwtC9 = GWTContact.createGWTContact("Aix-la-Chapelle");
		gwtC9.setCountry("Germany");
		gwtC9.setLocation("Aix-la-Chapelle");
		gwtC9.setLongitude(6.0917);
		gwtC9.setLatitude(50.7708);
		gwtC9.setArrivalDate("24 May, 1833");
		gwtC9.setDepartDate("25 May, 1833");
//		gwtC9.setSights("Cathedral, Hotel de Ville");
		
		GWTContact gwtC10 = GWTContact.createGWTContact("Cologne");
		gwtC10.setCountry("Germany");
		gwtC10.setLocation("Cologne");
		gwtC10.setLongitude(6.93487);
		gwtC10.setLatitude(50.94234);
		gwtC10.setArrivalDate("25 May, 1833");
		gwtC10.setDepartDate("28 May, 1833");
//		gwtC10.setSights("Reinbergy Hotel, Hotel Couronne Impèriale, Mass, St. Gereon, Private Picture Collection, Rubens' birthhouse, St Peter's, Bridge of Boats");
		
		GWTContact gwtC11 = GWTContact.createGWTContact("Andernach-2");
		gwtC11.setCountry("Germany");
		gwtC11.setLocation("Andernach");
		gwtC11.setLongitude(7.4004);
		gwtC11.setLatitude(50.4412);
		gwtC11.setArrivalDate("28 May, 1833");
		gwtC11.setDepartDate("29 May, 1833");
//		gwtC11.setSights("Roman Tower, Church");
		
		GWTContact gwtC12 = GWTContact.createGWTContact("Coblentz(Koblenz)");
		gwtC12.setCountry("Germany");
		gwtC12.setLocation("Coblentz(Koblenz)");
		gwtC12.setLongitude(7.584881);
		gwtC12.setLatitude(50.37302);
		gwtC12.setArrivalDate("29 May, 1833");
		gwtC12.setDepartDate("30 May, 1833");
//		gwtC12.setSights("Hotel Cheval Blanc, Ehrbreitstein Fortress");
		
		GWTContact gwtC13 = GWTContact.createGWTContact("Bingen");
		gwtC13.setCountry("Germany");
		gwtC13.setLocation("Bingen");
		gwtC13.setLongitude(7.89);
		gwtC13.setLatitude(49.965);
		gwtC13.setArrivalDate("30 May, 1833");
		gwtC13.setDepartDate("31 May, 1833");
//		gwtC13.setSights("Hotel Chenin Blanc");
		
		GWTContact gwtC14 = GWTContact.createGWTContact("Mayence");
		gwtC14.setCountry("Germany");
		gwtC14.setLocation("Mayence");
		gwtC14.setLongitude(8.263507);
		gwtC14.setLatitude(50.00558);
		gwtC14.setArrivalDate("31 May, 1833");
		gwtC14.setDepartDate("1 June, 1833");
//		gwtC14.setSights("Hotel, Cathedral");
		
		GWTContact gwtC15 = GWTContact.createGWTContact("Frankfurt");
		gwtC15.setCountry("Germany");
		gwtC15.setLocation("Frankfurt");
		gwtC15.setLongitude(8.66958);
		gwtC15.setLatitude(50.13144);
		gwtC15.setArrivalDate("1 June, 1833");
		gwtC15.setDepartDate("4 June, 1833");
//		gwtC15.setSights("Hotel de Russie, German Protestant Church, Cemetary, Forest");
		
		GWTContact gwtC16 = GWTContact.createGWTContact("Heidelberg");
		gwtC16.setCountry("Germany");
		gwtC16.setLocation("Heidelberg");
		gwtC16.setLongitude(8.68885);
		gwtC16.setLatitude(49.41132);
		gwtC16.setArrivalDate("4 June, 1833");
		gwtC16.setDepartDate("5 June, 1833");
//		gwtC16.setSights("Bridge, Castle Ruins, Castle, Heidelberg Tun");
		
		GWTContact gwtC17 = GWTContact.createGWTContact("Carlsruhe");
		gwtC17.setCountry("Germany");
		gwtC17.setLocation("Carlsruhe");
		gwtC17.setLongitude(8.394302);
		gwtC17.setLatitude(49.00481);
		gwtC17.setArrivalDate("5 June, 1833");
		gwtC17.setDepartDate("6 June, 1833");
//		gwtC17.setSights("Botanical Gardens, Churches");
		
		GWTContact gwtC18 = GWTContact.createGWTContact("Kehl");
		gwtC18.setCountry("Germany");
		gwtC18.setLocation("Kehl");
		gwtC18.setLongitude(7.817);
		gwtC18.setLatitude(48.583);
		gwtC18.setArrivalDate("6 June, 1833");
		gwtC18.setDepartDate("8 June, 1833");
//		gwtC18.setSights("French Custom House, Strasbourg Cathedral, Church of St."
//				+ "Thomas, Marechal Comte de Saxe monument");
		
		GWTContact gwtC19 = GWTContact.createGWTContact("Schaffhausen");
		gwtC19.setCountry("Switzerland");
		gwtC19.setLocation("Schaffhausen");
		gwtC19.setLongitude(8.63493);
		gwtC19.setLatitude(47.69732);
		gwtC19.setArrivalDate("8 June, 1833");
		gwtC19.setDepartDate("10 June, 1833");
//		gwtC19.setSights("Citadel, Public Walks, 'Saw snowy summit of Alps', "
//				+ "Fall of the Rhine, Camera Obscura");
		
		GWTContact gwtC20 = GWTContact.createGWTContact("Lake Constance");
		gwtC20.setCountry("Switzerland");
		gwtC20.setLocation("Lake Constance");
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
//		gwtC24.setSights("Hotel, Villa Somariva, Terraces, Mass(Sacrament Sunday),"
//				+ " Fiume Latte, Villa Venina, Villa Melzi");
		
		GWTContact gwtC25 = GWTContact.createGWTContact("Como");
		gwtC25.setCountry("Italy");
		gwtC25.setLocation("Como");
		gwtC25.setLongitude(9.08744);
		gwtC25.setLatitude(45.80998);
		gwtC25.setArrivalDate("17 June, 1833");
		gwtC25.setDepartDate("18 June, 1833");
//		gwtC25.setSights("Cathedral");
		
		GWTContact gwtC26 = GWTContact.createGWTContact("Milan");
		gwtC26.setCountry("Italy");
		gwtC26.setLocation("Milan");
		gwtC26.setLongitude(9.183058);
		gwtC26.setLatitude(45.38364);
		gwtC26.setArrivalDate("18 June, 1833");
		gwtC26.setDepartDate("20 June, 1833");
//		gwtC26.setSights("Cathedral, Napoleon Amphitheatre, Incomplete Arch,"
//				+ " Canobiano Opera, Emperor's Palace, Palazzo Tito, Ambrosian"
//				+ " Library, Corso, Marengo Gate, S. Lorenzo, La Scala");

		GWTContact gwtC27 = GWTContact.createGWTContact("Pavia");
		gwtC27.setCountry("Italy");
		gwtC27.setLocation("Pavia");
		gwtC27.setLongitude(9.16145);
		gwtC27.setLatitude(45.18446);
		gwtC27.setArrivalDate("20 June, 1833");
		gwtC27.setDepartDate("21 June, 1833");
//		gwtC27.setSights("Rice Field, Certosa, 'Young Men(students)', Custom House");
		
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
//		gwtC29.setSights("Cathedral. St. John Baptist's Eve, Anunzials, Palaces, "
//				+ "University, Palazzo Sera, Doge's Palace, Palazzo Durazzo, "
//				+ "Lord Byron's House, Opera 'Anna Boleyna'");
		
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
//		gwtC31.setSights("Strada del Po, St. Peter's Day, Royal Chapel, "
//				+ "Opera 'Barbiere di Seviglia' in Argens Theatre, Villa Regina");
		
		GWTContact gwtC32 = GWTContact.createGWTContact("Navaro");
		gwtC32.setCountry("Italy");
		gwtC32.setLocation("Navaro");
		gwtC32.setLongitude(8.62328);
		gwtC32.setLatitude(45.44834);
		gwtC32.setArrivalDate("1 July, 1833");
		gwtC32.setDepartDate("2 July, 1833");
//		gwtC32.setSights("Cathedral");
		
		GWTContact gwtC33 = GWTContact.createGWTContact("Arona");
		gwtC33.setCountry("Italy");
		gwtC33.setLocation("Arona");
		gwtC33.setLongitude(8.55715);
		gwtC33.setLatitude(45.7589);
		gwtC33.setArrivalDate("2 July, 1833");
		gwtC33.setDepartDate("4 July, 1833");
//		gwtC33.setSights("Lake Maggiore, 'Colossal Statue of S. Carlo Borromeo'");
		
		GWTContact gwtC34 = GWTContact.createGWTContact("Duomo d'Ossala");
		gwtC34.setCountry("Italy");
		gwtC34.setLocation("Duomo d'Ossala");
		gwtC34.setLongitude(8.29313);
		gwtC34.setLatitude(46.1165);
		gwtC34.setArrivalDate("4 July, 1833");
		gwtC34.setDepartDate("5 July, 1833");
		
		GWTContact gwtC35 = GWTContact.createGWTContact("Sion");
		gwtC35.setCountry("Switzerland");
		gwtC35.setLocation("Sion");
		gwtC35.setLongitude(7.3667);
		gwtC35.setLatitude(46.233);
		gwtC35.setArrivalDate("6 July, 1833");
		gwtC35.setDepartDate("8 July, 1833");
//		gwtC35.setSights("Hermitage");
		
		GWTContact gwtC36 = GWTContact.createGWTContact("Martigny");
		gwtC36.setCountry("Switzerland");
		gwtC36.setLocation("Martigny");
		gwtC36.setLongitude(7.0667);
		gwtC36.setLatitude(46.1);
		gwtC36.setArrivalDate("8 July, 1833");
		gwtC36.setDepartDate("9 July, 1833");
		
		GWTContact gwtC37 = GWTContact.createGWTContact("St. Bernard Convent");
		gwtC37.setCountry("Switzerland");
		gwtC37.setLocation("St. Bernard Convent");
		gwtC37.setLongitude(7);
		gwtC37.setLatitude(46);
		gwtC37.setArrivalDate("9 July, 1833");
		gwtC37.setDepartDate("10 July, 1833");
		
		GWTContact gwtC38 = GWTContact.createGWTContact("Martigny-2");
		gwtC38.setCountry("Switzerland");
		gwtC38.setLocation("Martigny");
		gwtC38.setLongitude(7.0667);
		gwtC38.setLatitude(46.1);
		gwtC38.setArrivalDate("8 July, 1833");
		gwtC38.setDepartDate("9 July, 1833");
		
		GWTContact gwtC39 = GWTContact.createGWTContact("Bex");
		gwtC39.setCountry("Switzerland");
		gwtC39.setLocation("Bex");
		gwtC39.setLongitude(7.0167);
		gwtC39.setLatitude(46.25);
		gwtC39.setArrivalDate("11 July, 1833");
		gwtC39.setDepartDate("12 July, 1833");
//		gwtC39.setSights("Union Inn(JJR), Geneva Lake");
		
		GWTContact gwtC40 = GWTContact.createGWTContact("Lausanne");
		gwtC40.setCountry("Switzerland");
		gwtC40.setLocation("Lausanne");
		gwtC40.setLongitude(6.6335);
		gwtC40.setLatitude(46.5198);
		gwtC40.setArrivalDate("12 July, 1833");
		gwtC40.setDepartDate("15 July, 1833");
//		gwtC40.setSights("Gibbon's House, Kemble's House");
		
		GWTContact gwtC41 = GWTContact.createGWTContact("Fribourg");
		gwtC41.setCountry("Switzerland");
		gwtC41.setLocation("Fribourg");
		gwtC41.setLongitude(7.15);
		gwtC41.setLatitude(46.8);
		gwtC41.setArrivalDate("15 July, 1833");
		gwtC41.setDepartDate("16 July, 1833");
//		gwtC41.setSights("Cathedral, Convent, Capuchins Monastary,"
//				+ " College of Jesuits, Nunnery on the Hill(JJR)");
		
		GWTContact gwtC42 = GWTContact.createGWTContact("Berne");
		gwtC42.setCountry("Switzerland");
		gwtC42.setLocation("Berne");
		gwtC42.setLongitude(7.45);
		gwtC42.setLatitude(46.95);
		gwtC42.setArrivalDate("16 July, 1833");
		gwtC42.setDepartDate("18 July, 1833");
//		gwtC42.setSights("Hotel de Couronne, Museum, Agricultural Establishment "
//				+ "under Mr. Felebourough(or Tellenberg)");
		
		GWTContact gwtC43 = GWTContact.createGWTContact("Interlaken");
		gwtC43.setCountry("Switzerland");
		gwtC43.setLocation("Interlaken");
		gwtC43.setLongitude(7.85);
		gwtC43.setLatitude(46.6833);
		gwtC43.setArrivalDate("18 July, 1833");
		gwtC43.setDepartDate("20 July, 1833");
//		gwtC43.setSights("Lake Brienz/Giesbach(finest waterfall)/Swiss family singing");
		
		GWTContact gwtC44 = GWTContact.createGWTContact("Berne-2");
		gwtC44.setCountry("Switzerland");
		gwtC44.setLocation("Berne");
		gwtC44.setLongitude(7.45);
		gwtC44.setLatitude(46.95);
		gwtC44.setArrivalDate("20 July, 1833");
		gwtC44.setDepartDate("22 July, 1833");
		
		GWTContact gwtC45 = GWTContact.createGWTContact("Sursees");
		gwtC45.setCountry("Switzerland");
		gwtC45.setLocation("Sursees");
		gwtC45.setLongitude(8.1167);
		gwtC45.setLatitude(47.1667);
		gwtC45.setArrivalDate("22 July, 1833");
		gwtC45.setDepartDate("23 July, 1833");
//		gwtC45.setSights("Lake of Sempach");
		
		GWTContact gwtC46 = GWTContact.createGWTContact("Lucerne");
		gwtC46.setCountry("Switzerland");
		gwtC46.setLocation("Lucerne");
		gwtC46.setLongitude(8.3);
		gwtC46.setLatitude(47.05);
		gwtC46.setArrivalDate("23 July, 1833");
		gwtC46.setDepartDate("24 July, 1833");
//		gwtC46.setSights("White Horse Inn, View of Mt. Pilate, "
//				+ "covered bridges, Reuss River, Monument to Swiss Guards,"
//				+ " General Pfyffer's 'Celebrated relieve topographical chart'");
		
		GWTContact gwtC47 = GWTContact.createGWTContact("Arth");
		gwtC47.setCountry("Switzerland");
		gwtC47.setLocation("Arth");
		gwtC47.setLongitude(8.5218);
		gwtC47.setLatitude(47.0634);
		gwtC47.setArrivalDate("24 July, 1833");
		gwtC47.setDepartDate("26 July, 1833");
		
		GWTContact gwtC48 = GWTContact.createGWTContact("Einsiedeln");
		gwtC48.setCountry("Switzerland");
		gwtC48.setLocation("Einsiedeln");
		gwtC48.setLongitude(8.7443);
		gwtC48.setLatitude(47.1281);
		gwtC48.setArrivalDate("26 July, 1833");
		gwtC48.setDepartDate("27 July, 1833");
//		gwtC48.setSights("Einsiedeln Abbey");
		
		GWTContact gwtC49 = GWTContact.createGWTContact("Rapperswill");
		gwtC49.setCountry("Switzerland");
		gwtC49.setLocation("Rapperswill");
		gwtC49.setLongitude(8.8565);
		gwtC49.setLatitude(47.2327);
		gwtC49.setArrivalDate("27 July, 1833");
		gwtC49.setDepartDate("30 July, 1833");
//		gwtC49.setSights("Peacock Inn");
		
		GWTContact gwtC50 = GWTContact.createGWTContact("Zurich");
		gwtC50.setCountry("Switzerland");
		gwtC50.setLocation("Zurich");
		gwtC50.setLongitude(8.55);
		gwtC50.setLatitude(47.3667);
		gwtC50.setArrivalDate("30 July, 1833");
		gwtC50.setDepartDate("3 August, 1833");
//		gwtC50.setSights("Hotel, Bridge Market, Museum/Lirary, forming for battle "
//				+ "to keep possession of refactory canton of Schwytz");
		
		GWTContact gwtC51 = GWTContact.createGWTContact("Baden");
		gwtC51.setCountry("Switzerland");
		gwtC51.setLocation("Baden");
		gwtC51.setLongitude(8.3);
		gwtC51.setLatitude(47.4667);
		gwtC51.setArrivalDate("3 August, 1833");
		gwtC51.setDepartDate("5 August, 1833");
//		gwtC51.setSights("Sword Inn");
		
		GWTContact gwtC52 = GWTContact.createGWTContact("Basel");
		gwtC52.setCountry("Switzerland");
		gwtC52.setLocation("Basel");
		gwtC52.setLongitude(7.6);
		gwtC52.setLatitude(47.5667);
		gwtC52.setArrivalDate("5 August, 1833");
		gwtC52.setDepartDate("6 August, 1833");
//		gwtC52.setSights("Three Kings Inn, cathedral, town on alert for battle");
		
		GWTContact gwtC53 = GWTContact.createGWTContact("Bienne");
		gwtC53.setCountry("Switzerland");
		gwtC53.setLocation("Bienne");
		gwtC53.setLongitude(7.25);
		gwtC53.setLatitude(47.1333);
		gwtC53.setArrivalDate("6 August, 1833");
		gwtC53.setDepartDate("8 August, 1833");
		
		GWTContact gwtC54 = GWTContact.createGWTContact("Neufchatel");
		gwtC54.setCountry("Switzerland");
		gwtC54.setLocation("Neufchatel");
		gwtC54.setLongitude(6.9333);
		gwtC54.setLatitude(47);
		gwtC54.setArrivalDate("8 August, 1833");
		gwtC54.setDepartDate("9 August, 1833");
//		gwtC54.setSights("Citadel, NOTE: owned by Prussia at this time");
		
		GWTContact gwtC55 = GWTContact.createGWTContact("Morges");
		gwtC55.setCountry("Switzerland");
		gwtC55.setLocation("Morges");
		gwtC55.setLongitude(6.5);
		gwtC55.setLatitude(46.5167);
		gwtC55.setArrivalDate("9 August, 1833");
		gwtC55.setDepartDate("10 August, 1833");
//		gwtC55.setSights("Lake of Geneva");
		
		GWTContact gwtC56 = GWTContact.createGWTContact("Geneva");
		gwtC56.setCountry("Switzerland");
		gwtC56.setLocation("Geneva");
		gwtC56.setLongitude(6.15);
		gwtC56.setLatitude(46.2);
		gwtC56.setArrivalDate("10 August, 1833");
		gwtC56.setDepartDate("14 August, 1833");
//		gwtC56.setSights("Hotel des Etrangers, Mont Blanc, Mr. Botte's Showrooms");
		
		GWTContact gwtC57 = GWTContact.createGWTContact("Sallanches");
		gwtC57.setCountry("France");
		gwtC57.setLocation("Sallanches");
		gwtC57.setLongitude(6.63162);
		gwtC57.setLatitude(45.94423);
		gwtC57.setArrivalDate("14 August, 1833");
		gwtC57.setDepartDate("15 August, 1833");
		
		
		GWTContact gwtC58 = GWTContact.createGWTContact("Chamouni");
		gwtC58.setCountry("France");
		gwtC58.setLocation("Chamouni");
		gwtC58.setLongitude(6.86933);
		gwtC58.setLatitude(45.92375);
		gwtC58.setArrivalDate("15 August, 1833");
		gwtC58.setDepartDate("16 August, 1833");
		
		GWTContact gwtC59 = GWTContact.createGWTContact("Chamouni-2");
		gwtC59.setCountry("France");
		gwtC59.setLocation("Chamouni");
		gwtC59.setLongitude(6.86933);
		gwtC59.setLatitude(45.92375);
		gwtC59.setArrivalDate("18 August, 1833");
		gwtC59.setDepartDate("19 August, 1833");
		
		GWTContact gwtC60 = GWTContact.createGWTContact("Geneva-2");
		gwtC60.setCountry("Switzerland");
		gwtC60.setLocation("Geneva");
		gwtC60.setLongitude(6.15);
		gwtC60.setLatitude(46.2);
		gwtC60.setArrivalDate("19 August, 1833");
		gwtC60.setDepartDate("22 August, 1833");
//		gwtC60.setSights("Nant d'Arpenaz, Marquis of Hertfod's Family, "
//				+ "English at Library, Opera, Voltaire's Residence");
		
		GWTContact gwtC61 = GWTContact.createGWTContact("Nantua");
		gwtC61.setCountry("France");
		gwtC61.setLocation("Nantua");
		gwtC61.setLongitude(5.61667);
		gwtC61.setLatitude(46.15);
		gwtC61.setArrivalDate("22 August, 1833");
		gwtC61.setDepartDate("23 August, 1833");
//		gwtC61.setSights("view of Mont Blanc on road to Lyons");
		
		GWTContact gwtC62 = GWTContact.createGWTContact("Lyon");
		gwtC62.setCountry("France");
		gwtC62.setLocation("Lyon");
		gwtC62.setLongitude(4.84671);
		gwtC62.setLatitude(45.74846);
		gwtC62.setArrivalDate("23 August, 1833");
		gwtC62.setDepartDate("26 August, 1833");
//		gwtC62.setSights("Hotel de Europe, manufacturies, Museum");
		
		GWTContact gwtC63 = GWTContact.createGWTContact("Chalons sur Saone");
		gwtC63.setCountry("France");
		gwtC63.setLocation("Chalons sur Saone");
		gwtC63.setLongitude(6.11682);
		gwtC63.setLatitude(47.22311);
		gwtC63.setArrivalDate("26 August, 1833");
		gwtC63.setDepartDate("27 August, 1833");
		
		GWTContact gwtC64 = GWTContact.createGWTContact("Dijon");
		gwtC64.setCountry("France");
		gwtC64.setLocation("Dijon");
		gwtC64.setLongitude(5.01667);
		gwtC64.setLatitude(47.31667);
		gwtC64.setArrivalDate("27 August, 1833");
		gwtC64.setDepartDate("30 August, 1833");
//		gwtC64.setSights("Clos Vougeot, palace of Duke of Burgundy, museum, "
//				+ "Hotel de la Cloche, wine cellars");
		
		GWTContact gwtC65 = GWTContact.createGWTContact("Fontainbleau");
		gwtC65.setCountry("France");
		gwtC65.setLocation("Fontainbleau");
		gwtC65.setLongitude(2.7);
		gwtC65.setLatitude(48.4);
		gwtC65.setArrivalDate("30 August, 1833");
		gwtC65.setDepartDate("31 August, 1833");
//		gwtC65.setSights("Hotel de Ville de Lyons, palace, table where Napoleon signed abdication");
		
		GWTContact gwtC66 = GWTContact.createGWTContact("Paris");
		gwtC66.setCountry("France");
		gwtC66.setLocation("Paris");
		gwtC66.setLongitude(2.3488);
		gwtC66.setLatitude(48.85341);
		gwtC66.setArrivalDate("31 August, 1833");
		gwtC66.setDepartDate("16 September, 1833");
//		gwtC66.setSights("Hotel de Bristol Place Venodome, visited Mrs. Domecq, "
//				+ "opera, Louvre, St. Cloud, Versailles, English Church Service");
		
		GWTContact gwtC67 = GWTContact.createGWTContact("Chantilly");
		gwtC67.setCountry("France");
		gwtC67.setLocation("Chantilly");
		gwtC67.setLongitude(2.47124);
		gwtC67.setLatitude(49.194461);
		gwtC67.setArrivalDate("16 September, 1833");
		gwtC67.setDepartDate("17 September, 1833");
//		gwtC67.setSights("parks, palace");
		
		GWTContact gwtC68 = GWTContact.createGWTContact("Amiens");
		gwtC68.setCountry("France");
		gwtC68.setLocation("Amiens");
		gwtC68.setLongitude(2.3);
		gwtC68.setLatitude(49.9);
		gwtC68.setArrivalDate("17 September, 1833");
		gwtC68.setDepartDate("18 September, 1833");
//		gwtC68.setSights("cathedral");
		
		GWTContact gwtC69 = GWTContact.createGWTContact("Montreuil");
		gwtC69.setCountry("France");
		gwtC69.setLocation("Montreuil");
		gwtC69.setLongitude(1.76667);
		gwtC69.setLatitude(50.46667);
		gwtC69.setArrivalDate("18 September, 1833");
		gwtC69.setDepartDate("19 September, 1833");
//		gwtC69.setSights("Hotel de l'Europe");
		
		GWTContact gwtC70 = GWTContact.createGWTContact("Calais-2");
		gwtC70.setCountry("France");
		gwtC70.setLocation("Calais");
		gwtC70.setLongitude(1.85635);
		gwtC70.setLatitude(50.95194);
		gwtC70.setArrivalDate("19 September, 1833");
		gwtC70.setDepartDate("N/A");
//		gwtC70.setSights("Desseins Hotel - Laurence Stern's bedroom");
		
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
	
	public static List<GWTContact> getAllContacts() {
		return list;
	}
	
	public static ReducedContact getReducedContact(int location) {
		ReducedContact c = new ReducedContact(list.get(location).getId(), list.get(location).getLongitude(), list.get(location).getLatitude());
		return c;
	}

	public static int getSize() {
		return list.size();
	}

}

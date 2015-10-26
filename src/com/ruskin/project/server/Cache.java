package com.ruskin.project.server;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Cache {
	
	private static class InstanceHolder{
		private static final Cache instance = new Cache();
	}
	
	public static Cache getInstance(){
		return InstanceHolder.instance;
	}

	private Map<String, ContactList> cache = new LinkedHashMap<String, ContactList>();
	
	private final List<String> fileNameList;
	private final Map<String,Comparator<Contact>> comparatorMap;
	
	
	private Cache(){

		super();
		fileNameList = new ArrayList<String>();
		
		comparatorMap = new HashMap<String, Comparator<Contact>>();
		
		//put all the right comparators into the map
		comparatorMap.put("CONTACT ID", new Comparator<Contact>(){

			@Override
			public int compare(Contact o1, Contact o2) {
				Collator collator = Collator.getInstance();
				int quotient = 0;
				if ((collator.compare(o1.getId().toString(), o2.getId().toString())) != 0){
					quotient = collator.compare(o1.getId().toString(), o2.getId().toString())/
							Math.abs(collator.compare(o1.getId().toString(), o2.getId().toString()));
				}
				return quotient;
			}
			
		});
		
		
		
	
		comparatorMap.put("LATITUDE", new Comparator<Contact>(){

			@Override
			public int compare(Contact o1, Contact o2) {
				int result = 0;
				if (o1.getLatitude() != o2.getLatitude()){
					result = (o1.getLatitude() > o2.getLatitude()) ? 1:-1;
				}
				return result;
			}
			
		});
		
		comparatorMap.put("LONGITUDE", new Comparator<Contact>(){

			@Override
			public int compare(Contact o1, Contact o2) {
				int result = 0;
				if (o1.getLongitude() != o2.getLongitude()){
					result = (o1.getLongitude() > o2.getLongitude()) ? 1:-1;
				}
				return result;
			}
			
		});
		
	}

	public List<String> getFileNameMap() {
		return fileNameList;
	}
	
	public Map<String, Comparator<Contact>> getComparatorMap() {
		return comparatorMap;
	}

	public Map<String, ContactList> getCache() {
		return cache;
	}
	

	
	
}
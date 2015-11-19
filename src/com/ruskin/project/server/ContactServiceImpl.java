package com.ruskin.project.server;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.ruskin.project.client.ContactService;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.ReducedContact;
//import com.sun.jersey.api.client.ClientResponse;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ContactServiceImpl extends RemoteServiceServlet implements ContactService {

	private Cache cacheMap;	
	
	public ContactServiceImpl() {
		super();
		cacheMap = Cache.getInstance();			
	}
	
	@Override
	public GWTContact getContact(String contactId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<GWTContact> queryCache(String queryId, int[] hitRange) {
		ContactList list = cacheMap.getCache().get(queryId);
		ArrayList<GWTContact> subList = new ArrayList<GWTContact>();
		for(int i = hitRange[0]; i <= hitRange[1]; i++){
			subList.add(convertToGWTContact(list.getContacts().get(i)));
		}
		return subList;
	}
	
	public GWTContact convertToGWTContact(Contact c){
		GWTContact gwtContact = GWTContact.createGWTContact(c.getId());
		gwtContact.setLatitude(c.getLatitude());
		gwtContact.setLongitude(c.getLongitude());
		
		return gwtContact;
	}
	
	@Override
	public List<ReducedContact> queryForReducedContacts(String query) {
		return null;
	}
}

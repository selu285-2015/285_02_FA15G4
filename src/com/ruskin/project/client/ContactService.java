package com.ruskin.project.client;


import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.ReducedContact;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("pm")
public interface ContactService extends RemoteService {
	
	/**
	 * Get a contact from the supplied contact id.
	 */
	GWTContact getContact(String contactId);
	
	List<ReducedContact> queryForReducedContacts(String query);
	
	List<GWTContact> queryCache(String queryId, int[] hitRange);
}

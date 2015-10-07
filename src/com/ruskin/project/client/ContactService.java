package com.ruskin.project.client;


import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.QueryResult;
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
	
	/**
	 * Submit a query to the server.  If <code>query</code> is null or an empty string, this method will return ALL
	 * contacts on the server.  Otherwise, the supplied query will be sent to the server with this request and only
	 * contacts matching the query will be returned.
	 */
//	QueryResult queryForContacts(String query, String oldQueryId);
	
	List<ReducedContact> queryForReducedContacts(String query);
	
	List<GWTContact> queryCache(String queryId, int[] hitRange);
}

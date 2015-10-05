package com.ruskin.project.client;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ruskin.project.shared.GWTContact;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("pm")
public interface ContactService extends RemoteService {
	/**
	 * Get a contact from the supplied contact id.
	 */
	GWTContact getContact(String contactId);
}

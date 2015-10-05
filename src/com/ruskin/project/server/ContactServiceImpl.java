package com.ruskin.project.server;

import com.ruskin.project.client.ContactService;
import com.ruskin.project.shared.GWTContact;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ContactServiceImpl extends RemoteServiceServlet implements ContactService {

	@Override
	public GWTContact getContact(String contactId) {
		// TODO Auto-generated method stub
		return null;
	}
}

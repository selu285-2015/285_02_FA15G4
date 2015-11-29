package com.ruskin.project.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ruskin.project.client.ContactService;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ContactServiceImpl extends RemoteServiceServlet implements ContactService {
	
	public ContactServiceImpl() {
		super();		
	}

}

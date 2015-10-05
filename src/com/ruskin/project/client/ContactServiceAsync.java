package com.ruskin.project.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ruskin.project.shared.GWTContact;

/**
 * The async counterpart of {@link ContactService}.
 */
public interface ContactServiceAsync {
	void getContact(String contact, AsyncCallback<GWTContact> callback);
}

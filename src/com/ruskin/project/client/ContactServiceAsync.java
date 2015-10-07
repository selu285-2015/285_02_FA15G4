package com.ruskin.project.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.QueryResult;
import com.ruskin.project.shared.ReducedContact;

/**
 * The async counterpart of {@link ContactService}.
 */
public interface ContactServiceAsync {
//	void queryForContacts(String query, String oldQueryId, AsyncCallback<QueryResult> queryCallback);
	void queryCache(String queryId, int[] hitRange, AsyncCallback<List<GWTContact>> cacheCallback);
	void queryForReducedContacts(String query, AsyncCallback<List<ReducedContact>> queryCallback);
	void getContact(String contact, AsyncCallback<GWTContact> callback);
}

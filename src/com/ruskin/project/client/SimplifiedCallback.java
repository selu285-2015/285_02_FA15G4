package com.ruskin.project.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * <p>Implementation of {@link AsyncCallback} with {@link AsyncCallback#onFailure(Throwable)} predefined.</p>
 * <p>On failure, a message is written to the browser's error console. It is also printed to the developer's console
 * with a stack trace if running in dev mode. Finally, an optional popup window can be displayed using the browser's
 * native alert() method.
 */
public abstract class SimplifiedCallback<T> implements AsyncCallback<T> {

	private final String callDescription;
	private final boolean showPopup;

	/**
	 * Create a callback with a description of the call that can be displayed on failure.
	 * No popup dialog will be shown.
	 * 
	 * @param callDescription a description of the call that failed, e.g., getting client config
	 */
	public SimplifiedCallback(final String callDescription) {
		this(callDescription, false);
	}

	/**
	 * Create a callback with a description of the call that can be displayed on failure and optionally displayed
	 * to the user in a browser's alert window.
	 * 
	 * @param callDescription a description of the call that failed, e.g., getting client config
	 * @param showPopup true if a popup should be shown to the end user, false if writing to the console is enough.
	 */
	public SimplifiedCallback(final String callDescription, final boolean showPopup) {
		this.callDescription = callDescription;
		this.showPopup = showPopup;
	}

	@Override
	public abstract void onSuccess(T result);

	@Override
	public void onFailure(Throwable caught) {
		final String msg = "onFailure(): " + callDescription + "\nCaught Throwable: " + caught.getMessage();
		System.out.println(msg);
		caught.printStackTrace();
		if (showPopup) {
			Window.alert(msg);
		}
	}
}

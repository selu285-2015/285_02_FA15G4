package sam2.project.client;

import sam2.project.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Sam2 implements EntryPoint {
	 public void onModuleLoad (){
	MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();  
	   oracle.add("Germany");
	   oracle.add("France");
	   oracle.add("Britain");
	   oracle.add("Belgium");
	   oracle.add("Prussia");
	   oracle.add("Germany");
	   oracle.add("Italy");
	   oracle.add("Switzerland");
	   
	   SuggestBox box = new SuggestBox(oracle);
	   
	   RootPanel.get().add(box);
	 }
}

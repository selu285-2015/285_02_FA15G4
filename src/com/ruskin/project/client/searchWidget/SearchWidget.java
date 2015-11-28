package com.ruskin.project.client.searchWidget;

import java.util.ArrayList;
import java.util.List;

import org.gwtopenmaps.openlayers.client.feature.VectorFeature;
import org.gwtopenmaps.openlayers.client.layer.Vector;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.ruskin.project.client.MainWidget;
import com.ruskin.project.client.lists.AllList;
import com.ruskin.project.client.lists.JJList;
import com.ruskin.project.client.lists.MaryList;
import com.ruskin.project.client.widget.mapwidget.PlaceMapWidget;
import com.ruskin.project.shared.GWTContact;
import com.ruskin.project.shared.GWTPassThrough;
import com.ruskin.project.shared.ReducedContact;


/** A search criteria widget that allows for a user to input desired
 * search criteria and fetch similar results
 *Author: Holden Pitre
 */
public class SearchWidget implements IsWidget {
	private final MainWidget master;
	
	VerticalPanel panel;
	HorizontalPanel searchbar;
	ScrollPanel scrollable;
	Button b;
	Label lbl;
	MultiWordSuggestOracle oracle;   
	SuggestBox box; 
	
	protected final CellTable<GWTContact> table = new CellTable<GWTContact>();
	private final ListDataProvider<GWTContact> dataProvider = new ListDataProvider<GWTContact>();		
	private List<GWTContact> list = dataProvider.getList();	
	
	private final List<GWTContact> searchList = new ArrayList<>();
	
	public SearchWidget(MainWidget master) {
		this.master = master;
		panel = new VerticalPanel();
		searchbar = new HorizontalPanel();
		searchbar.setHeight("100px");
		scrollable = new ScrollPanel();
		scrollable.setHeight("400px");
		oracle = new MultiWordSuggestOracle();
		box = new SuggestBox(oracle);
		b = new Button("Search");
		box.setWidth("200px");
		lbl = new Label("Enter Search Criteria");
		
		BuildUI();
	}
	
	private void BuildUI() {
		oracle.add("Germany"); 
		oracle.add("France"); 
		oracle.add("Britain"); 
		oracle.add("Belgium"); 
		oracle.add("Prussia"); 
		oracle.add("Germany"); 
		oracle.add("Italy"); 
		oracle.add("Switzerland"); 
		
		b.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				getList().clear();
				String toSearch = box.getText();
				for(int i=0; i<AllList.getSize(); i++) {
					GWTContact c = AllList.getAllContacts().get(i);
					if (toSearch.isEmpty()) {
						getList().add(c);
					}
					else if(c.getLocation().contains(toSearch) || c.getCountry().contains(toSearch)) {
						getList().add(c);
					}
				}		
				master.getMap().printContacts(list);
				master.getMap().getVectorLayer().redraw();
				System.out.println(getList().size());
				table.setVisibleRange(0, getList().size());
			}
		});
		
		// Create the Results table
		TextColumn<GWTContact> countryColumn = new TextColumn<GWTContact>() {
			@Override
			public String getValue(GWTContact contact) {
				return contact.getCountry();
			}
		};
		TextColumn<GWTContact> locationColumn = new TextColumn<GWTContact>() {
			@Override
			public String getValue(GWTContact contact) {
				return contact.getLocation();
			}
		};
		
		table.addColumn(countryColumn, "COUNTRY");
		table.addColumn(locationColumn, "LOCATION");
		
		table.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);
		final SingleSelectionModel<GWTContact> selectionModel = new SingleSelectionModel<GWTContact>();
		table.setSelectionModel(selectionModel);
		
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				GWTContact selected = selectionModel.getSelectedObject();
				if (selected != null) {
					master.getAllDialog().showFor(selected);
				}
			}
		});  
		
		table.setColumnWidth(0, "50%");
		table.setColumnWidth(1, "50%");

		table.setWidth("100%", true);
				
		dataProvider.addDataDisplay(table);	

		scrollable.add(table);
		
		lbl.setStyleName("flexTableCellHead");
		panel.setWidth("25%");
		panel.setHeight("500px");
		panel.add(lbl);
		searchbar.add(box);
		searchbar.add(b);
		
		panel.add(searchbar);
		panel.add(scrollable);
	}
	

	public CellTable<GWTContact> getTable() {
		return table;
	}
	
	public List<GWTContact> getList() {
		return list;
	}

	public void setList(List<GWTContact> newList){
		list = searchList;
	}

	public ListDataProvider<GWTContact> getDataProvider() {
		return dataProvider;
	}
	
	@Override
	public Widget asWidget() {
		return panel;
	}

}

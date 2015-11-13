package com.ruskin.project.shared;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class QueryResult implements IsSerializable {

	private String queryId;
	private int hitCount;
	private int[] hitRange;
	private List<ReducedContact> reducedList;
		
	//this only exists to get rid of the "this constructor is never used locally" warning that would appear next to the no-arg private constructor you see below.
	public static void toGetRidofWarnings(){
		new QueryResult();		
	}
	
	public QueryResult(String queryId, int hitCount){		
		this.queryId = queryId;
		this.hitCount = hitCount;
		reducedList = new ArrayList<ReducedContact>();
	}	
	
	private QueryResult (){
		
	}
	
	public String getQueryId() {
		return queryId;
	}	
	
	public int getHitCount() {
		return hitCount;
	}	
	
	public void setHitRange(int[] hitRange){
		this.hitRange = hitRange;		
	}
	
	public int[] getHitRange(){
		return hitRange;
	}
	
	public List<ReducedContact> getReducedList() {
		return reducedList;
	}

	public void setReducedList(List<ReducedContact> reducedList) {
		this.reducedList = reducedList;
	}

	
}

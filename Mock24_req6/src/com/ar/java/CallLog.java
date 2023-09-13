package com.ar.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CallLog {
	List<Call> callList;
	
	public CallLog() {}

	public CallLog(List<Call> callList) {
		super();
		this.callList = callList;
	}

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	
	public Contact getFavouriteContact()
	{
		Map<Contact,Integer> map=new LinkedHashMap<Contact,Integer>();
		for(Call cl:callList) 
		{
			
		}
		
		return null;
	}
	
}

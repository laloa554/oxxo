package com.webHook.order;

import java.util.List;

public class Charges{
	private String object;
	private boolean has_more;
	private int total;
	private List<Datum> data;
	
	public Charges() {
		super();
	}

	public Charges(String object, boolean has_more, int total, List<Datum> data) {
		super();
		this.object = object;
		this.has_more = has_more;
		this.total = total;
		this.data = data;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public boolean isHas_more() {
		return has_more;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Datum> getData() {
		return data;
	}

	public void setData(List<Datum> data) {
		this.data = data;
	}
	
	
}

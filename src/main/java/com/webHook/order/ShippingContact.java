package com.webHook.order;

public class ShippingContact{
	private Address address;
	private String id;
	private String object;
	private int created_at;
	
	public ShippingContact() {
		super();
	}

	public ShippingContact(Address address, String id, String object, int created_at) {
		super();
		this.address = address;
		this.id = id;
		this.object = object;
		this.created_at = created_at;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}
	
	
	
}
package com.webHook.order;

public class Address{
    private String street1;
    private String country;
    private boolean residential;
    private String object;
    private String postal_code;
    
	public Address() {
		super();
	}

	public Address(String street1, String country, boolean residential, String object, String postal_code) {
		super();
		this.street1 = street1;
		this.country = country;
		this.residential = residential;
		this.object = object;
		this.postal_code = postal_code;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isResidential() {
		return residential;
	}

	public void setResidential(boolean residential) {
		this.residential = residential;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	
    
}

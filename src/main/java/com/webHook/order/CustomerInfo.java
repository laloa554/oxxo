package com.webHook.order;

public class CustomerInfo{
	private String email;
    private String phone;
    private String name;
    private String object;
    
	public CustomerInfo() {
		super();
	}

	public CustomerInfo(String email, String phone, String name, String object) {
		super();
		this.email = email;
		this.phone = phone;
		this.name = name;
		this.object = object;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}
	
	
    
}

package com.webHook.Controller;

public class PaymentMethod{
    public String service_name;
    public String barcode_url;
    public String object;
    public String type;
    public int expires_at;
    public String store_name;
    public String reference;
    
	public PaymentMethod() {
		super();
	}

	public PaymentMethod(String service_name, String barcode_url, String object, String type, int expires_at,
			String store_name, String reference) {
		super();
		this.service_name = service_name;
		this.barcode_url = barcode_url;
		this.object = object;
		this.type = type;
		this.expires_at = expires_at;
		this.store_name = store_name;
		this.reference = reference;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getBarcode_url() {
		return barcode_url;
	}

	public void setBarcode_url(String barcode_url) {
		this.barcode_url = barcode_url;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getExpires_at() {
		return expires_at;
	}

	public void setExpires_at(int expires_at) {
		this.expires_at = expires_at;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
    
}
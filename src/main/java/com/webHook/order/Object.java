package com.webHook.order;

public class Object{
	private boolean livemode;
	private int amount;
	private String currency;
	private String payment_status;
	private int amount_refunded;
	private CustomerInfo customer_info;
	private ShippingContact shipping_contact;
	private String object;
	private String id;
	private Metadata metadata;
    private int created_at;
    private int updated_at;
    private LineItems line_items;
    private ShippingLines shipping_lines;
    private Charges charges;
    
	public Object() {
		super();
	}

	public Object(boolean livemode, int amount, String currency, String payment_status, int amount_refunded,
			CustomerInfo customer_info, ShippingContact shipping_contact, String object, String id, Metadata metadata,
			int created_at, int updated_at, LineItems line_items, ShippingLines shipping_lines, Charges charges) {
		super();
		this.livemode = livemode;
		this.amount = amount;
		this.currency = currency;
		this.payment_status = payment_status;
		this.amount_refunded = amount_refunded;
		this.customer_info = customer_info;
		this.shipping_contact = shipping_contact;
		this.object = object;
		this.id = id;
		this.metadata = metadata;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.line_items = line_items;
		this.shipping_lines = shipping_lines;
		this.charges = charges;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public int getAmount_refunded() {
		return amount_refunded;
	}

	public void setAmount_refunded(int amount_refunded) {
		this.amount_refunded = amount_refunded;
	}

	public CustomerInfo getCustomer_info() {
		return customer_info;
	}

	public void setCustomer_info(CustomerInfo customer_info) {
		this.customer_info = customer_info;
	}

	public ShippingContact getShipping_contact() {
		return shipping_contact;
	}

	public void setShipping_contact(ShippingContact shipping_contact) {
		this.shipping_contact = shipping_contact;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	public int getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(int updated_at) {
		this.updated_at = updated_at;
	}

	public LineItems getLine_items() {
		return line_items;
	}

	public void setLine_items(LineItems line_items) {
		this.line_items = line_items;
	}

	public ShippingLines getShipping_lines() {
		return shipping_lines;
	}

	public void setShipping_lines(ShippingLines shipping_lines) {
		this.shipping_lines = shipping_lines;
	}

	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}
    
	
    
}

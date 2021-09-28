package com.webHook.order;

public class Datum{
	private String name;
	private int unit_price;
	private int quantity;
    private String object;
    private String id;
    private String parent_id;
    private Metadata metadata;
    private AntifraudInfo antifraud_info;
    private int amount;
    private String carrier;
    private boolean livemode;
    private int created_at;
    private String currency;
    private PaymentMethod payment_method;
    private String description;
    private String status;
    private int paid_at;
    private int fee;
    private String customer_id;
    private String order_id;
    
	public Datum() {
		super();
	}

	public Datum(String name, int unit_price, int quantity, String object, String id, String parent_id,
			Metadata metadata, AntifraudInfo antifraud_info, int amount, String carrier, boolean livemode,
			int created_at, String currency, PaymentMethod payment_method, String description, String status,
			int paid_at, int fee, String customer_id, String order_id) {
		super();
		this.name = name;
		this.unit_price = unit_price;
		this.quantity = quantity;
		this.object = object;
		this.id = id;
		this.parent_id = parent_id;
		this.metadata = metadata;
		this.antifraud_info = antifraud_info;
		this.amount = amount;
		this.carrier = carrier;
		this.livemode = livemode;
		this.created_at = created_at;
		this.currency = currency;
		this.payment_method = payment_method;
		this.description = description;
		this.status = status;
		this.paid_at = paid_at;
		this.fee = fee;
		this.customer_id = customer_id;
		this.order_id = order_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public AntifraudInfo getAntifraud_info() {
		return antifraud_info;
	}

	public void setAntifraud_info(AntifraudInfo antifraud_info) {
		this.antifraud_info = antifraud_info;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public PaymentMethod getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(PaymentMethod payment_method) {
		this.payment_method = payment_method;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPaid_at() {
		return paid_at;
	}

	public void setPaid_at(int paid_at) {
		this.paid_at = paid_at;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
    
    
}

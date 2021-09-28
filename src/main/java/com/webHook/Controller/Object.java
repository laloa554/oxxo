package com.webHook.Controller;

public class Object{
    public String id;
    public boolean livemode;
    public int created_at;
    public String currency;
    public PaymentMethod payment_method;
    public String object;
    public String description;
    public String status;
    public int amount;
    public int paid_at;
    public int fee;
    public String customer_id;
    public String order_id;
    
    
	public Object() {
	
	}
	
	public Object(String id, boolean livemode, int created_at, String currency, PaymentMethod payment_method,
			String object, String description, String status, int amount, int paid_at, int fee, String customer_id,
			String order_id) {
		super();
		this.id = id;
		this.livemode = livemode;
		this.created_at = created_at;
		this.currency = currency;
		this.payment_method = payment_method;
		this.object = object;
		this.description = description;
		this.status = status;
		this.amount = amount;
		this.paid_at = paid_at;
		this.fee = fee;
		this.customer_id = customer_id;
		this.order_id = order_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
package com.webHook.Controller;

public class Data{
    public Object object;
    public PreviousAttributes previous_attributes;
    
	public Data(Object object, PreviousAttributes previous_attributes) {
		super();
		this.object = object;
		this.previous_attributes = previous_attributes;
	}
	
	public Data() {
		super();
	}
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public PreviousAttributes getPrevious_attributes() {
		return previous_attributes;
	}
	public void setPrevious_attributes(PreviousAttributes previous_attributes) {
		this.previous_attributes = previous_attributes;
	}
}
package com.webHook.order;

public class Root {
	private Object object;
	private PreviousAttributes previous_attributes;
	
	public Root() {
		super();
	}

	public Root(Object object, PreviousAttributes previous_attributes) {
		super();
		this.object = object;
		this.previous_attributes = previous_attributes;
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

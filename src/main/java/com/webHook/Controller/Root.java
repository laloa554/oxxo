package com.webHook.Controller;

import java.util.List;

public class Root{
    public Data data;
    public boolean livemode;
    public String webhook_status;
    public List<WebhookLog> webhook_logs;
    public String id;
    public String object;
    public String type;
    public int created_at;
    
	public Root() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Root(Data data, boolean livemode, String webhook_status, List<WebhookLog> webhook_logs, String id,
			String object, String type, int created_at) {
		super();
		this.data = data;
		this.livemode = livemode;
		this.webhook_status = webhook_status;
		this.webhook_logs = webhook_logs;
		this.id = id;
		this.object = object;
		this.type = type;
		this.created_at = created_at;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public String getWebhook_status() {
		return webhook_status;
	}

	public void setWebhook_status(String webhook_status) {
		this.webhook_status = webhook_status;
	}

	public List<WebhookLog> getWebhook_logs() {
		return webhook_logs;
	}

	public void setWebhook_logs(List<WebhookLog> webhook_logs) {
		this.webhook_logs = webhook_logs;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}
	
    
}

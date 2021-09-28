package com.webHook.Controller;

public class WebhookLog{
    public String id;
    public String url;
    public int failed_attempts;
    public int last_http_response_status;
    public String object;
    public int last_attempted_at;
    
	public WebhookLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebhookLog(String id, String url, int failed_attempts, int last_http_response_status, String object,
			int last_attempted_at) {
		super();
		this.id = id;
		this.url = url;
		this.failed_attempts = failed_attempts;
		this.last_http_response_status = last_http_response_status;
		this.object = object;
		this.last_attempted_at = last_attempted_at;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getFailed_attempts() {
		return failed_attempts;
	}

	public void setFailed_attempts(int failed_attempts) {
		this.failed_attempts = failed_attempts;
	}

	public int getLast_http_response_status() {
		return last_http_response_status;
	}

	public void setLast_http_response_status(int last_http_response_status) {
		this.last_http_response_status = last_http_response_status;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getLast_attempted_at() {
		return last_attempted_at;
	}

	public void setLast_attempted_at(int last_attempted_at) {
		this.last_attempted_at = last_attempted_at;
	}
    
}
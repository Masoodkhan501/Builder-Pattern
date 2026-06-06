package com.masood.Builder;

import java.util.Map;

public class HttpReqWithBuilder {
	
	public String url;
	public String method;
	public Map<String, String> header;
	public Map<String, String> qureyParam;
	public String body;
	public Integer timeOut;	
	
	HttpReqWithBuilder() {
	}
	
	public String execute() {
		return toString();
	}

	@Override
	public String toString() {
		return "HttpReqWithBuilder [url=" + url + ", method=" + method + ", header=" + header + ", qureyParam="
				+ qureyParam + ", body=" + body + ", timeOut=" + timeOut + "]";
	}

	
}

package com.masood.Builder;

import java.util.Map;

public class HttpReqWithBuilder {

	String url;
	String method;
	Map<String, String> header;
	Map<String, String> qureyParam;
	String body;
	Integer timeOut;

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

	public String getUrl() {
		return url;
	}

	public String getMethod() {
		return method;
	}

	public Map<String, String> getHeader() {
		return header;
	}

	public Map<String, String> getQureyParam() {
		return qureyParam;
	}

	public String getBody() {
		return body;
	}

	public Integer getTimeOut() {
		return timeOut;
	}

}

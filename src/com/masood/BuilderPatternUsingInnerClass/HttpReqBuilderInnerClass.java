package com.masood.BuilderPatternUsingInnerClass;

import java.util.Map;

public class HttpReqBuilderInnerClass {

	private String url;
	private String method;
	private Map<String, String> queryParam;
	private Map<String, String> headers;
	private String body;
	private Integer timeOut;

	private HttpReqBuilderInnerClass() {
	}

	public String getUrl() {
		return url;
	}

	public String getMethod() {
		return method;
	}

	public Map<String, String> getQueryParam() {
		return queryParam;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}

	public Integer getTimeOut() {
		return timeOut;
	}

	@Override
	public String toString() {
		return "HttpReqBuilderInnerClass [url=" + url + ", method=" + method + ", queryParam=" + queryParam
				+ ", headers=" + headers + ", body=" + body + ", timeOut=" + timeOut + "]";
	}
}

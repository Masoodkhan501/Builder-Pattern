package com.masood.Builder;

import java.util.Map;

public class HttpRequestBuilder {

	private HttpReqWithBuilder req = new HttpReqWithBuilder();

	public HttpRequestBuilder URL(String url) {
		req.url = url;
		return this;
	}

	public HttpRequestBuilder Method(String method) {
		req.method = method;
		return this;
	}

	public HttpRequestBuilder Header(Map<String, String> header) {
		req.header = header;
		return this;
	}

	public HttpRequestBuilder QueryParam(Map<String, String> queryParam) {
		req.qureyParam = queryParam;
		return this;
	}

	public HttpRequestBuilder Body(String body) {
		req.body = body;
		return this;
	}

	public HttpRequestBuilder TimeOut(Integer timeOut) {
		req.timeOut = timeOut;
		return this;
	}

	public HttpReqWithBuilder Build() {
		return req;
	}

	public static HttpRequestBuilder builder() {
		return new HttpRequestBuilder();
	}

}

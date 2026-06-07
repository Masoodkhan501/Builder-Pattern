package com.masood.Builder;

import java.util.Map;

import com.masood.ExceptionBundle.RequestValidationError;

public class HttpRequestBuilder {

	private HttpReqWithBuilder req = new HttpReqWithBuilder();

	public HttpRequestBuilder url(String url) {
		req.url = url;
		return this;
	}

	public HttpRequestBuilder method(String method) {
		req.method = method;
		return this;
	}

	public HttpRequestBuilder header(Map<String, String> header) {
		req.header = header;
		return this;
	}

	public HttpRequestBuilder queryParam(Map<String, String> queryParam) {
		req.qureyParam = queryParam;
		return this;
	}

	public HttpRequestBuilder body(String body) {
		req.body = body;
		return this;
	}

	public HttpRequestBuilder timeOut(Integer timeOut) {
		req.timeOut = timeOut;
		return this;
	}

	public HttpReqWithBuilder build() throws RequestValidationError {
		ValidateHttp.validate(req);
		return req;
	}

	public static HttpRequestBuilder builder() {
		return new HttpRequestBuilder();
	}

}

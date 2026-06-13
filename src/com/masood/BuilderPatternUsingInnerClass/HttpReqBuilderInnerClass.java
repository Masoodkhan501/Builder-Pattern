package com.masood.BuilderPatternUsingInnerClass;

import java.util.Map;

import com.masood.Builder.ValidateHttp;

public class HttpReqBuilderInnerClass {

	private final String url;
	private final String method;
	private final Map<String, String> queryParam;
	private final Map<String, String> headers;
	private final String body;
	private final Integer timeOut;

	private HttpReqBuilderInnerClass(HttpBuilder builder) {
		this.url = builder.url;
		this.method = builder.method;
		this.queryParam = builder.queryParam;
		this.headers = builder.headers;
		this.body = builder.body;
		this.timeOut = builder.timeOut;
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

	public static class HttpBuilder {

		private String url;
		private String method;
		private Map<String, String> queryParam;
		private Map<String, String> headers;
		private String body;
		private Integer timeOut;

		public HttpBuilder() {
		}

		public static HttpBuilder builder() {
			return new HttpBuilder();
		}
		
		public HttpBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttpBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttpBuilder headers(Map<String, String> headers) {
			this.headers = headers;
			return this;
		}

		public HttpBuilder queryParams(Map<String, String> queryparam) {
			this.queryParam = queryparam;
			return this;
		}

		public HttpBuilder body(String body) {
			this.body = body;
			return this;
		}

		public HttpBuilder timeOut(Integer timeOut) {
			this.timeOut = timeOut;
			return this;
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

		public HttpReqBuilderInnerClass build() {
			ValidateHttp.validateBuilder(this);
			return new HttpReqBuilderInnerClass(this);
		}
	}
}

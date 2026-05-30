package com.masood.HttpRequestObject;

import java.util.Map;

public class HttpReqWithoutBuilder {
	private String url;
	private String method;
	private Map<String, String> header;
	private Map<String, String> queryParam;
	private String body;
	private Integer timeOut;
	
	// Telescoping problem
	/*
	 * In this section u see we are building the constructors for each field or combo of it.
	 */
	
	// Constructor For single Field
	public HttpReqWithoutBuilder(String url){
		this.url = url;
	}
	
	// Constructor for accepting two fields (url, method)
	public HttpReqWithoutBuilder(String url, String method) {
		this.url = url;
		this.method = method;
	}
	
	//Constructor For accepting three fields
	public HttpReqWithoutBuilder(String url, String method, Integer timeOut) {
		this.url = url;
		this.method = method;
		this.timeOut = timeOut;
	}
	
	//Constructor for accepting all the fields
	public HttpReqWithoutBuilder(String url, String method, Map<String, String> header, 
			Map<String, String> queryParam, String body, Integer timeOut) {
		this.url = url;
		this.method = method;
		this.header = header;
		this.queryParam = queryParam;
		this.body = body;
		this.timeOut = timeOut;
	}
	
}

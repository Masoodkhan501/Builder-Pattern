package com.masood.HttpRequestObject;

import java.util.Map;

public class HttpReqWithoutBuilder {
	private String url;
	private String method;
	private Map<String, String> header;
	private Map<String, String> queryParam;
	private String body;
	private Integer timeOut;
	
	// 								1. Telescoping problem
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

	
	// 									2. This Shows MUTABLE problem
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public void setHeader(Map<String, String> header) {
		this.header = header;
	}
	
	public void setQueryParam(Map<String, String> queryParam) {
		this.queryParam = queryParam;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}
	
	//	4. Scattered validation(here u may not see but in real time for checking each field
	//     may need different if block with different checkers
	
	
	// Source for 3 problem that is inconsistent error
	public void execute(String url, String method, Map<String, String> header, 
			Map<String, String> queryParam, String body, Integer timeOut) {
		boolean validationfailed = false;
		if(url == null || method == null || 
				header == null || queryParam == null || body == null 
				|| timeOut == null) validationfailed = true;
		
		if(validationfailed) System.out.println("Some fields are missing please check before"
				+ "executing.");
		else System.out.println("Everything is fine u can execute");
		
	}
	
}

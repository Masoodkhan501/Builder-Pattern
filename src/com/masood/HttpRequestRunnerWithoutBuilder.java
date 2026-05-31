package com.masood;

import java.util.Map;

import com.masood.HttpRequestObject.HttpReqWithoutBuilder;

public class HttpRequestRunnerWithoutBuilder {
	public static void main(String[] args) {
		HttpReqWithoutBuilder req = new HttpReqWithoutBuilder("http://github.com/masoodkhan/Builderpattern");
		req.setBody("name : masood");
		req.setMethod("PATCH");
		req.setHeader(Map.of("cookie","something id we don't about it"));
		req.setQueryParam(Map.of("id","501"));
		
	// 	3. if i execute the req without setting the timeout maybe this can be a 
	//	required field in the req object. Validation field declared in the httpreq obj.
		
		req.execute();
	}
}

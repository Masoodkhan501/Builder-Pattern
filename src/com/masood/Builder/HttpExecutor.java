package com.masood.Builder;

import java.util.List;

public class HttpExecutor {
	
	private HttpReqWithBuilder req;
	
	public HttpExecutor(HttpReqWithBuilder req) {
		this.req = req;
	}
	
	public String execute() {
		List<String> errors = ValidateHttp.validate(req);
		String errorResult = "";
		if(errors.isEmpty()) return "everything is good. Executed perfectly";
		else {
			for(String error:errors) {
				errorResult += error;
			}
			return errorResult;
		}
	}

}

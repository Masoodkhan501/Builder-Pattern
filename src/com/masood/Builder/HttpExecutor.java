package com.masood.Builder;

import com.masood.ExceptionBundle.RequestValidationError;

public class HttpExecutor {
	
	private HttpReqWithBuilder req;
	
	public HttpExecutor(HttpReqWithBuilder req) {
		this.req = req;
	}
	
	public String execute() throws RequestValidationError{
		ValidateHttp.validate(req);
		return "everything is good. Executed perfectly";
	}

}

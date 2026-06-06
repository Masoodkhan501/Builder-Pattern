package com.masood.ExceptionBundle;

import java.util.List;

public class RequestValidationError extends RuntimeException{
	
	private List<String> errors;
	
	public RequestValidationError(List<String> errors) {
		this.errors = errors;
	}
	
	public String getMessage() {
		return errors.toString();
	}
	
}
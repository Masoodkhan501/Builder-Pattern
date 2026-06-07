package com.masood.ExceptionBundle;

import java.time.LocalDateTime;
import java.util.List;

public class RequestValidationError extends RuntimeException{
	
	private List<String> errors;
	private LocalDateTime timestamp;
	
	public RequestValidationError(List<String> errors, LocalDateTime timestamp) {
		this.timestamp = timestamp;
		this.errors = errors;
	}
	
	public String getMessage() {
		return timestamp+"\n\t"+errors.toString();
	}
	
}
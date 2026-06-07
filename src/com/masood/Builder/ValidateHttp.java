package com.masood.Builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.masood.ExceptionBundle.RequestValidationError;

public class ValidateHttp {
	
	
	
	public static List<String> validate(HttpReqWithBuilder req) throws RequestValidationError {
		List<String> errors = new ArrayList<String>();
		if(req.url == null) {
			errors.add("Missing URL which is an important field for a request\n\t");
		} if(req.method == null) {
			errors.add("Missing METHOD field which is an important field\n\t");
		} if(req.timeOut == null) {
			errors.add("TimeOut field can't be null for the security reasons\n\t");
		}
		if(!errors.isEmpty()) throw new RequestValidationError(errors,LocalDateTime.now());
		return errors;
	}

}

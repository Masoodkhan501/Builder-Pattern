package com.masood.Builder;

import java.util.ArrayList;
import java.util.List;

public class ValidateHttp {
	
	
	
	public static List<String> validate(HttpReqWithBuilder req) {
		List<String> errors = new ArrayList<String>();
		if(req.url == null) {
			errors.add("Missing URL which is an important field for a request");
		} if(req.method == null) {
			errors.add("Missing METHOD field which is an important field");
		} if(req.timeOut == null) {
			errors.add("TimeOut field can't be null for the security reasons");
		}
		
		return errors;
	}

}

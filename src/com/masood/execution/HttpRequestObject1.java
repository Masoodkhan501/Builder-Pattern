package com.masood.execution;

import com.masood.Builder.HttpExecutor;
import com.masood.Builder.HttpReqWithBuilder;
import com.masood.Builder.HttpRequestBuilder;
import com.masood.BuilderPatternUsingInnerClass.HttpReqBuilderInnerClass;
import com.masood.ExceptionBundle.RequestValidationError;

//import com.masood.WithoutBuilderClasses.HttpRequestRunnerWithoutBuilder;

public class HttpRequestObject1 {
	public static void main(String[] args) {
		
		/* for executing the code which doesn't implement the builder pattern */
		
		
//		HttpRequestRunnerWithoutBuilder req = new HttpRequestRunnerWithoutBuilder();
//		req.execute();
		
		/* execution code which implements the builder pattern */
		
//		try {
//			HttpReqWithBuilder req = HttpRequestBuilder.builder().url("https://google.com").build();
//			HttpExecutor executor = new HttpExecutor(req);
//			String result = executor.execute();
//			System.out.println(result);
//		} catch(RequestValidationError re) {
//			System.out.println(re.getMessage());
//		}
//		
		
		/* Execution using Builder Inner class */
		
		try {
			HttpReqBuilderInnerClass req = HttpReqBuilderInnerClass.HttpBuilder.builder()
			.url("https://github.com/masoodkhan")
			.build();
			System.out.println(req);
		}catch(RequestValidationError re) {
			System.out.println(re.getMessage());
		}
		
			
	}
}

/**
 * 
 */
package com.example.training;

import com.example.training.service.HelloWorldServiceI;

/**
 * @author gilantonio
 *
 */
public class HelloWorld {
	
	   private HelloWorldServiceI service;

	   public String getMessage(){
		   return service.getMessage();
	   }

	public void setService(HelloWorldServiceI service) {
		this.service = service;
	}
	}
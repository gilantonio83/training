package com.example.training.service;

import com.example.training.repository.HelloWorldRepositoryI;

public class HelloWorldServiceImpl implements HelloWorldServiceI{

	private HelloWorldRepositoryI repository;
	
	public HelloWorldServiceImpl(HelloWorldRepositoryI repository) {
		super();
		this.repository = repository;
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return repository.getCustomerData();
	}

}

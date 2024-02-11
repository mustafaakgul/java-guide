package org.javaturk.spring.di.ch01.dependency.general;

public class Client {
	
	private Service service;
	
	public void start() {
		service.doIt();
	}

}

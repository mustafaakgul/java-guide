package org.javaturk.spring.di.ch01.dependency.method;

public class Client {

	private Service service;

	public void setService(Service service){
	    this.service = service;
	  }
}

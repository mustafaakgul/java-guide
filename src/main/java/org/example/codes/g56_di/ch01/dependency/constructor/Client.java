package org.javaturk.spring.di.ch01.dependency.constructor;

public class Client {

	private Service service;

	public Client() {
		service = new Service();
	}
}

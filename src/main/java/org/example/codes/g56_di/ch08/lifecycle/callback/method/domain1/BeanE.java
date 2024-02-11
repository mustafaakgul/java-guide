package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1;

public class BeanE {
	
	public void startUp() {
		System.err.println("in BeanE startUp()");
	}
	
	public void cleanResources() {
		System.err.println("in BeanE cleanResources()");
	}
}

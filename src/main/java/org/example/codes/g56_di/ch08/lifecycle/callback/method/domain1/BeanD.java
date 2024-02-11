package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanD implements AutoCloseable{
	
	public void defaultStartUp() {
		System.err.println("in BeanD defaultStartUp()");
	}
	
	public void close() {
		System.err.println("in BeanD close()");
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanD init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanD shutDown()");
	}
}

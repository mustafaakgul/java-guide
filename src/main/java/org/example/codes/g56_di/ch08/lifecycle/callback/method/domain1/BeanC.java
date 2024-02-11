package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanC {

	@Override
	public String toString() {
		return "BeanC";
	}
	
	public void defaultStartUp() {
		System.err.println("in BeanC defaultStartUp()");
	}
	
	public void defaultCleanUp() {
		System.err.println("in BeanC defaultCleanUp()");
	}
	
	public void startUp() {
		System.err.println("in BeanC startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanC cleanUp()");
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanC init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanC shutDown()");
	}
}

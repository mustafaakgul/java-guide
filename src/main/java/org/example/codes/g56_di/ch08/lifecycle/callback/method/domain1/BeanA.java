package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanA {
	
	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
//	public void defaultStartUp() {
//		System.err.println("in BeanA defaultStartUp()");
//	}
//	
//	public void defaultCleanUp() {
//		System.err.println("in BeanA defaultCleanUp()");
//	}
	
	public void startUp() {
		System.err.println("in BeanA startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanA cleanUp()");
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanA init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanA shutDown()");
	}
}

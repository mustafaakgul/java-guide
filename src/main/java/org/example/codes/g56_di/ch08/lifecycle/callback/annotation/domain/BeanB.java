package org.javaturk.spring.di.ch08.lifecycle.callback.annotation.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanB {

	private BeanC beanC;

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
	@Override
	public String toString() {
		if(beanC != null)
			return "BeanB: " + beanC.toString();
		else
			return "BeanB: " + "beanC is null";
	}
	
	public void startUp() {
		System.err.println("in BeanB startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanB cleanUp()");
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanB init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanB shutDown()");
	}
}

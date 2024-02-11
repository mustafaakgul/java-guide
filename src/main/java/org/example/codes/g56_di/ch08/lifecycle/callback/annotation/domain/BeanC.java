package org.javaturk.spring.di.ch08.lifecycle.callback.annotation.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanC {

	@Override
	public String toString() {
		return "BeanC";
	}
	
	public void startUp() {
		System.err.println("in BeanC startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanC cleanUp()");
	}
}

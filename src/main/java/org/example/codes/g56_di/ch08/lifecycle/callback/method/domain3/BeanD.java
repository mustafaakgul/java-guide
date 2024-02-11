package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BeanD {
	
	public void defaultStartUp() {
		System.err.println("in BeanD defaultStartUp()");
	}
	
	public void defaultCleanUp() {
		System.err.println("in BeanD defaultCleanUp()");
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

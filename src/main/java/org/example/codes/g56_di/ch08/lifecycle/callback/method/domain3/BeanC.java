package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BeanC {

	@Override
	public String toString() {
		return "BeanC";
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

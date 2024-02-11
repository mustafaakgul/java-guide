package org.javaturk.spring.di.ch08.lifecycle.callback.interfaces.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class BeanC{

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

package org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BeanD {

	@Override
	public String toString() {
		return "BeanD []";
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

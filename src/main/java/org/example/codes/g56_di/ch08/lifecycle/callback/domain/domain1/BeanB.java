package org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanB init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanB shutDown()");
	}

	@Override
	public String toString() {
		return "BeanB []";
	}
}

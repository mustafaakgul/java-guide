package org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1.BeanD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanF {
	private String name;
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanF [name= " + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanF init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanF shutDown()");
	}
}

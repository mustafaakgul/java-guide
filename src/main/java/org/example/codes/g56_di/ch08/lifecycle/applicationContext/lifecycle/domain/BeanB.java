package org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	private String name;
	private BeanC beanC;
	
	public BeanB() {
		System.err.println("in BeanB()");
	}

	public String getName() {
		return name;
	}
	
	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
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

package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

	private BeanC beanC;

	@Autowired
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
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanB init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanB shutDown()");
	}
}

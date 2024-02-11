package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope("prototype")
public class BeanA {
	
	private BeanB beanB;

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in BeanA init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanA shutDown()");
	}
}

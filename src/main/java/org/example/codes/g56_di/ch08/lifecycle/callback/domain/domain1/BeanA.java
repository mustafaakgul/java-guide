package org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BeanA {
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

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

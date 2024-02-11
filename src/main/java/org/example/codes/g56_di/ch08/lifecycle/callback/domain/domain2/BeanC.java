package org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class BeanC {
	private BeanD beanD;
	
	@Autowired
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	@Override
	public String toString() {
		return "BeanC [beanD=" + beanD + "]";
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

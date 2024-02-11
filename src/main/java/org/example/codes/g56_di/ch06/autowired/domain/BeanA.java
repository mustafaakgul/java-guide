package org.javaturk.spring.di.ch06.autowired.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	private BeanB beanB;
	private BeanC beanC;
	
	@Autowired
	public BeanA(BeanB beanB, BeanC beanC) {
		this.beanB = beanB;
		this.beanC = beanC;
	}

	// That's problem!
//	@Autowired
//	public BeanA(BeanB beanB) {
//		super();
//		this.beanB = beanB;
//	}	

	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}
}

package org.javaturk.spring.di.ch05.lazy.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {
	private String name;
	private BeanB beanB;
	
	@Autowired
	public BeanA(String name) {
		System.err.println("in BeanA()");
		this.name = name;
	}

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + ", beanB=" + beanB + "]";
	}
}

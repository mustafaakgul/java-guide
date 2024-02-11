package org.javaturk.spring.di.ch08.lazy.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BeanA {
	private String name;
	private BeanB beanB;
	
	@Autowired
	public BeanA(String name) {
		System.err.println("in BeanA()");
		this.name = name;
	}

	@Autowired
	public void setBeanB(@Lazy BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Bean
	public static String name() {
		return "BEAN-A";
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + ", beanB=" + beanB + "]";
	}
}

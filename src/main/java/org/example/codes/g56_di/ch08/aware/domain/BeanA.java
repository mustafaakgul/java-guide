package org.javaturk.spring.di.ch08.aware.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("BEAN_A")
public class BeanA implements BeanNameAware{
	private String name;
	
	@Autowired
	public void setName(String name) {
		System.err.println("in setName() of BeanA: " + this.name + " - " + name);
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.err.println("in setBeanName() of BeanA: " + this.name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + "]";
	}
}

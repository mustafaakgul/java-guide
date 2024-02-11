package org.javaturk.spring.di.ch08.aware.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("B_E_A_N__B")
public class BeanB implements BeanNameAware, BeanFactoryAware {
	private BeanFactory beanFactory;
	private String name;

	@Autowired
	public void setName(String name) {
		System.err.println("in setName() of BeanB: " + this.name + " - " + name);
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.err.println("in setBeanName() of BeanB: " + this.name);
		this.name = name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.err.println("in setBeanFactory() of BeanB");
		this.beanFactory = beanFactory;
		BeanC beanC = beanFactory.getBean(BeanC.class);
		System.out.println("Reaching BeanC: " + beanC);
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
	}
}

package org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	private BeanB beanB;
	
	public BeanA() {
		System.err.println("in BeanA()");
	}

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}

	@PostConstruct
	public void init() {
		System.err.println("in BeanA init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in BeanA shutDown()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.err.println("in setApplicationContext() of BeanA");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.err.println("in setBeanFactory() of BeanA");		
	}

	@Override
	public void setBeanName(String name) {
		System.err.println("\nin setBeanName() of BeanA");		
	}
}

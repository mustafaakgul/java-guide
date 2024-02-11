package org.javaturk.spring.di.ch08.aware.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("B_E_A_N__C")
public class BeanC implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	private ApplicationContext applicationContext;
	private BeanFactory beanFactory;
	private String name;

	@Autowired
	public void setName(String name) {
		System.err.println("in setName() of BeanC: " + this.name + " - " + name);
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.err.println("in setBeanName() of BeanC: " + this.name);
		this.name = name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.err.println("in setBeanFactory() of BeanC");
		this.beanFactory = beanFactory;
	}

	@Override
	public String toString() {
		return "BeanC [name=" + name + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.err.println("in setApplicationContext() of BeanC");
		this.applicationContext = applicationContext;
		Environment env = applicationContext.getEnvironment();
		String username = env.getProperty("user.name");
		System.out.println("Username: " + username);
	}
}

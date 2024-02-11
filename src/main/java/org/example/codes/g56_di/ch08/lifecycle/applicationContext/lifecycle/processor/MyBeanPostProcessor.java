package org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before postProcessBeforeInitialization: " + bean.getClass().getName() + ": " + bean);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After postProcessAfterInitialization: " + bean.getClass().getName() + ": " + bean);
		return bean;
	}
}

package org.javaturk.spring.di.ch08.lifecycle.callback.annotation;

import org.javaturk.spring.di.ch08.lifecycle.callback.annotation.domain.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifecycleExample {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
//		BeanA beanA = context.getBean(BeanA.class);
//		BeanB beanB = context.getBean(BeanB.class);
//		BeanC beanC = context.getBean(BeanC.class);

		System.out.println();

		((AbstractApplicationContext) context).close();
//		((AbstractApplicationContext) context).registerShutdownHook();

//		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
//		for(String beanName : context.getBeanDefinitionNames())
//	        registry.removeBeanDefinition(beanName);

	}
}

package org.javaturk.spring.di.ch08.lifecycle.callback.interfaces;

import org.javaturk.spring.di.ch08.lifecycle.callback.interfaces.domain.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class InterfaceLifecycleExample {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(InterfaceLifecycleExample.class);

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

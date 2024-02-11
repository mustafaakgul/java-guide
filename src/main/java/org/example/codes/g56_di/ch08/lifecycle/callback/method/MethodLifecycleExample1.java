package org.javaturk.spring.di.ch08.lifecycle.callback.method;

import org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodLifecycleExample1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch08/lifecycle/callback/method/resources/beans.xml");

//		BeanA beanA = context.getBean(BeanA.class);
//		BeanB beanB = context.getBean(BeanB.class);
//		BeanC beanC = context.getBean(BeanC.class);
//		BeanD beanD = context.getBean(BeanD.class);
		BeanE beanE = context.getBean(BeanE.class);
//		System.out.println(beanE);

		System.out.println();

		((AbstractApplicationContext) context).close();
//		((AbstractApplicationContext) context).registerShutdownHook();

//		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
//		for(String beanName : context.getBeanDefinitionNames())
//	        registry.removeBeanDefinition(beanName);
	}
}

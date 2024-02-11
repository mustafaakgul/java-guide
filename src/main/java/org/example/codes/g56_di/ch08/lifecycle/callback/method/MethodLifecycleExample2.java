package org.javaturk.spring.di.ch08.lifecycle.callback.method;

import org.javaturk.spring.di.ch08.lifecycle.callback.method.domain2.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("org.javaturk.spring.di.ch08.lifecycle.callback.method.domain2")
public class MethodLifecycleExample2 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MethodLifecycleExample2.class);

//		BeanA beanA = context.getBean(BeanA.class);
//		BeanB beanB = context.getBean(BeanB.class);
//		BeanC beanC = context.getBean(BeanC.class);
		BeanE beanE = context.getBean(BeanE.class);
		
//		((AbstractApplicationContext) context).close();
//		((AbstractApplicationContext) context).registerShutdownHook();
		
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
		for(String beanName : context.getBeanDefinitionNames())
	        registry.removeBeanDefinition(beanName);
	}
}

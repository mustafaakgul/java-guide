package org.javaturk.spring.di.ch05.bean.factory;

import org.javaturk.spring.di.ch04.domain.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryExample {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch05/bean/factory/resources/beans.xml");
		
		useStaticFactoryMethod(context);
		useFactoryMethod(context);
	}
	
	
	public static void useStaticFactoryMethod(ApplicationContext context) {
		BeanA beanA = (BeanA) context.getBean("beanAThroughStaticFactory");
		System.out.println("beanA2ThroughStaticFactory: " + beanA);
	}
	
	public static void useFactoryMethod(ApplicationContext context) {
		BeanA beanA = (BeanA) context.getBean("beanAThroughFactory");
		System.out.println("beanA2ThroughFactory: " + beanA);
	}
}

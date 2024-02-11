package org.javaturk.spring.di.ch06.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/required/resources/beans.xml");

		BeanA beanA = context.getBean(BeanA.class);
		System.out.println(beanA);
		beanA.doThis();

		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
}

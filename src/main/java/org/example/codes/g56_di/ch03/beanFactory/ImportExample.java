package org.javaturk.spring.di.ch03.beanFactory;

import org.javaturk.spring.di.ch03.domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImportExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch03/beanFactory/resources/importedBeans.xml");		
		
		BeanA beanA = (BeanA) context.getBean("beanA"); 
		System.out.println(beanA);
		
	}
}

package org.javaturk.spring.di.ch05.injection.collection;

import org.javaturk.spring.di.ch05.domain.CollectionBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch05/injection/collection/resources/collection.xml");
		
		injectIntoConstructor(context);
	}
	
	public static void injectIntoConstructor(ApplicationContext context) {
		CollectionBean cb1 = (CollectionBean) context.getBean("constructor1");
		System.out.println(cb1);
	}
}

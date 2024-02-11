package org.javaturk.spring.di.ch06.qualifier.generics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/qualifier/generics/resources/beans1.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/qualifier/generics/resources/beans2.xml");

		getBeans(context);
	}

	public static void getBeans(ApplicationContext context) {
		Person person = (Person) context.getBean("person");
		System.out.println(person);

		DeliveryPoint homeAddress = person.getHomeAddress();
		System.out.println(homeAddress);

		DeliveryPoint officeAddress = person.getOfficeAddress();
		System.out.println(officeAddress);
	}
}

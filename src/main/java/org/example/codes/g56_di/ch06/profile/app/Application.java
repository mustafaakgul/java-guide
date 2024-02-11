package org.javaturk.spring.di.ch06.profile.app;

import org.javaturk.spring.di.ch06.profile.domain.address.Person;
import org.javaturk.spring.di.ch06.profile.domain.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;


public class Application {
	public static void main(String[] args) throws Exception {
//		getBeans1();
//		getBeans2();
		getBeans3();
	}

	public static void getBeans1() {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "home");

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/profile/resources/beans1.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);

		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "office");
		context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/profile/resources/beans1.xml");

		person = (Person) context.getBean("person");
		System.out.println(person);
	}
	
	/**
	 * Use -Dspring.profiles.active=home for this emthod.
	 */
	public static void getBeans2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/profile/resources/beans1.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
	
	public static void getBeans3() {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "PostgreSQL, MySQL");

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/profile/resources/beans1.xml");

		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);

		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);
		
		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);
		
		BeanD beanD = (BeanD) context.getBean("beanD");
		System.out.println(beanD);
	}
}

package org.javaturk.spring.di.ch04;

import java.util.Arrays;

import org.javaturk.spring.di.ch04.domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextExample {

	public static void main(String[] args) {
		loadBeans1();
		loadBeans2();
		loadBeans3();
		loadBeans4();
		loadBeans5();
		loadBeans6();
	}
	
	public static void loadBeans1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		context.setConfigLocation("org/javaturk/spring/di/ch04/resources/beans.xml");
		context.refresh();
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch04/resources/beans.xml");
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}

	public static void loadBeans3() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch04/resources/beans.xml", "org/javaturk/spring/di/ch04/resources/anotherBeans.xml");		
		BeanD beanD = context.getBean(BeanD.class);
		System.out.println(beanD);
	}
	
	public static void loadBeans4() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch04/resources/beans.xml", "org/javaturk/spring/di/ch04/resources/anotherBeans.xml");		
//		BeanC beanc = context.getBean(BeanC.class); // Problem when there are more than one bean definition.
//		System.out.println(beanc);
		
		String[] beanNamesForBeanC = context.getBeanNamesForType(BeanC.class);
		System.out.println("\nBean definition names for type BeanC:");
		Arrays.stream(beanNamesForBeanC).forEach(System.out::println);
	}
	
	public static void loadBeans5() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch04/resources/beans.xml", "org/javaturk/spring/di/ch04/resources/anotherBeans.xml");		
		BeanE beanE = (BeanE) context.getBean("beanE"); // Bean and its dependencies may be in different resources.
		System.out.println(beanE);
	}
	
	public static void loadBeans6() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch04/resources/beans.xml", "org/javaturk/spring/di/ch04/resources/anotherBeans.xml", "org/javaturk/spring/di/ch04/resources/yetAnotherBeans.xml");		
		BeanE beanE = (BeanE) context.getBean("beanE"); // In case of multiple config locations, later bean definitions will override ones defined in earlier loaded files. 
		System.out.println(beanE);
	}
}

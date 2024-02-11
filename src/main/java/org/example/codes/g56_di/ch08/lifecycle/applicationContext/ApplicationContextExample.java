package org.javaturk.spring.di.ch08.lifecycle.applicationContext;

import java.util.Arrays;

import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExample {

	public static void main(String[] args) {
//		refreshExample();
//		closeExample();
//		removeBeansExample();
		registerShutdownHookExample();
	}

	public static void refreshExample() {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		context.setConfigLocation("classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans1.xml");
//		listBeans(context); // Before refresh, it is a problem!
		context.refresh();
		listBeans(context);
		context.getBean("beanA");

		System.out.println("Contains bean definition: " + context.containsBeanDefinition("beanD"));
		BeanD beanD1 = context.getBean(BeanD.class);
		System.out.println(beanD1);
//
		context.setConfigLocation("classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans2.xml");
		context.refresh();
		listBeans(context);

//		Load first configuration one more time and see the difference between beanD1 and beanD2
		context.setConfigLocation("classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans1.xml");
//		// Comment out this and see the difference between beanD1 and beanD2
		context.refresh();
		listBeans(context);
		
		BeanD beanD2 = context.getBean(BeanD.class);
		if (beanD1 == beanD2)
			System.out.println("The same");
		else
			System.out.println("Different");

	}

	public static void closeExample() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans1.xml");
		listBeans(context);
//		context.refresh(); // No need for refresh()
		context.close();
//		listBeans(context);
		System.out.println("Contains bean definition: " + context.containsBeanDefinition("beanD"));
		BeanD beanD1 = context.getBean(BeanD.class);
		System.out.println(beanD1);
	}
	
	public static void removeBeansExample() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans1.xml");
		listBeans(context);
		BeanA beanA1 = context.getBean(BeanA.class);
		System.out.println(beanA1);
		BeanB beanB1 = context.getBean(BeanB.class);
		System.out.println(beanB1);

		System.out.println("\nRemoving beans");
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("Removing " + beanName + " from bean registry.");
			registry.removeBeanDefinition(beanName);
		}

		listBeans(context);
		
//		beanA1 = context.getBean(BeanA.class);
		System.out.println(beanA1);
//		beanB1 = context.getBean(BeanB.class);
		System.out.println(beanB1);
	}

	public static void registerShutdownHookExample() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:org/javaturk/spring/di/ch08/lifecycle/applicationContext/resources/beans1.xml");

		System.out.println("Contains bean definition: " + context.containsBeanDefinition("beanD"));
		BeanD beanD1 = context.getBean(BeanD.class);
		System.out.println(beanD1);

		context.registerShutdownHook();

		BeanD beanD2 = context.getBean(BeanD.class);
		System.out.println(beanD2);
	}

	public static void listBeans(ApplicationContext context) {
		System.out.println("\nListing beans: " + context.getBeanDefinitionCount() + " beans defined.");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println();
	}
}

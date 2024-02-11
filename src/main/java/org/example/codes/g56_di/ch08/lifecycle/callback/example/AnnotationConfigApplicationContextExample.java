package org.javaturk.spring.di.ch08.lifecycle.callback.example;

import java.util.Arrays;

import org.javaturk.spring.di.ch08.lifecycle.callback.example.conf.AnnotationConfigApplicationContextExampleAppConfig;
import org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain1.*;
import org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain2.*;
import org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain3.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1", "org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain2" })
public class AnnotationConfigApplicationContextExample {

	public static void main(String[] args) {
//		getBeans1();
//		getBeans2();
//		getBeans3();
//		getBeans4();
//		getBeans5();
//		getBeans6();
//		getBeans7();
//		getBeans8();
//		getBeans9();
//		getBeans10();
		getBeans11();
	}

	public static void getBeans1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExample.class);
		context.close();
	}

	public static void getBeans2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1");
		context.refresh();
		BeanA beanA = (BeanA) context.getBean("beanA");
		context.close();
	}

	public static void getBeans3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1");
		BeanA beanA = (BeanA) context.getBean("beanA");
		context.close();
	}

	public static void getBeans4() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1");
		BeanA beanA = (BeanA) context.getBean("beanA");
		listBeans(context);
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain2");
		listBeans(context);
//		context.getBean("beanC");
//		context.getBean("beanD");
		context.close();
	}

	public static void getBeans5() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExampleAppConfig.class);
		context.close();
	}

	public static void getBeans6() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AnnotationConfigApplicationContextExampleAppConfig.class);
		context.refresh();
		listBeans(context);
		context.close();
	}

	/**
	 * Uses several scan() calls
	 */
	public static void getBeans7() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1");
		context.refresh();
		listBeans(context);
		
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain2");
		listBeans(context);
		
		context.getBean("beanC");
		context.getBean("beanD");

		context.close();
	}
	
	/**
	 * Uses several register() calls
	 */
	public static void getBeans8() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanA.class);
		context.refresh();
		listBeans(context);
		
		context.register(BeanB.class);
		listBeans(context);
		context.getBean("beanA");
		context.getBean("beanB");

		context.close();
	}
	
	/**
	 * Uses several register() calls. One of them registers a class with @Configuration
	 */
	public static void getBeans9() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanA.class);
		context.refresh();
		listBeans(context);
//		
		context.register(AnnotationConfigApplicationContextExampleAppConfig.class);
//		context.refresh(); // It needs this call otherwise BeanE and BeanF won't be available.
		listBeans(context);
		context.getBean("beanA");
		context.getBean("beanE");

		context.close();
	}

	/**
	 * Uses several scan() calls. One of them registers a class with @Configuration
	 */
	public static void getBeans10() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain1");
		context.refresh();
//		context.getBean("beanA");
		listBeans(context);
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.example.conf");
//		context.register(AnnotationConfigApplicationContextExampleAppConfig.class);
//		context.refresh(); // It needs this call otherwise BeanE and BeanF won't be available.
		listBeans(context);
		context.getBean("beanE");
		context.getBean("beanF");

		context.close();
	}
	
	/**
	 * Uses several scan() calls.
	 */
	public static void getBeans11() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain1");
		context.refresh();
		listBeans(context);

		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain2");
		listBeans(context);
		context.getBean("beanC");
		context.getBean("beanD");
		
		context.scan("org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain3");
		listBeans(context);
		context.getBean("beanE");
		context.getBean("beanF");

		context.close();
	}

	public static void listBeans(AnnotationConfigApplicationContext context) {
		System.out.println("\nListing beans: " + context.getBeanDefinitionCount() + " beans defined.");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println();
	}
}


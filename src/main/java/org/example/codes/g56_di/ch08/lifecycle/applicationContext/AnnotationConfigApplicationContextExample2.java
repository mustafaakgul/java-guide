package org.javaturk.spring.di.ch08.lifecycle.applicationContext;

import java.util.Arrays;
import java.util.List;

import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1.*;
import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain2.BeanE;
import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain2.BeanF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AnnotationConfigApplicationContextExample2 {

	@Autowired
	private List<BeanC> beanCs;

	public static void main(String[] args) {
//		register1();
//		register2();
		register3();
//		new AnnotationConfigApplicationContextExample2().getBeans();
//		scan();

	}

	public static void register1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		listBeans(context);
		context.register(BeanA.class);

		context.refresh();
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
		listBeans(context);

		System.out.println("\nAfter refresh()\n");

		context.register(BeanB.class);
		context.register(BeanC.class);

		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);
		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);
		listBeans(context);
//
////		listBeans(context);
//		context.register(BeanD.class);
//		context.register(BeanE.class);
//		context.register(BeanF.class);
////		listBeans(context);
//		BeanE beanE = (BeanE) context.getBean("beanE");
//		System.out.println(beanE);
//		BeanF beanF = (BeanF) context.getBean("beanF");
//		System.out.println(beanF);
//		context.refresh();

	}

	public static void register2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1");
		listBeans(context);
//		context.refresh();
		context.register(BeanE.class);
		context.register(BeanF.class);
		listBeans(context);
	}

	public static void register3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanC.class);
		BeanC beanC0 = (BeanC) context.getBean("beanC");
		System.out.println(beanC0);
		listBeans(context);
//		context.register(BeanD.class);
//		context.register(BeanE.class);
//		context.register(BeanF.class);
		context.register(BeanC.class);
		beanC0 = (BeanC) context.getBean("beanC");
		System.out.println(beanC0);
//		context.register(BeanE.class);
		context.register(BeanC.class);
		context.register(BeanC.class);
		listBeans(context);
		context.register(BeanC.class);

		BeanC beanC1 = (BeanC) context.getBean("beanC");
		BeanC beanC2 = (BeanC) context.getBean("beanC");
		if (beanC1 == beanC2)
			System.out.println("The same: " + beanC1.hashCode() + " " + beanC2.hashCode());
		else
			System.out.println("Diferent: " + beanC1.hashCode() + " " + beanC2.hashCode());

	}

	public void getBeans() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExample2.class,
				BeanC.class);
//		BeanA beanA = (BeanA) context.getBean("beanA");
//		System.out.println(beanA);
		AnnotationConfigApplicationContextExample2 acace = (AnnotationConfigApplicationContextExample2) context
				.getBean("annotationConfigApplicationContextExample2");
		listBeansCs(acace);

//		listBeans(context);

//		context.register(BeanB.class);
//		listBeans(context);

		context.register(BeanC.class);
		context.getBean("beanC");
		context.register(BeanC.class);
		context.getBean("beanC");
		context.register(BeanC.class);
		System.out.println("***************");
		listBeansCs(acace);
		System.out.println("***************");
//		
//		beanA = (BeanA) context.getBean("beanA");
//		BeanB beanB = (BeanB) context.getBean("beanB");
//
////		listBeans(context);
//
		context.register(BeanC.class);
		context.getBean("beanC");
		context.register(BeanC.class);
		context.getBean("beanC");
//		context.register(BeanC.class);
		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);

//		if (beanC == beanB.getBeanC())
//			System.out.println("The same");
//		else
//			System.out.println("Different");

		context.getBean("beanC");
		context.register(BeanC.class);
		System.out.println("***************");
		listBeansCs(acace);
		System.out.println("***************");
//		listBeans(context);
	}

	public static void scan() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain2");
//		context.refresh();
		context.register(BeanD.class);
		context.refresh();
		BeanF beanF = (BeanF) context.getBean("beanF");
		System.out.println(beanF);

		listBeans(context);
		context.register(BeanA.class);
		context.register(BeanB.class);
		listBeans(context);

	}

	public static void listBeans(AnnotationConfigApplicationContext context) {
		System.out.println("\nListing beans: " + context.getBeanDefinitionCount() + " beans defined.");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println();
	}

	public void listBeansCs(AnnotationConfigApplicationContextExample2 acace) {
		System.out.println("\nListing BeanC instances: " + acace.beanCs.size() + " beans defined.");
		System.out.println("Instance: " + (acace.beanCs.get(0)) + " hash code: " + acace.beanCs.get(0).hashCode());
		System.out.println();
	}
}

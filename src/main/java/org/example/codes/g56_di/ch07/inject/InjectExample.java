package org.javaturk.spring.di.ch07.inject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.javaturk.spring.di.ch07.inject.domain.*;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

@ComponentScan({"org.javaturk.spring.di.ch07.inject.domain", "org.javaturk.spring.di.ch07.inject.conf"})
public class InjectExample {

	public static void main(String[] args) {

//		Weld weld = new Weld();
//		WeldContainer container = weld.initialize();
//		BeanA beanA = container.select(BeanA.class).get();
//		System.out.println(beanA);

//		container.shutdown();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InjectExample.class);
		getBeans(context);
//		checkSingleton(context);
	}
	
	public static void getBeans(AnnotationConfigApplicationContext context) {
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);
		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);
		BeanD beanD = (BeanD) context.getBean("beanD");
		System.out.println(beanD);
		BeanE beanE = (BeanE) context.getBean("beanE");
		System.out.println(beanE);
	}
	
	public static void checkSingleton(AnnotationConfigApplicationContext context) {
		BeanA beanA1 = (BeanA) context.getBean("beanA");
		BeanA beanA2 = (BeanA) context.getBean("beanA");
		if(beanA1 == beanA2)
			System.out.println("Singleton");
		else
			System.out.println("Prototype");
	}
}
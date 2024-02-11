package org.javaturk.spring.di.ch07.configuration;

import org.javaturk.spring.di.ch07.configuration.conf.*;
import org.javaturk.spring.di.ch07.configuration.domain.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackageClasses={org.javaturk.spring.di.ch07.configuration.conf.Configuration1.class})
//@ComponentScan(basePackages={"org.javaturk.spring.di.ch07.configuration.conf"})
//@ComponentScan
@Import({org.javaturk.spring.di.ch07.configuration.conf.Configuration1.class, org.javaturk.spring.di.ch07.configuration.conf.Configuration2.class, org.javaturk.spring.di.ch07.configuration.conf.Configuration3.class})
public class ConfigurationExample {
	public static void main(String[] args) {
//		loadConfiguration10();
//		loadConfiguration11();
//		loadConfiguration2();
//		loadConfiguration3();
		checkSingleton();
	}
	
	private static void checkSingleton() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaturk.spring.di.ch07.configuration.conf");
		 BeanA beanA1 = context.getBean(BeanA.class);	
		 BeanA beanA2 = context.getBean(BeanA.class);
		 if(beanA1 == beanA2)
			 System.out.println("Singleton");
		 else
			 System.out.println("Prototype");
	}

	public static void loadConfiguration10() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 context.register(Configuration1.class); // No need to use @Configuration
		 context.refresh();
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
	
	/**
	 * Uses beans.xml
	 */
	public static void loadConfiguration11() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch07/configuration/resources/beans.xml");
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
	
	public static void loadConfiguration2() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaturk.spring.di.ch07.configuration.conf");
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
	
	public static void loadConfiguration3() {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationExample.class);
		 BeanA beanA = context.getBean(BeanA.class);
		 System.out.println(beanA);
	}
}

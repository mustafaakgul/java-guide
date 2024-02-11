package org.javaturk.spring.di.ch08.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.javaturk.spring.di.ch08.aware.conf.AppConfig;
import org.javaturk.spring.di.ch08.aware.domain.*;

@ComponentScan({"org.javaturk.spring.di.ch08.aware.conf", "org.javaturk.spring.di.ch08.aware.domain"})
@Import(AppConfig.class)
public class AwareExample {
	public static void main(String[] args) {
//		getBeans1();
//		getBeans2();
		getBeans3();
	}
	
	public static void getBeans1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareExample.class);
		BeanA beanA = (BeanA) context.getBean(BeanA.class);
		System.out.println(beanA);
		context.close();
	}
	
	public static void getBeans2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareExample.class);
		BeanB beanB = (BeanB) context.getBean(BeanB.class);
		System.out.println(beanB);
		context.close();
	}
	
	public static void getBeans3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareExample.class);
		BeanC beanC = (BeanC) context.getBean(BeanC.class);
		System.out.println(beanC);
		context.close();
	}
}

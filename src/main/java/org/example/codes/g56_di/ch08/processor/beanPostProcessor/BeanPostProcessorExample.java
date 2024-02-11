package org.javaturk.spring.di.ch08.processor.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.javaturk.spring.di.ch08.processor.domain.*;

public class BeanPostProcessorExample {
	public static void main(String[] args) {
		getBeans1();
//		getBeans2();
	}
	
	public static void getBeans1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch08/processor/beanPostProcessor/resources/beans.xml");
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
		context.close();
	}
	
	public static void getBeans2(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaturk.spring.di.ch08.processor.beanPostProcessor", "org.javaturk.spring.di.ch08.processor.domain");
		BeanB beanB = (BeanB) context.getBean("beanB");
		context.close();
	}
}

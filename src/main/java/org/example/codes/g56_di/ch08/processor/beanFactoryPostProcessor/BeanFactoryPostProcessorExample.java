package org.javaturk.spring.di.ch08.processor.beanFactoryPostProcessor;

import org.javaturk.spring.di.ch08.processor.beanPostProcessor.MyBeanPostProcessor2;
import org.javaturk.spring.di.ch08.processor.domain.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorExample {
	public static void main(String[] args) {
//		getBeans1();
		getBeans2();
	}
	
	public static void getBeans1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaturk.spring.di.ch08.processor.beanFactoryPostProcessor.conf", "org.javaturk.spring.di.ch08.processor.domain");
		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);
		context.close();
	}
	
	public static void getBeans2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaturk.spring.di.ch08.processor.beanFactoryPostProcessor", "org.javaturk.spring.di.ch08.processor.beanPostProcessor", "org.javaturk.spring.di.ch08.processor.domain");
		System.out.println();
		BeanB beanB = (BeanB) context.getBean("beanB");
		System.out.println(beanB);
		BeanC beanC = (BeanC) context.getBean("beanC");
		System.out.println(beanC);
		context.close();
	}
}

package org.javaturk.spring.di.ch07.configuration;

import org.javaturk.spring.di.ch07.configuration.domain.BeanD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses={org.javaturk.spring.di.ch07.configuration.conf.Configuration4.class})
public class SelectionExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SelectionExample.class);
		 BeanD beanD = context.getBean(BeanD.class);	
		 System.out.println(beanD);
	}
}

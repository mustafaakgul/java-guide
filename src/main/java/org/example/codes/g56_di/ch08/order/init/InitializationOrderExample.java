package org.javaturk.spring.di.ch08.order.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class InitializationOrderExample {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(InitializationOrderExample.class);
	}
}

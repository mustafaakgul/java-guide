package org.javaturk.spring.di.ch06.greeting.greeting14.app;

import org.javaturk.spring.di.ch06.greeting.greeting14.renderer.*;
import org.javaturk.spring.di.ch06.greeting.greeting14.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {
		getBeans1();
//		getBeans2();
	}
	
	public static void getBeans1() {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/greeting/greeting14/resources/beans1.xml");

		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();

		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer2.render();
	}
	
	public static void getBeans2() {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/greeting/greeting14/resources/beans2.xml");

		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();

		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer2.render();
	}
}

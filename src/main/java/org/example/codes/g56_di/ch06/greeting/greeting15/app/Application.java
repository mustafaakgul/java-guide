package org.javaturk.spring.di.ch06.greeting.greeting15.app;

import org.javaturk.spring.di.ch06.greeting.greeting15.renderer.*;
import org.javaturk.spring.di.ch06.greeting.greeting15.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/greeting/greeting15/resources/beans.xml");

		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();

		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer2.render();
	}
}

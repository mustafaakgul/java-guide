package org.javaturk.spring.di.ch07.greeting.greeting17.app;

import org.javaturk.spring.di.ch07.greeting.greeting17.renderer.GreetingRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch07/greeting/greeting17/resources/beans.xml");
		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();
		
		renderer1 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer1.render();
	}
}

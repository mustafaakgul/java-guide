package org.javaturk.spring.di.ch06.scope;

import org.javaturk.spring.di.ch06.greeting.greeting14.renderer.GreetingRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/greeting/greeting14/resources/beans1.xml");
		
		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		
		if(renderer1 == renderer2)
			System.out.println("Singleton");
		else
			System.out.println("Prototype");
	}
}

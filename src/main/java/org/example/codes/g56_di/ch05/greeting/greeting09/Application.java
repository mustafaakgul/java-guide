package org.javaturk.spring.di.ch05.greeting.greeting09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch05/greeting/greeting09/resources/beans.xml");
	
		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer1");
		renderer.render();
		
		renderer = (GreetingRenderer) context.getBean("renderer2");
		renderer.render();
		
		renderer = (GreetingRenderer) context.getBean("renderer3");
		renderer.render();
		
		renderer = (GreetingRenderer) context.getBean("renderer4");
		renderer.render();
		
		// Causes NullPointerExceptiom
//		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer5");
//		renderer.render();
	}
}

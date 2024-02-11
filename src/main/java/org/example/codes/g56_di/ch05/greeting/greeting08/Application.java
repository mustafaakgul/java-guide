package org.javaturk.spring.di.ch05.greeting.greeting08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic: Property (setter) injection.
 * 
 * Make use of Spring framework to create renderer and message provider objects.
 * It uses BeanFactory class and beans1.xml. It injects the message provider
 * object into the setter of the message renderer.
 */
public class Application {
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch05/greeting/greeting08/resources/beans.xml");
		
//		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer1");
//		renderer.render();
//		
//		renderer = (GreetingRenderer) context.getBean("renderer2");
//		renderer.render();
		
		checkScope(context);
	}
	
	public static void checkScope(ApplicationContext context) {
		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("renderer1");
		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("renderer1");
		
		if(renderer1 == renderer2)
			System.out.println("Singleton");
		else
			System.out.println("Prototype");
	}
}

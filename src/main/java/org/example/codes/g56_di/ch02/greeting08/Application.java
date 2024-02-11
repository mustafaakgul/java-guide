package org.javaturk.spring.di.ch02.greeting08;

import org.springframework.beans.factory.BeanFactory;
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

		BeanFactory factory = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch02/greeting08/resources/beans.xml");
		
		GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer");
		renderer.render();

//		GreetingProvider provider = (GreetingProvider) factory.getBean("provider");
//		System.out.println(provider.getGreeting());
	}
}

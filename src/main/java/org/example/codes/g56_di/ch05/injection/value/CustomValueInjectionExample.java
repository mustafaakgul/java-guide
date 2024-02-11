package org.javaturk.spring.di.ch05.injection.value;

import org.javaturk.spring.di.ch03.domain.CustomValueInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomValueInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch03/bean/resources/customValue.xml");
		
		CustomValueInjection vi1 = (CustomValueInjection) context.getBean("customValueInjection");
		System.out.println(vi1);
		
	}
}

package org.javaturk.spring.di.ch08.greeting.greeting20.app;

import org.javaturk.spring.di.ch08.greeting.greeting20.renderer.*;
import org.javaturk.spring.di.ch08.greeting.greeting20.provider.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Examples of life-cycle events.
 * @author akin
 *
 */
public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch08/greeting/greeting20/resources/beans.xml");

		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();

		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer2.render();
		
		((AbstractApplicationContext) context).close();
//		((AbstractApplicationContext) context).registerShutdownHook();
		
//		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
//		for(String beanName : context.getBeanDefinitionNames())
//	        registry.removeBeanDefinition(beanName);
	}
}

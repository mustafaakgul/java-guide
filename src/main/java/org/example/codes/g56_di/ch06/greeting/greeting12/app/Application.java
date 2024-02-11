package org.javaturk.spring.di.ch06.greeting.greeting12.app;

import org.javaturk.spring.di.ch06.greeting.greeting12.provider.GreetingProvider;
import org.javaturk.spring.di.ch06.greeting.greeting12.renderer.GreetingRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Topic: @Autowired Needs spring-aop-5.2.9.RELEASE.jar.
 * 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch06/greeting/greeting12/resources/beans.xml");

		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("renderer");
		renderer1.render();

		GreetingRenderer renderer2 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer2.render();

		GreetingProvider provider1 = (GreetingProvider) context.getBean("helloWorldGreetingProvider");
		System.out.println(provider1.getGreeting());
		
		GreetingProvider provider2 = (GreetingProvider) context.getBean("greetingProvider");
		System.out.println(provider2.getGreeting());
	}
}

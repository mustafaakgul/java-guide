package org.javaturk.spring.di.ch06.greeting.greeting11;

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
		getBean1();
//		getBean2();
	}

	public static void getBean1() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch06/greeting/greeting11/resources/beans1.xml");

		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer");
		renderer.render();
	}

	public static void getBean2() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch06/greeting/greeting11/resources/beans2.xml");

		GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer");
		renderer.render();
	}
}

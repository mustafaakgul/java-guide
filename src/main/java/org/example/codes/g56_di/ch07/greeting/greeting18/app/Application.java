package org.javaturk.spring.di.ch07.greeting.greeting18.app;

import org.javaturk.spring.di.ch07.greeting.greeting18.renderer.GreetingRenderer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"org.javaturk.spring.di.ch07.greeting.greeting18"})
//@ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		GreetingRenderer renderer1 = (GreetingRenderer) context.getBean("standardOutputRenderer");
		renderer1.render();
		
		renderer1 = (GreetingRenderer) context.getBean("errorOutputRenderer");
		renderer1.render();
	}
}

package org.javaturk.spring.di.ch08.lifecycle.callback.prototype;

import org.javaturk.spring.di.ch08.lifecycle.applicationContext.AnnotationConfigApplicationContextExample1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain4.*;
import org.javaturk.spring.di.ch08.lifecycle.callback.prototype.conf.AppConfig;

@ComponentScan("org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain4")
@Import({DestroyPrototypeBeansPostProcessor.class, AppConfig.class})
public class PrototypeDestroyerExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeDestroyerExample.class);
		for(int i = 0; i < 10; i++) {
			context.getBean(BeanG.class);
			context.getBean(BeanH.class);
		}
		System.out.println();
		context.close();
	}
}

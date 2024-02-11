package org.javaturk.spring.di.ch08.dependsOn;

import org.javaturk.spring.di.ch08.dependsOn.domain.ABean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DependsOnExample{
	

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DependsOnExample.class);

		ABean aBean = (ABean) context.getBean("aBean");

	}
}


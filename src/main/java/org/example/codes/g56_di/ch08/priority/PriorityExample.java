package org.javaturk.spring.di.ch08.priority;

import java.util.List;

import org.javaturk.spring.di.ch08.priority.domain.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"org.javaturk.spring.di.ch08.priority", "org.javaturk.spring.di.ch08.priority.domain"})
public class PriorityExample {

	@Autowired
	private List<MyBean> beans;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PriorityExample.class);

		PriorityExample pe = (PriorityExample) context.getBean("priorityExample");

		System.out.println("\nSize: " + pe.beans.size());
		pe.beans.stream().forEach(bean -> System.out.println("Bean: " + bean ));
	}
}

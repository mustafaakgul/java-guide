package org.javaturk.spring.di.ch04;

import java.util.Arrays;
import java.util.Map;

import org.javaturk.spring.di.ch04.domain.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListableBeanFactoryExample {

	public static void main(String[] args) {
		ListableBeanFactory beanFactory = getListableBeanFactory();
		
		int beanCount = beanFactory.getBeanDefinitionCount();
		System.out.println("Bean count: " + beanCount);
		
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		System.out.println("\nBean definition names:");
		Arrays.stream(beanNames).forEach(System.out::println);
		
		String[] beanNamesForBeanA = beanFactory.getBeanNamesForType(BeanA.class);
		System.out.println("\nBean definition names for type BeanA:");
		Arrays.stream(beanNamesForBeanA ).forEach(System.out::println);
		
		Map<String, BeanA> beansForBeanA = beanFactory.getBeansOfType(BeanA.class);
		System.out.println("\nBeans for type BeanA:");
		beansForBeanA.forEach((k, v) -> System.out.println("Name: " + k + " Bean: " + v));
	}
	
	public void callBeanFactoryMethods(ListableBeanFactory beanFactory) {
		
		BeanA beanA = (BeanA) beanFactory.getBean("beanA");
		System.out.println(beanA);
		
		beanA = (BeanA) beanFactory.getBean("bean_A");
		System.out.println(beanA);
		
		beanA = (BeanA) beanFactory.getBean("bean_a");
		System.out.println(beanA);
		
		beanA = (BeanA) beanFactory.getBean("BEAN_A");
		System.out.println(beanA);
		
		beanA = beanFactory.getBean(BeanA.class);
		System.out.println(beanA);
		
		System.out.println();
		
		BeanB beanB = (BeanB) beanFactory.getBean("beanB");
		System.out.println(beanB);
		
		beanB = beanFactory.getBean(BeanB.class);
		System.out.println(beanB);
		
		BeanC beanC = (BeanC) beanFactory.getBean("beanC");
		System.out.println(beanC);
		
		beanC = beanFactory.getBean(BeanC.class);
		System.out.println(beanC);
		
		System.out.println();
		
		boolean b = beanFactory.containsBean("beanA");
		System.out.println(b);
		
		b = beanFactory.containsBean("a");
		System.out.println(b);
		
		beanA = (BeanA) beanFactory.getBean("a");
		System.out.println(beanA);
		
		System.out.println("\nAliases");
		String[] aliases = beanFactory.getAliases("beanA");
		for(String alias : aliases)
			System.out.println(alias);
		
		System.out.println();
		
		ObjectProvider<BeanA> op = beanFactory.getBeanProvider(BeanA.class);
		System.out.println(op);
	}
	
	private static ListableBeanFactory getListableBeanFactory() {
		ListableBeanFactory beanFactory = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch04/resources/beans.xml");
		return beanFactory;
	}
}

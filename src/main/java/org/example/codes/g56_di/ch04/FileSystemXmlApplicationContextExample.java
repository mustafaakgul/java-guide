package org.javaturk.spring.di.ch04;

import java.util.Arrays;

import org.javaturk.spring.di.ch03.domain.BeanB;
import org.javaturk.spring.di.ch03.domain.BeanC;
import org.javaturk.spring.di.ch03.domain.BeanD;
import org.javaturk.spring.di.ch03.domain.BeanE;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextExample {

	public static void main(String[] args) {
		loadBeans11();
//		loadBeans12(); // Couldn't find the resource file
		loadBeans2();
		loadBeans3();
		loadBeans4();
		loadBeans5();
		loadBeans6();
	}
	
	public static void loadBeans11() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
		context.setConfigLocation("file:/Users/akin/Desktop/resources/beans.xml"); // Start with file: for absolute file path
		context.refresh();
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans12() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
		context.setConfigLocation("/Users/akin/Desktop/resources/beans.xml"); // Always relative unless starting with file:
		context.refresh();
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}
	
	public static void loadBeans2() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/akin/Desktop/resources/beans.xml");
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB);
	}

	public static void loadBeans3() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/akin/Desktop/resources/beans.xml", "file:/Users/akin/Desktop/resources/anotherBeans.xml");		
		BeanD beanD = context.getBean(BeanD.class);
		System.out.println(beanD);
	}
	
	public static void loadBeans4() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/akin/Desktop/resources/beans.xml", "file:/Users/akin/Desktop/resources/anotherBeans.xml");		
//		BeanC beanc = context.getBean(BeanC.class); // Problem when there are more than one bean definition.
//		System.out.println(beanc);
		
		String[] beanNamesForBeanC = context.getBeanNamesForType(BeanC.class);
		System.out.println("\nBean definition names for type BeanC:");
		Arrays.stream(beanNamesForBeanC).forEach(System.out::println);
	}
	
	public static void loadBeans5() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/akin/Desktop/resources/beans.xml", "file:/Users/akin/Desktop/resources/anotherBeans.xml");		
		BeanE beanE = (BeanE) context.getBean("beanE"); // Bean and its dependencies may be in different resources.
		System.out.println(beanE);
	}
	
	public static void loadBeans6() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/akin/Desktop/resources/beans.xml", "file:/Users/akin/Desktop/resources/anotherBeans.xml", "file:/Users/akin/Desktop/resources/yetAnotherBeans.xml");		
		BeanE beanE = (BeanE) context.getBean("beanE"); // In case of multiple config locations, later bean definitions will override ones defined in earlier loaded files. 
		System.out.println(beanE);
	}
}

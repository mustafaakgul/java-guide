package org.javaturk.spring.di.ch05.bean.scope;

import org.javaturk.spring.di.ch04.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch05/bean/scope/resources/beans.xml");
//		checkScope1(context);
//		checkScope2(context);
		checkScope3(context);
	}

	/**
	 * Make BeanA singleton as the default case and prototype to see the difference.
	 * @param context
	 */
	public static void checkScope1(ApplicationContext context) {
		BeanA beanA1 = (BeanA) context.getBean("beanA");

		BeanA beanA2 = (BeanA) context.getBean("beanA");

		if (beanA1 == beanA2)
			System.out.println("BeanA is Singleton");
		else
			System.out.println("BeanA is Prototype");
	}
	
	/**
	 * Apply following cases:
	 * 	- BeanA and BeanB singleton
	 *  - BeanA and BeanB prototype
	 *  - BeanA singleton and BeanB prototype
	 *  - BeanA prototype and BeanB singleton
	 * @param context
	 */
	public static void checkScope2(ApplicationContext context) {
		BeanA beanA1 = (BeanA) context.getBean("beanA");
		BeanB beanB1 = beanA1.getBeanB();
		BeanA beanA2 = (BeanA) context.getBean("beanA");
		BeanB beanB2 = beanA2.getBeanB();

		if (beanA1 == beanA2)
			System.out.println("BeanA is Singleton");
		else
			System.out.println("BeanA is Prototype");
		
		if (beanB1 == beanB2)
			System.out.println("BeanB is Singleton");
		else
			System.out.println("BeanB is Prototype");
	}
	
	public static void checkScope3(ApplicationContext context) {
		BeanA beanA = (BeanA) context.getBean("beanA");
		BeanB beanB1 = beanA.getBeanB();
		BeanB beanB2 = (BeanB) context.getBean("beanB");
		
		if (beanB1 == beanB2)
			System.out.println("BeanB is Singleton");
		else
			System.out.println("BeanB is Prototype");
		
		BeanC beanC1 = beanB1.getBeanC();
		BeanC beanC2 = (BeanC) context.getBean("beanC");
		
		if (beanC1 == beanC2)
			System.out.println("BeanB is Singleton");
		else
			System.out.println("BeanB is Prototype");
	}
}

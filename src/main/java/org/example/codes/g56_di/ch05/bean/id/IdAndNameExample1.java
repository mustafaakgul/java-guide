package org.javaturk.spring.di.ch05.bean.id;

import org.javaturk.spring.di.ch03.domain.BeanA;
import org.javaturk.spring.di.ch03.domain.BeanB;
import org.javaturk.spring.di.ch03.domain.BeanC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdAndNameExample1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch03/bean/resources/idBeans.xml");
		callIdExamples(context);
		callNameExamples(context);
		getBeanWithoutIdAndName(context);
		callAliasExamples(context);
	}

	public static void callIdExamples(ApplicationContext context) {
		System.out.println("\n==> callIdExamples");
		BeanA beanA = (BeanA) context.getBean("beanA1");
		System.out.println(beanA);
		
		Object objectBeanA = context.getBean("beanA1");
		System.out.println(objectBeanA);
	}
	
	/**
	 * Remove last inner <beans/> for this.
	 * @param context
	 */
	public static void callNameExamples(ApplicationContext context) {
		System.out.println("\n==> callNameExamples()");
		BeanA beanA = (BeanA) context.getBean("aBean");
		System.out.println(beanA);
		
		BeanB beanB = (BeanB) context.getBean("bBean");
		System.out.println(beanB);
		 
		BeanC beanC = (BeanC) context.getBean("cBean");
		System.out.println(beanC);
	}
	
	private static void getBeanWithoutIdAndName(ApplicationContext context) {
		System.out.println("\n==> getBeanWithoutIdAndName()");
		// Defined without an id or a name
		BeanA beanA = (BeanA) context.getBean("org.javaturk.spring.di.ch03.domain.BeanA");
		System.out.println(beanA);		
	}
	
	/**
	 * Remove last inner <beans/> for this.
	 * @param context
	 */
	private static void callAliasExamples(ApplicationContext context) {
		System.out.println("\n==> callAliasExamples");
		
		System.out.println("\nAliases of beanA1");
		String[] aliases = context.getAliases("beanA1");
		for (String alias : aliases) {
			BeanA beanA = (BeanA) context.getBean(alias);
			System.out.println(alias + ": " + beanA);
		}
		
		System.out.println("\nAliases of a");
		aliases = context.getAliases("a");
		for (String alias : aliases) {
			BeanA beanA = (BeanA) context.getBean(alias);
			System.out.println(alias + ": " + beanA);
		}
	}
}

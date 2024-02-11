package org.javaturk.spring.di.ch05.bean.id;

import org.javaturk.spring.di.ch03.domain.BeanA;
import org.javaturk.spring.di.ch03.domain.BeanB;
import org.javaturk.spring.di.ch03.domain.BeanC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * beanA1 ve beanA2 ids are all reused in an inner <beans/>. They override the
 * definitions with the same ids done previously.
 * 
 * @author akin
 *
 */
public class IdAndNameExample2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch03/bean/resources/duplicatedIdBeans.xml");
//		callIdExamples(context);
		callNameExamples(context);
		callAliasExamples(context);
	}

	/**
	 * Due to the same that is reused in an inner <beans/> ClassCastException is
	 * thrown.
	 */
	public static void callIdExamples(ApplicationContext context) {
		System.out.println("\n==> callIdExamples");

		// This fetches BeanB instance not BeanA instance.
//		BeanA beanA = (BeanA) context.getBean("beanA1");
//		System.out.println(beanA);

		// Use this way!
		Object object = context.getBean("beanA1");
		System.out.println("Name: " + object);
	}

	/**
	 * Due to the same that is reused in an inner <beans/> ClassCastException is
	 * thrown.
	 */
	public static void callNameExamples(ApplicationContext context) {
		System.out.println("\n==> callNameExamples()");

		Object object = context.getBean("beanA1");
		System.out.println("Name beanA1: " + object);

		object = context.getBean("xxx");
		System.out.println("Name xxx: " + object);

		object = context.getBean("yyy");
		System.out.println("Name yyy: " + object);

		object = context.getBean("a");
		System.out.println("Name a: " + object);

		object = context.getBean("aa");
		System.out.println("Name aa: " + object);

		BeanB beanB = (BeanB) context.getBean("beanB1");
		System.out.println("beanB1: " + beanB);
	}

	/**
	 * Due to the same that is reused in an inner <beans/> ClassCastException is
	 * thrown.
	 */
	private static void callAliasExamples(ApplicationContext context) {
		System.out.println("\n==> callAliasExamples");

		// This fetches BeanB instance not BeanA instance anymore.
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

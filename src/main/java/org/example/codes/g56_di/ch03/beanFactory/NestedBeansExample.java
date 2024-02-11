package org.javaturk.spring.di.ch03.beanFactory;

import org.javaturk.spring.di.ch03.domain.BeanA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NestedBeansExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"org/javaturk/spring/di/ch03/beanFactory/resources/nestedBeans.xml");

		BeanA beanA1 = (BeanA) context.getBean("beanA1");
		System.out.println("beanA1: " + beanA1);

		BeanA beanA2 = (BeanA) context.getBean("beanA2");
		System.out.println("beanA2: " + beanA2);

		// Beans in outer <beans/> can refer to the ones in inner <beans/>.
		BeanA beanA3 = (BeanA) context.getBean("beanA3");
		System.out.println("beanA3: " + beanA3);

		// Beans in inner <beans/> can refer to the ones in outer <beans/>.
		BeanA beanA4 = (BeanA) context.getBean("beanA4");
		System.out.println("beanA4: " + beanA4);
	}
}

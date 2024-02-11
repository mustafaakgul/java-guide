package org.javaturk.spring.di.ch04;

import org.javaturk.spring.di.ch04.domain.BeanB;
import org.javaturk.spring.di.ch04.domain.BeanC;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class DefaultListableBeanFactoryExample1 {
	
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(factory);
		xmlReader.loadBeanDefinitions(
				new ClassPathResource("/org/javaturk/spring/di/ch04/resources/beans.xml"));
		BeanB beanB = factory.getBean(BeanB.class);
		System.out.println(beanB);

		System.out.println();

		PropertiesBeanDefinitionReader propertiesReader = new PropertiesBeanDefinitionReader(factory);
		propertiesReader.loadBeanDefinitions(
				new ClassPathResource("/org/javaturk/spring/di/ch04/resources/beans.properties"));
		BeanC beanC = factory.getBean(BeanC.class);
		System.out.println(beanC);
		
	}
}

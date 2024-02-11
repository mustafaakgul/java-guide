package org.javaturk.spring.di.ch04;

import java.util.Iterator;

import org.javaturk.spring.di.ch04.domain.*;
import org.javaturk.spring.di.ch05.greeting.greeting09.*;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class DefaultListableBeanFactoryExample2 {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		registerNewBean(factory);

		XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(factory);
		xmlReader.loadBeanDefinitions(
				new ClassPathResource("/org/javaturk/spring/di/ch04/resources/beans.xml"));
		BeanB beanB = factory.getBean(BeanB.class);
		System.out.println(beanB);

		System.out.println();

		GreetingRenderer greetingRenderer = factory.getBean(ErrorOutputRenderer.class);
		greetingRenderer.render();

		System.out.println();
		System.out.println("Is renderer singleton: " + factory.isSingleton("renderer"));

		System.out.println("\nAll registered beans");

		Iterator<String> it = factory.getBeanNamesIterator();
		it.forEachRemaining(System.out::println);

		System.out.println();

		System.out.println("isConfigurationFrozen: " + factory.isConfigurationFrozen());
		factory.freezeConfiguration();
		System.out.println("isConfigurationFrozen: " + factory.isConfigurationFrozen());
	}

	/**
	 * Programmatically register a bean with dependencies.
	 * 
	 * @param factory
	 */
	public static void registerNewBean(DefaultListableBeanFactory factory) {
		// First register a collaborator bean
		String name = "newSelamGreetingProviderBean";
		GenericBeanDefinition selamBeanDefinition = new GenericBeanDefinition();
		selamBeanDefinition.setBeanClass(SelamGreetingProvider.class);
		MutablePropertyValues mpv1 = new MutablePropertyValues();
		mpv1.add("greeting", "Naber?");

		selamBeanDefinition.setPropertyValues(mpv1);

		factory.registerBeanDefinition("newSelamGreetingProviderBean", selamBeanDefinition);
		SelamGreetingProvider selamGreetingProvider = factory.getBean(SelamGreetingProvider.class);
		System.out.println(selamGreetingProvider.getGreeting());

		// Then register the main bean
		GenericBeanDefinition errorOutputRendererBeanDefinition = new GenericBeanDefinition();
		errorOutputRendererBeanDefinition.setBeanClass(ErrorOutputRenderer.class);
		MutablePropertyValues mpv2 = new MutablePropertyValues();
		mpv2.add("greetingProvider", selamBeanDefinition);

		errorOutputRendererBeanDefinition.setPropertyValues(mpv2);

		factory.registerBeanDefinition("renderer", errorOutputRendererBeanDefinition);
		GreetingRenderer greetingRenderer = factory.getBean(ErrorOutputRenderer.class);
		greetingRenderer.render();
	}
}

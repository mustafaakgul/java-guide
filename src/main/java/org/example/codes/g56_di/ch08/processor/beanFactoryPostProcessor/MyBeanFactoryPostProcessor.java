package org.javaturk.spring.di.ch08.processor.beanFactoryPostProcessor;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.javaturk.spring.di.ch08.processor.domain.BeanC;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
		System.out.println("There are " + beanDefinitionCount + " beans registered.");
		System.out.println("\nHere are they:");
		var beanNames = beanFactory.getBeanDefinitionNames();
		Arrays.stream(beanNames).forEach(System.out::println);
		
//		Uncomment this to see what happens!
//		Arrays.stream(beanNames).forEach(name -> System.out.println(beanFactory.getBean(name)));
		
//		beanFactory.preInstantiateSingletons();
	}
}

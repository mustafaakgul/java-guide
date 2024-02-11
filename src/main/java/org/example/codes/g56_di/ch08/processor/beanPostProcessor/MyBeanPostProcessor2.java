package org.javaturk.spring.di.ch08.processor.beanPostProcessor;

import java.time.LocalDateTime;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.javaturk.spring.di.ch08.processor.domain.*;

@Component
public class MyBeanPostProcessor2 implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("beanB")) {
			BeanB beanB = (BeanB) bean;
			System.out.println("Before initialziation: " + beanB);
			beanB.setPreInitializationDate(LocalDateTime.now());
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("beanB")) {
			BeanB beanB = (BeanB) bean;
			System.out.println("Before modification: " + beanB);
			beanB.setPostInitializationDate(LocalDateTime.now());
			beanB.setName("AnotherName");
			System.out.println("After modification: " + beanB);
		}
		return bean;
	}
}

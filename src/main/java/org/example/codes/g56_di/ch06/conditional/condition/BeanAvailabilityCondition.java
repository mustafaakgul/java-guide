package org.javaturk.spring.di.ch06.conditional.condition;

import org.javaturk.spring.di.ch06.conditional.domain.BeanE;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BeanAvailabilityCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		DefaultListableBeanFactory factory = (DefaultListableBeanFactory) context.getBeanFactory();
		GenericBeanDefinition beanEDefinition = new GenericBeanDefinition();
		beanEDefinition.setBeanClass(BeanE.class);
		factory.registerBeanDefinition("beanE", beanEDefinition);
		
		boolean value = context.getBeanFactory().containsBeanDefinition("beanE");
//		System.out.println(value);
		return value;
		
//		return metadata.isAnnotated("org.springframework.context.annotation.Conditional");
	}
}

package org.javaturk.spring.di.ch08.lifecycle.callback.annotation;

import org.javaturk.spring.di.ch08.lifecycle.callback.annotation.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean(initMethod = "startUp", destroyMethod = "cleanUp")
	public BeanA beanA() {
		return new BeanA();
	}
	
	@Bean(initMethod = "startUp", destroyMethod = "cleanUp")
	public BeanB beanB() {
		return new BeanB();
	}
	
	@Bean(initMethod = "startUp", destroyMethod = "cleanUp")
	public BeanC beanC() {
		return new BeanC();
	}
	
	@Bean(destroyMethod = "")
	public BeanD beanD() {
		return new BeanD();
	}
}

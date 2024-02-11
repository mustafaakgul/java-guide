package org.javaturk.spring.di.ch08.lifecycle.applicationContext;


import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration2 {
	
	@Bean()
	public BeanA beanA() {
		return new BeanA();
	}
	
	@Bean()
	public BeanB beanB() {
		return new BeanB();
	}
	
	@Bean
	public BeanC beanC() {
		return new BeanC();
	}

}

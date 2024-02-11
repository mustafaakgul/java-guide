package org.javaturk.spring.di.ch08.lazy.conf;

import org.javaturk.spring.di.ch08.lazy.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class AppConfiguration {
	
	@Bean
	public BeanC beanC(String beanCName, BeanD beanD) {
		return new BeanC(beanCName, beanD);
	}
	
	@Bean
	public BeanD beanD(String beanDName) {
		return new BeanD(beanDName);
	}
	
	@Bean
	public String beanCName() {
		return "BEAN-C";
	}
	
	@Bean
	public String beanDName() {
		return "BEAN-D";
	}
}

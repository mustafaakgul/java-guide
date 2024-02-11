package org.javaturk.spring.di.ch08.lifecycle.callback.example.conf;

import org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain3.BeanE;
import org.javaturk.spring.di.ch08.lifecycle.callback.example.domain.domain3.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigApplicationContextExampleAppConfig {

	@Bean
	public BeanE beanE() {
		return new BeanE();
	}

	@Bean
	public BeanF beanF() {
		return new BeanF();
	}

	@Bean
	public String name() {
		return "Bean_E";
	}
}

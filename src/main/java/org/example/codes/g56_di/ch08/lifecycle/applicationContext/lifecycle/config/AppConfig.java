package org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.javaturk.spring.di.ch08.lifecycle.applicationContext.lifecycle.domain.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public String name() {
		return "A-NEW-NAME";
	}
	
	@Bean
	public BeanC beanC() {
		return new BeanC();
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in AppConfig init()");
	}
	
	@PreDestroy
	public void shutDown() {
		System.err.println("in AppConfig shutDown()");
	}

}

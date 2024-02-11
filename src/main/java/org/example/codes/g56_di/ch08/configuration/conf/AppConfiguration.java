package org.javaturk.spring.di.ch08.configuration.conf;

import org.javaturk.spring.di.ch08.configuration.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean(initMethod = "init", destroyMethod = "clean")
	public BeanA getBeanA() {
		return new BeanA();
	}
	
	@Bean(destroyMethod = "clear")
	public BeanB getBeanB(String name, int age) {
		return new BeanB(name, age);
	}
	
	@Bean
	public BeanC getBeanC() {
		return new BeanC();
	}
	
	@Bean
	public String name() {
		return "Yasemin";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public String nameOfBean() {
		return "BEAN-C";
	}
}

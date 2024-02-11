package org.javaturk.spring.di.ch07.inject.conf;

import org.javaturk.spring.di.ch07.inject.domain.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean
	public double pi() {
		return Math.PI;
	}
	
	@Bean
	public int aNumber() {
		return (int )(Math.random() * 1000);
	}
	
	@Bean
	public String aString() {
		return "Spring supports @Inject";
	}
	
	@Bean
	public BeanF aBean() {
		return new BeanF();
	}
}

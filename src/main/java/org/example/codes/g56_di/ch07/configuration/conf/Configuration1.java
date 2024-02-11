package org.javaturk.spring.di.ch07.configuration.conf;

import org.javaturk.spring.di.ch07.configuration.domain.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class Configuration1 {
	
	public Configuration1() {
		System.out.println("==> Configuration1()");
	}

	@Bean
	public BeanA getBeanA() {
		return new BeanA();
	}
	
	@Bean
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

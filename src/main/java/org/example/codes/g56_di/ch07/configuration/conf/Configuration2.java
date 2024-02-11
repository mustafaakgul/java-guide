package org.javaturk.spring.di.ch07.configuration.conf;

import org.javaturk.spring.di.ch07.configuration.domain.BeanA;
import org.javaturk.spring.di.ch07.configuration.domain.BeanB;
import org.javaturk.spring.di.ch07.configuration.domain.BeanC;
import org.javaturk.spring.di.ch07.greeting.greeting17.provider.*;
import org.javaturk.spring.di.ch07.greeting.greeting17.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Configuration2 {
	
	public Configuration2() {
		System.out.println("==> Configuration2()");
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

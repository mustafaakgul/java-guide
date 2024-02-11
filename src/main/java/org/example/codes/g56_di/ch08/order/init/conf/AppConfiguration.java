package org.javaturk.spring.di.ch08.order.init.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.javaturk.spring.di.ch08.order.init.domain.*;

@Configuration
public class AppConfiguration {
	
//	@Bean
//	public BeanA beanA() {
//		System.err.println("in AppConfiguration.beanA()");
//		return new BeanA();
//	}
	
	@Bean
	public int i() {
		System.err.println("in AppConfiguration.i()");
		return 3;
	}
	
	@Bean
	public String s() {
		System.err.println("in AppConfiguration.s()");
		return "s";
	}
	
	@Bean
	public boolean b() {
		System.err.println("in AppConfiguration.b()");
		return true;
	}
	
	@Bean
	public long l() {
		System.err.println("in AppConfiguration.l()");
		return 33L;
	}
	
	@Bean
	public char c() {
		System.err.println("in AppConfiguration.c()");
		return 'j';
	}
	
	@Bean
	public double d() {
		System.err.println("in AppConfiguration.d()");
		return 3.14;
	}
	
	@Bean
	public BeanB beanB2() {
		System.err.println("in AppConfiguration.beanB2()");
		return new BeanB();
	}
}

package org.javaturk.spring.di.ch07.configuration.conf;

import org.javaturk.spring.di.ch07.configuration.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration5 {
	
	public Configuration5() {
		System.out.println("==> Configuration4()");
	}
	
	@Bean
	public BeanD getBeanD(String string1, String string2, int int1, int int2) {
		return new BeanD(string1, string2, int1, int2);
	}
	
	@Bean("string1")
	public String getString1() {
		return "String-1";
	}
	
	@Bean("string2")
	public String getString2() {
		return "String-2";
	}
	
	@Bean("int1")
	public int getInt1() {
		return 1;
	}
	
	@Bean("int2")
	public int getInt2() {
		return 2;
	}
}

package org.javaturk.spring.di.ch07.greeting.greeting17.conf;

import org.javaturk.spring.di.ch07.greeting.greeting17.provider.*;
import org.javaturk.spring.di.ch07.greeting.greeting17.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration by naming convention.
 * @author akin
 *
 */
//@Configuration
public class GreetingConfiguration1 {

	public GreetingConfiguration1() {
		System.out.println("==> GreetingConfiguration1()");
	}

	@Bean
	public GreetingProvider selamGreetingProvider() {
		return new SelamGreetingProvider();
	}

	@Bean
	public GreetingProvider helloWorldGreetingProvider() {
		return new HelloWorldGreetingProvider();
	}

	@Bean
	public GreetingRenderer standardOutputRenderer() {
		return new StandardOutputRenderer();
	}

	@Bean
	public GreetingRenderer errorOutputRenderer() {
		return new ErrorOutputRenderer();
	}
}

package org.javaturk.spring.di.ch07.greeting.greeting17.conf;

import org.javaturk.spring.di.ch07.greeting.greeting17.provider.*;
import org.javaturk.spring.di.ch07.greeting.greeting17.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration by @Bean() value attribute.
 * @author akin
 *
 */
//@Configuration
public class GreetingConfiguration2 {
	
	public GreetingConfiguration2() {
		System.out.println("==> GreetingConfiguration2()");
	}
	
	@Bean("selamGreetingProvider")
	public GreetingProvider getSelamGreetingProvider() {
		return new SelamGreetingProvider();
	}
	
	@Bean("helloWorldGreetingProvider")
	public GreetingProvider getHelloWorldGreetingProvider() {
		return new HelloWorldGreetingProvider();
	}

	@Bean("standardOutputRenderer")
	public GreetingRenderer getStandardOutputRenderer() {
		return new StandardOutputRenderer();
	}
	
	@Bean("errorOutputRenderer")
	public GreetingRenderer getErrorOutputRenderer() {
		return new ErrorOutputRenderer();
	}
}

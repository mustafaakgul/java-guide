package org.javaturk.spring.di.ch07.greeting.greeting17.conf;

import org.javaturk.spring.di.ch07.greeting.greeting17.provider.*;
import org.javaturk.spring.di.ch07.greeting.greeting17.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfiguration3 {
	
	public GreetingConfiguration3() {
		System.out.println("==> GreetingConfiguration3()");
	}
	
	@Bean
	public GreetingProvider getSelamGreetingProvider() {
		return new SelamGreetingProvider();
	}
	
	@Bean
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

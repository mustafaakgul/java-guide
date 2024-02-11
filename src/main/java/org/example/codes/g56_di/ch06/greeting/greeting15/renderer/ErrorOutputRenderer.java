package org.javaturk.spring.di.ch06.greeting.greeting15.renderer;

import javax.annotation.Resource;

import org.javaturk.spring.di.ch06.greeting.greeting15.custom.Hello;
import org.javaturk.spring.di.ch06.greeting.greeting15.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

//	@Resource(name = "helloWorldGreetingProvider")
//	private GreetingProvider greetingProvider;
	
//	@Resource
//	@Qualifier("helloWorldGreetingProvider")
//	private GreetingProvider greetingProvider;
	
	@Resource
	@Qualifier("selamGreetingProvider")
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}

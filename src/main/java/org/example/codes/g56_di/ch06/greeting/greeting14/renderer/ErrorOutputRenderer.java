package org.javaturk.spring.di.ch06.greeting.greeting14.renderer;

import javax.annotation.Resource;

import org.javaturk.spring.di.ch06.greeting.greeting14.custom.Hello;
import org.javaturk.spring.di.ch06.greeting.greeting14.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Autowired
//	@Qualifier("hello")
	@Hello
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}

package org.javaturk.spring.di.ch07.greeting.greeting19.renderer;

import javax.annotation.Resource;

import org.javaturk.spring.di.ch07.greeting.greeting19.custom.Hello;
import org.javaturk.spring.di.ch07.greeting.greeting19.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements GreetingRenderer {

	@Resource
	@Qualifier("hello")
//	@Hello
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
}

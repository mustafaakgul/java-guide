package org.javaturk.spring.di.ch07.greeting.greeting17.renderer;

import org.javaturk.spring.di.ch07.greeting.greeting17.custom.Hello;
import org.javaturk.spring.di.ch07.greeting.greeting17.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ErrorOutputRenderer implements GreetingRenderer {

	@Autowired
	@Hello
	private GreetingProvider helloWorldGreetingProvider;

	@Override
	public void render() {
		System.err.println(helloWorldGreetingProvider.getGreeting());
	}
}

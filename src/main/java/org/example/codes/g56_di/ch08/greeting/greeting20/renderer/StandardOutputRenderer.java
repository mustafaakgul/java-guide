package org.javaturk.spring.di.ch08.greeting.greeting20.renderer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.javaturk.spring.di.ch08.greeting.greeting20.custom.Selam;
import org.javaturk.spring.di.ch08.greeting.greeting20.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StandardOutputRenderer implements GreetingRenderer {

	@Autowired
	@Selam
	private GreetingProvider greetingProvider;

	public void render() {
		System.out.println(greetingProvider.getGreeting());
	}
	
	@PostConstruct
	public void init1() {
		System.err.println("in StandardOutputRenderer init1()");
	}
	
	@PreDestroy
	public void destroy1() {
		System.err.println("in StandardOutputRenderer destroy1()");
	}
	
	@PostConstruct
	public void init2() {
		System.err.println("in StandardOutputRenderer init2()");
	}
	
	@PreDestroy
	public void destroy2() {
		System.err.println("in StandardOutputRenderer destroy2()");
	}
}

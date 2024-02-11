package org.javaturk.spring.di.ch08.greeting.greeting20.renderer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.javaturk.spring.di.ch08.greeting.greeting20.custom.Hello;
import org.javaturk.spring.di.ch08.greeting.greeting20.provider.GreetingProvider;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputRenderer implements GreetingRenderer, InitializingBean, DisposableBean {

	@Autowired
	@Hello
	private GreetingProvider greetingProvider;

	@Override
	public void render() {
		System.err.println(greetingProvider.getGreeting());
	}
	
	@PostConstruct
	public void init() {
		System.err.println("in ErrorOutputRenderer init()");
	}
	
	@PreDestroy
	public void destroyMe() {
		System.err.println("in ErrorOutputRenderer destroyMe()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("in ErrorOutputRenderer afterPropertiesSet()");
	}
	
	public void destroy() {
		System.err.println("in ErrorOutputRenderer destroy()");
	}
}

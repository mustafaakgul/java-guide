package org.javaturk.spring.di.ch08.greeting.greeting20.provider;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.javaturk.spring.di.ch08.greeting.greeting20.custom.*;

@Component
@Selam
public class SelamGreetingProvider implements GreetingProvider, SmartLifecycle{
	private boolean running;

	@Override
	public String getGreeting() {
		return "Selam :)";
	}
	
	@PostConstruct
	 private void init() {
		System.err.println("in SelamGreetingProvider init()");
	}
	
	@PreDestroy
	private void destroy() {
		System.err.println("in SelamGreetingProvider destroy()");
	}

	@Override
	public void start() {
		System.err.println("in SelamGreetingProvider start()");
		running = true;
	}

	@Override
	public void stop() {
		System.err.println("in SelamGreetingProvider stop()");
		running = false;
	}
	
//	@Override
//	public void stop(Runnable callback) {
//		System.err.println("in SelamGreetingProvider stop(Runnable callback)");
//		stop();
//		callback.run();
//	}

	@Override
	public boolean isRunning() {
		System.err.println("in SelamGreetingProvider isRunning()");
		return running;
	}
}

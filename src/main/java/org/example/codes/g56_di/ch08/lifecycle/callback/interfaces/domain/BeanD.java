package org.javaturk.spring.di.ch08.lifecycle.callback.interfaces.domain;

import org.springframework.context.Lifecycle;

public class BeanD implements Lifecycle{
	private boolean running;

	@Override
	public void start() {
		System.err.println("in BeanC start()");
		running = true;
	}

	@Override
	public void stop() {
		System.err.println("in BeanC stop()");		
		running = false;
	}

	@Override
	public boolean isRunning() {
		return running;
	}
}

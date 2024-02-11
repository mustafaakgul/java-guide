package org.javaturk.spring.di.ch08.lifecycle.callback.interfaces.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements SmartLifecycle{
	private boolean running;

	private BeanC beanC;

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
	@Override
	public String toString() {
		if(beanC != null)
			return "BeanB: " + beanC.toString();
		else
			return "BeanB: " + "beanC is null";
	}
	
	@Override
	public void start() {
		System.err.println("in BeanB start()");
		running = true;
	}

	@Override
	public void stop() {
		System.err.println("in BeanB stop()");		
		running = false;
	}

	@Override
	public boolean isRunning() {
		return running;
	}
}

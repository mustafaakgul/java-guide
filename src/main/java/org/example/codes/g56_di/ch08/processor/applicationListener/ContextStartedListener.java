package org.javaturk.spring.di.ch08.processor.applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedListener implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("in ContextStartedListener");
		var context = event.getApplicationContext();
		System.out.println(context);
		var source = event.getSource();
		System.out.println(source);
	}
}

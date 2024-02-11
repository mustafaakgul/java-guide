package org.javaturk.spring.di.ch08.processor.applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedListener implements ApplicationListener<ContextClosedEvent>{

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("in ContextClosedListener");
		var context = event.getApplicationContext();
		System.out.println(context);
		var source = event.getSource();
		System.out.println(source);		
	}
}

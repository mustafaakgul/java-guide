package org.javaturk.spring.di.ch08.priority.domain;

import javax.annotation.Priority;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("zBean")
@Priority(1)
public class ZBean implements MyBean{
	
	public ZBean() {
		System.err.println("in ZBean()");
	}
}

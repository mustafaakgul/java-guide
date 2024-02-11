package org.javaturk.spring.di.ch08.priority.domain;

import javax.annotation.Priority;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("yBean")
@Priority(10)
public class YBean implements MyBean{
	
	public YBean() {
		System.err.println("in YBean()");
	}
}

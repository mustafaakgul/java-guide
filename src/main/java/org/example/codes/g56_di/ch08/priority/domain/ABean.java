package org.javaturk.spring.di.ch08.priority.domain;


import javax.annotation.Priority;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("aBean")
@Priority(100)
//@DependsOn("zBean")
public class ABean implements MyBean{
	
	public ABean() {
		System.err.println("in ABean()");
	}
}

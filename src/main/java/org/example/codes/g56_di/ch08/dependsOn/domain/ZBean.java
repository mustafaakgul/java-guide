package org.javaturk.spring.di.ch08.dependsOn.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("zBean")
@Lazy
public class ZBean{
	
	public ZBean() {
		System.out.println("in ZBean()");
	}
}

package org.javaturk.spring.di.ch08.order.domain;

import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("zBean")
@Order(1)
public class ZBean implements MyBean{
	
	public ZBean() {
		System.err.println("in ZBean()");
	}
}

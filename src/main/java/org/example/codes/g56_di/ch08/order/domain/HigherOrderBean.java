package org.javaturk.spring.di.ch08.order.domain;

import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(200)
public class HigherOrderBean implements MyBean{
	
	public HigherOrderBean() {
		System.err.println("in HigherOrderBean()");
	}
}

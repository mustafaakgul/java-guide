package org.javaturk.spring.di.ch08.order.domain;

import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class LowestOrderBean implements MyBean{
	
	public LowestOrderBean() {
		System.err.println("in LowestOrderBean()");
	}
}

package org.javaturk.spring.di.ch08.order.domain;

import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HighestOrderBean implements MyBean{
	
	public HighestOrderBean() {
		System.err.println("in HighestOrderBean()");
	}
}

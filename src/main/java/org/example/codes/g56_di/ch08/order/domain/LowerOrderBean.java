package org.javaturk.spring.di.ch08.order.domain;


import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1000)
public class LowerOrderBean implements MyBean{
	
	public LowerOrderBean() {
		System.err.println("in LowerOrderBean()");
	}
}

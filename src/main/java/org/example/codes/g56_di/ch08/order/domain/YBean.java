package org.javaturk.spring.di.ch08.order.domain;

import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("yBean")
@Order(1)
public class YBean implements MyBean{
	
	public YBean() {
		System.err.println("in YBean()");
	}
}

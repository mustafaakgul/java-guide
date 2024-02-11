package org.javaturk.spring.di.ch08.order.domain;


import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("aBean")
@Order(100)
//@DependsOn("zBean")
public class ABean implements MyBean{
	
	public ABean() {
		System.err.println("in ABean()");
	}
}

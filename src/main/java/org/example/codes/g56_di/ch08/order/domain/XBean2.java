package org.javaturk.spring.di.ch08.order.domain;

import org.javaturk.spring.di.ch08.order.MyBean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("xBean2")
//@Order(2)
public class XBean2 implements MyBean, Ordered{
	
	public XBean2() {
		System.err.println("in XBean2()");
	}

	@Override
	public int getOrder() {
		return 2;
	}
}

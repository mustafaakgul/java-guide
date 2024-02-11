package org.javaturk.spring.di.ch06.conditional.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.javaturk.spring.di.ch06.conditional.condition.*;

@Component
@Conditional(OSCondition.class)
public class BeanA {
	
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
	public static BeanA create() {
		return new BeanA();
	}
}

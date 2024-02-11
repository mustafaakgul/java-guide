package org.javaturk.spring.di.ch06.required;

import org.springframework.beans.factory.annotation.Required;

public class BeanA {
	
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	@Required
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	public void doThis() {
		beanB.doThat();
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
}

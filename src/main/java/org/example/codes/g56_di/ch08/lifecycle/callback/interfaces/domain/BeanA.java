package org.javaturk.spring.di.ch08.lifecycle.callback.interfaces.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean{
	
	private BeanB beanB;

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("in BeanA afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("in BeanA destroy()");
	}
}

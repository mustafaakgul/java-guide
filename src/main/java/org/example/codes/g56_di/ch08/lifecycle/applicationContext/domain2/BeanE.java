package org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain2;

import org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1.BeanD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanE {

	private BeanD beanD;

	@Autowired
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	@Override
	public String toString() {
		return "BeanE [beanD=" + beanD + "]";
	}
}

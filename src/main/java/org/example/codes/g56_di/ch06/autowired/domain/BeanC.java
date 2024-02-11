package org.javaturk.spring.di.ch06.autowired.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
	private String nameOfBean;
	private BeanD beanD;

	@Autowired
	public BeanC(String nameOfBean, BeanD beanD) {
		this.nameOfBean = nameOfBean;
		this.beanD = beanD;
	}

	@Override
	public String toString() {
		return "BeanC [nameOfBean=" + nameOfBean + "]";
	}
}

package org.javaturk.spring.di.ch07.configuration.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
	private String nameOfBean;

	@Autowired
	public void setName(String nameOfBean) {
		this.nameOfBean = nameOfBean;
	}

	@Override
	public String toString() {
		return "BeanC [nameOfBean=" + nameOfBean + "]";
	}
}

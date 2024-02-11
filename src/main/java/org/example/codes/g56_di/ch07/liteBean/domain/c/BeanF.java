package org.javaturk.spring.di.ch07.liteBean.domain.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class BeanF {
	private String nameOfBean;

	@Autowired
	public void setNameOfBean(String nameOfBean) {
		this.nameOfBean = nameOfBean;
	}

	@Override
	public String toString() {
		return "BeanF [nameOfBean=" + nameOfBean + "]";
	}
}

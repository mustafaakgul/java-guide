package org.javaturk.spring.di.ch07.liteBean.domain.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class BeanC {
	private String nameOfBean;

	@Autowired
	public void setNameOfBean(String nameOfBean) {
		this.nameOfBean = nameOfBean;
	}

	@Override
	public String toString() {
		return "BeanC [nameOfBean=" + nameOfBean + "]";
	}
}

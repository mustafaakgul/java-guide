package org.javaturk.spring.di.ch07.inject.domain;

import java.time.LocalDate;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC {

	private LocalDate date;
	private BeanD beanD;

	@Value("#{T(java.time.LocalDate).now()}")
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Inject
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

	@Override
	public String toString() {
		return "BeanC [date=" + date + ", beanD=" + beanD + "]";
	}
}

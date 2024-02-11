package org.javaturk.spring.di.ch06.conditional.domain;

import java.time.LocalDate;

import org.javaturk.spring.di.ch06.conditional.condition.TimeCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(TimeCondition.class)
public class BeanC {

	private LocalDate date;

	@Value("#{T(java.time.LocalDate).now()}")
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BeanC [date=" + date + "]";
	}
}

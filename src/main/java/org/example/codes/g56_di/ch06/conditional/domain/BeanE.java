package org.javaturk.spring.di.ch06.conditional.domain;

import org.javaturk.spring.di.ch06.conditional.condition.TimeCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
public class BeanE {

	@Override
	public String toString() {
		return "BeanE []";
	}
}

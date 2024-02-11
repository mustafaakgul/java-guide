package org.javaturk.spring.di.ch06.profile.domain.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("MySQL")
public class BeanA {

	@Override
	public String toString() {
		return "BeanA []";
	}
}

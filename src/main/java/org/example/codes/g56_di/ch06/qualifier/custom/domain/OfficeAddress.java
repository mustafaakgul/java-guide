package org.javaturk.spring.di.ch06.qualifier.custom.domain;

import org.javaturk.spring.di.ch06.qualifier.custom.qualifiers.Office;
import org.springframework.stereotype.Component;

@Component
@Office(city = "Istanbul")
public class OfficeAddress implements Address {

	@Override
	public String getAddress() {
		return "Istanbul";
	}
	
	@Override
	public String toString() {
		return "OfficeAddress [City=" + getAddress() + "]";
	}
}

package org.javaturk.spring.di.ch06.qualifier.custom.domain;

import org.javaturk.spring.di.ch06.qualifier.custom.qualifiers.Home;
import org.springframework.stereotype.Component;

@Component
@Home(city = "Ayvalik")
public class AyvalikAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Ayvalik";
	}
}

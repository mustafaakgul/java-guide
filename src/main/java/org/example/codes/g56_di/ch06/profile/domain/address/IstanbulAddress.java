package org.javaturk.spring.di.ch06.profile.domain.address;

import org.springframework.stereotype.Component;

@Component
public class IstanbulAddress extends HomeAddress {
	
	@Override
	public String getAddress() {
		return "Istanbul";
	}
}

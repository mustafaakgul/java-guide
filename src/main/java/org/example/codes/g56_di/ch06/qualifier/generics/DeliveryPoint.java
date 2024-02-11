package org.javaturk.spring.di.ch06.qualifier.generics;

import org.springframework.stereotype.Component;

@Component
public class DeliveryPoint<Address> {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DeliveryPoint [address=" + address + "]";
	}
}

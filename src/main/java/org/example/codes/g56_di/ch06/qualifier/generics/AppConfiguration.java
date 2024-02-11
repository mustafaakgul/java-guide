package org.javaturk.spring.di.ch06.qualifier.generics;

import org.javaturk.spring.di.ch06.qualifier.custom.domain.AyvalikAddress;
import org.javaturk.spring.di.ch06.qualifier.custom.domain.HomeAddress;
import org.javaturk.spring.di.ch06.qualifier.custom.domain.OfficeAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean
	public DeliveryPoint<HomeAddress> getDeliveryPoint1(){
		AyvalikAddress ad = new AyvalikAddress();
		DeliveryPoint<HomeAddress> dp = new DeliveryPoint<HomeAddress>();
		dp.setAddress(ad);
		return dp;
	}
	
	@Bean
	public DeliveryPoint<OfficeAddress> getDeliveryPoint2(){
		OfficeAddress ad = new OfficeAddress();
		DeliveryPoint<OfficeAddress> dp = new DeliveryPoint<OfficeAddress>();
		dp.setAddress(ad);
		return dp;
	}
}

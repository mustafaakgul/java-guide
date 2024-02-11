package org.javaturk.spring.di.ch08.lifecycle.applicationContext.domain1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class BeanC {
	
	private static int count;
	
	public BeanC() {
		++count;
		System.out.println("in BeanC(), count: " + count + " hash code: " + hashCode());
	}

	@Override
	public String toString() {
		return "BeanC [], count: " + count + " hash code: " + hashCode();
	}
}

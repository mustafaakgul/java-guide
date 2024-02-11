package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "beanE")
@Scope(scopeName = "prototype")
public class BeanE{
	
	@PostConstruct
	public void startUp() {
		System.err.println("in BeanE startUp()");
	}
	
	public void cleanResources() {
		System.err.println("in BeanE cleanResources()");
	}
}

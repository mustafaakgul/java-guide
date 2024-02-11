package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1;

import org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1.BeanE;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PrototypeDestroyer implements BeanPostProcessor, BeanFactoryAware, DisposableBean {
	private BeanFactory beanFactory;

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("beanE".equals(beanName))
			((BeanE) bean).cleanResources();
		return bean;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public void destroy() throws Exception {
		
	}
}

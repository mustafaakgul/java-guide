package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

public class BeanEDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
//		System.out.println(beanName);
		if("beanE".equals(beanName))
			((BeanE) bean).cleanResources();
	}
	
	public boolean requiresDestruction(final Object bean) {
        return true;
    }
}

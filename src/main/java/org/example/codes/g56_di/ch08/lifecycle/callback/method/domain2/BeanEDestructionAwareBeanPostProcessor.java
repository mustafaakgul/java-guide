package org.javaturk.spring.di.ch08.lifecycle.callback.method.domain2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanEDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		if("beanE".equals(beanName))
			((BeanE) bean).cleanResources();
	}
	
	public boolean requiresDestruction(final Object bean) {
        return true;
    }

}

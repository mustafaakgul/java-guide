package org.javaturk.spring.di.ch08.lifecycle.callback.prototype;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * https://iryndin.dev/post/spring_destroy_prototype_beans/
 * 
 * @author akin
 *
 */
@Component
public class DestroyPrototypeBeansPostProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

	private BeanFactory beanFactory;

	private final List<Object> prototypeBeans = new LinkedList<>();

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanFactory.isPrototype(beanName)) {
			synchronized (prototypeBeans) {
				prototypeBeans.add(bean);
			}
		}
		return bean;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Starting destroying prototypes!");
		synchronized (prototypeBeans) {
			for (Object bean : prototypeBeans) {
				if (bean instanceof DisposableBean) {
					DisposableBean disposable = (DisposableBean) bean;
					try {
						disposable.destroy();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			prototypeBeans.clear();
		}
	}
}
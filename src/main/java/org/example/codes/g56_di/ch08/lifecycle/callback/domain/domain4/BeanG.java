package org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This bean is for
 * org.javaturk.spring.di.ch08.lifecycle.callback.prototype.PrototypeDestroyerExample
 * 
 * @author akin
 *
 */
@Component
@Scope("prototype")
public class BeanG implements InitializingBean, DisposableBean {
	private String name;
	private int no;
	private static int count;

	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanG [name= " + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		no = ++count;
		System.out.println("in BeanG afterPropertiesSet() no: " + no);
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("in BeanG destroy() no: " + no);
		--count;
		if(count == 0)
			System.err.println("\nAll BeanGs are destroyed.");
	}
}

package org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanH implements InitializingBean, DisposableBean{
	private int no;
	private static int count;

	@Override
	public void afterPropertiesSet() throws Exception {
		no = ++count;
		System.out.println("in BeanH afterPropertiesSet() no: " + no);
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("in BeanH destroy() no: " + no);
		--count;
		if(count == 0)
			System.err.println("\nAll BeanHs are destroyed.");
	}
}

package org.javaturk.spring.di.ch06.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OSCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String os = context.getEnvironment().getProperty("os.name");
		if (os.contains("Mac"))
			return true;
		else
			return false;
	}
}

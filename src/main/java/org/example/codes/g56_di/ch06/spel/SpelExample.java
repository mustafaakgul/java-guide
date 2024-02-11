package org.javaturk.spring.di.ch06.spel;

import java.util.GregorianCalendar;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelExample {

	public static void main(String[] args) {
//		runExamples1();
		runExamples2();
	}

	public static void runExamples1() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.concat('!')");
		String message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("new String('hello world').toUpperCase()");
		message = exp.getValue(String.class);
		System.out.println(message);

		exp = parser.parseExpression("'Hello World'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);
	}

	public static void runExamples2() {
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);

		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");

		ExpressionParser parser = new SpelExpressionParser();

		Expression exp = parser.parseExpression("name"); // Parse name as an expression
		String name = (String) exp.getValue(tesla);
		System.out.println(name);

		exp = parser.parseExpression("name == 'Nikola Tesla'");
		boolean result = exp.getValue(tesla, Boolean.class);
		System.out.println(result);
	}
}

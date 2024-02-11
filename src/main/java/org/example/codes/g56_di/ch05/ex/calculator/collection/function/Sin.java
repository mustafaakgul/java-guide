package org.javaturk.spring.di.ch05.ex.calculator.collection.function;

public class Sin implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}

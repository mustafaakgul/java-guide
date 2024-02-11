package org.javaturk.spring.di.ch06.ex.calculator.qualifier.function;

public class Sin implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}

	@Override
	public String getName() {
		return "sin";
	}
}

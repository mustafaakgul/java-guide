package org.javaturk.spring.di.ch06.ex.calculator.qualifier.function;

public class Cos implements MathFunction{

	@Override
	public double calculate(double arg) {
		return Math.cos(arg);
	}
	
	@Override
	public String getName() {
		return "cos";
	}

}

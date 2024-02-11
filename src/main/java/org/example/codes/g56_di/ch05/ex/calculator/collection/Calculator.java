package org.javaturk.spring.di.ch05.ex.calculator.collection;

import java.util.Map;

import org.javaturk.spring.di.ch05.ex.calculator.collection.function.MathFunction;

public class Calculator {
	private Map<String, MathFunction> functions;

	public Calculator() {

	}
	
	public void setFunctions(Map<String, MathFunction> functions) {
		this.functions = functions;
	}

	public double doCalculation(String functionName, double argument){
		MathFunction function = functions.get(functionName);
		return function.calculate(argument);
	}
}

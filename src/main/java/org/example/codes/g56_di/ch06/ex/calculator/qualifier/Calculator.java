package org.javaturk.spring.di.ch06.ex.calculator.qualifier;

import org.javaturk.spring.di.ch06.ex.calculator.qualifier.function.MathFunction;

public class Calculator {

	private MathFunction sin;
	private MathFunction cos;
	private MathFunction log;

	public double doCalculation(String functionName, double argument){
		MathFunction function = null;
		if(sin.getName().equals(functionName)) 
				function = sin;
		else if(cos.getName().equals(functionName)) 
			function = cos;
		else if(log.getName().equals(functionName)) 
			function = log;
		
		return function.calculate(argument);
	}
}

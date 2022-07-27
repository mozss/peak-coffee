package com.mozss.pattern23.design11behavior.behavior03strategy.sample_03;

public class Plus extends CalculatorAbs implements CalculatorI {
	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}
}

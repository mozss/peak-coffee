package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample_03;

public class Client {
	public static void main(String[] args) {
		String exp = "8+8";
		CalculatorAbs cal = new CalculatorConcretePlus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}

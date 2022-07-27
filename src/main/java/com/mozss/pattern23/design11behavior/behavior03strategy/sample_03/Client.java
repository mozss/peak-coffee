package com.mozss.pattern23.design11behavior.behavior03strategy.sample_03;

public class Client {
	public static void main(String[] args) {
		//测试的时候注意: 下面exp不能有空格, 即不能为"2 + 8"
		String exp = "2+8";
		CalculatorI calculatorI = new Plus();
		int result = calculatorI.calculate(exp);
		System.out.println(result);
	}
}

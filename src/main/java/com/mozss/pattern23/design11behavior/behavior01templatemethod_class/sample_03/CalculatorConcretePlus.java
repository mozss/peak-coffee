package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample_03;

public class CalculatorConcretePlus extends CalculatorAbs {
	/**
	 * 被子类重写的方法
	 *
	 * @param num1
	 * @param num2
	 * @return
	 */
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}

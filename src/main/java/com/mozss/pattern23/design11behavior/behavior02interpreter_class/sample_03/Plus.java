package com.mozss.pattern23.design11behavior.behavior02interpreter_class.sample_03;

public class Plus implements Expression {
	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}
}

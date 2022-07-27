package com.mozss.pattern23.design11behavior.behavior02interpreter_class.sample_01;

public class AdvanceExpression extends Expression {
	@Override
	void interpret(Context ctx) {
		System.out.println("这是高级解析器!");
	}
}

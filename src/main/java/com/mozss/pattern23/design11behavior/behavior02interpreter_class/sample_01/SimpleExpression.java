package com.mozss.pattern23.design11behavior.behavior02interpreter_class.sample_01;

public class SimpleExpression extends Expression {
	@Override
	void interpret(Context ctx) {
		System.out.println("这是普通解析器!");
	}
}

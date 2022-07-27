package com.mozss.pattern23.design11behavior.behavior02interpreter_class.sample_03;

public class Client {
	public static void main(String[] args) {
		//计算9+2-8
		int result = new Minus().
				interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}

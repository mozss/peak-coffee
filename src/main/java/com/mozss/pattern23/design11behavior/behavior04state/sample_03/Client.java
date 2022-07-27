package com.mozss.pattern23.design11behavior.behavior04state.sample_03;

public class Client {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		//设置第一种状态
		state.setValue("state1");
		context.method();
		
		//设置第二种状态
		state.setValue("state2");
		context.method();
	}
}

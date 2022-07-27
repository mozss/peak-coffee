package com.mozss.pattern23.design11behavior.behavior04state.sample_03;

/**
 * 状态切换的上下文
 */
public class Context {
	private State state;
	
	public Context(State state) {
		this.state = state;
	}
	
	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}

package com.mozss.pattern23.design11behavior.behavior04state.sample;

public class Context {
	//定义状态
	public final static State STATE1 = new StateConcrete_01();
	public final static State STATE2 = new StateConcrete_02();
	
	//当前状态
	private State CurrentState;
	
	//获得当前状态
	public State getCurrentState() {
		return CurrentState;
	}
	
	//设置当前状态
	public void setCurrentState(State currentState) {
		this.CurrentState = currentState;
		//切换状态
		this.CurrentState.setContext(this);
	}
	
	//行为委托
	public void handle1() {
		this.CurrentState.handle1();
	}
	
	public void handle2() {
		this.CurrentState.handle2();
	}
}

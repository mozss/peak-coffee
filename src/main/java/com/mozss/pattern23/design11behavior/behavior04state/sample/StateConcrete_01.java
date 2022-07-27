package com.mozss.pattern23.design11behavior.behavior04state.sample;

public class StateConcrete_01 extends State {
	@Override
	public void handle1() {
		//本状态下必须要处理的事情
	}
	
	@Override
	public void handle2() {
		//设置当前的状态为stat2
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}
}

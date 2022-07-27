package com.mozss.pattern23.design11behavior.behavior04state.sample;

public class StateConcrete_02 extends State {
	@Override
	public void handle1() {
		//设置当前的状态为state1
		super.context.setCurrentState(Context.STATE1);
		//过渡到state状态, 由Context实现
		super.context.handle1();
	}
	
	@Override
	public void handle2() {
		//本状态下必须要处理的逻辑
	}
}

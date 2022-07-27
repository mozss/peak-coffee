package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_better;

public class LiftStateRunning extends LiftStateAbs {
	//运行时候开电梯门? 你疯了! 电梯是不会给你开的
	@Override
	public void open() {
		//do nothing
	}
	
	//电梯关门? 这是肯定的
	@Override
	public void close() {
		//do nothing
	}
	
	//这是运行状态下要实现的方法
	@Override
	public void run() {
		System.out.println("电梯上下运行...");
	}
	
	//这绝对是合理的, 只运行不停止还有谁敢做这个电梯? 估计只有上帝了
	@Override
	public void stop() {
		super.context.setLiftState(Context.stateStop);
		super.context.getLiftState().stop();
	}
}

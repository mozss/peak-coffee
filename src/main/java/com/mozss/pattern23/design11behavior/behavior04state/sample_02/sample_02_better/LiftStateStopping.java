package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_better;

public class LiftStateStopping extends LiftStateAbs {
	
	//停止状态, 开门, 那是要的
	@Override
	public void open() {
		super.context.setLiftState(Context.stateOpen);
		super.context.getLiftState().open();
	}
	
	//停止状态关门? 电梯门本来就是关闭着的
	@Override
	public void close() {
		//do nothing
	}
	
	//停止状态在运行起来, 正常得很
	@Override
	public void run() {
		super.context.setLiftState(Context.stateRun);
		super.context.getLiftState().run();
	}
	
	//停止状态时怎么样的呢? 当然是停止方法执行了
	@Override
	public void stop() {
		System.out.println("电梯停止了...");
	}
}

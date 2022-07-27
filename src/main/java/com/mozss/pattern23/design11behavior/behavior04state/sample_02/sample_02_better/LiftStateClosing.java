package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_better;

public class LiftStateClosing extends LiftStateAbs {
	
	//电梯门关了再打开
	@Override
	public void open() {
		super.context.setLiftState(Context.stateOpen);
		super.context.getLiftState().open();
	}
	
	//电梯门关闭, 这是关闭状态要实现的动作
	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}
	
	//电梯门关了就运行, 这是再正常不过了
	@Override
	public void run() {
		super.context.setLiftState(Context.stateRun);
		super.context.getLiftState().run();
	}
	
	//电梯门关着, 我就不按楼层
	@Override
	public void stop() {
		super.context.setLiftState(Context.stateStop);
		super.context.getLiftState().stop();
	}
}

package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_better;

public class LiftStateOpenning extends LiftStateAbs {
	//打开电梯门
	@Override
	public void open() {
		System.out.println("电梯门开启");
	}
	
	//开启当然可以关闭, 我就想测试一下电梯门开关功能
	@Override
	public void close() {
		//状态修改
		super.context.setLiftState(Context.stateClose);
		//动作委托为StateClose来执行
		super.context.getLiftState().close();
	}
	
	//门开着时电梯就运行跑, 这电梯, 吓死你
	@Override
	public void run() {
		//do nothing
	}
	
	//开门还不停止
	@Override
	public void stop() {
		//do nothing
	}
}

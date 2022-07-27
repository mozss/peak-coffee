package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_before;

public interface LiftI {
	//电梯的4个状态
	public final static int OPEN_STATE = 1; //开门
	public final static int CLOSE_STATE = 2; //闭门
	public final static int RUN_STATE = 3; //运行
	public final static int STOP_STATE = 4; //停止
	
	public void setState(int state);
	
	//首先电梯门开启动作
	public void open();
	
	//电梯门可以开启, 那当然也就可以关闭了
	public void close();
	
	//电梯要能上能下
	public void run();
	
	//电梯还要能停下来
	public void stop();
}

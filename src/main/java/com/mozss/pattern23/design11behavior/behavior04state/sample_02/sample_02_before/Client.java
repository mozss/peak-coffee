package com.mozss.pattern23.design11behavior.behavior04state.sample_02.sample_02_before;

public class Client {
	public static void main(String[] args) {
		LiftI lift = new LiftImpl();
		
		//电梯的初始条件应该是停止状态
		lift.setState(LiftI.STOP_STATE);
		
		//首先门开启
		lift.open();
		
		//门关闭
		lift.close();
		
		//电梯运行
		lift.run();
		
		//电梯停下来
		lift.stop();
	}
}

package com.mozss.pattern23.design11behavior.behavior04state.sample;

public class Client {
	public static void main(String[] args) {
		//定义环境角色
		Context context = new Context();
		
		//初始化状态
		context.setCurrentState(new StateConcrete_01());
		
		//行为执行
		context.handle1();
		context.handle2();
	}
}

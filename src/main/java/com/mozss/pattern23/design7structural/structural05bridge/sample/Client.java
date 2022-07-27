package com.mozss.pattern23.design7structural.structural05bridge.sample;

public class Client {
	public static void main(String[] args) {
		//定义一个实现化的角色
		Implementor implementor = new ImplementorImpl_01();
		//定义一个抽象化角色
		Abstraction abs = new RefinedAbstraction(implementor);
		//执行
		abs.request();
	}
}

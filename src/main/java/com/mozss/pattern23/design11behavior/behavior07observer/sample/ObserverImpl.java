package com.mozss.pattern23.design11behavior.behavior07observer.sample;

public class ObserverImpl implements Observer {
	@Override
	public void update() {
		System.out.println("接收到信息, 并进行处理!");
	}
}

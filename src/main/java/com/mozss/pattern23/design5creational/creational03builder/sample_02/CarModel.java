package com.mozss.pattern23.design5creational.creational03builder.sample_02;

import java.util.ArrayList;

public abstract class CarModel {
	
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	
	//可以启动
	protected abstract void start();
	
	//可以停下
	protected abstract void stop();
	
	//喇叭发生
	protected abstract void alarm();
	
	//引擎会响
	protected abstract void engineBoom();
	
	//可以运行
	final public void run() {
		//循环一边, 谁在前, 就先执行谁
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) {
				this.start(); //开启汽车
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop();
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}
	}
	
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
	
	
}

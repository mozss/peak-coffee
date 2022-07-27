package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample_02;

public abstract class HummerModelAbs {
	/*
	 * 首先, 这个模型要能够发动起来, 别管是手动还是电动, 那这个实现要在实现类里
	 */
	public abstract void start();
	
	//停下来
	public abstract void stop();
	
	//喇叭发声
	public abstract void alarm();
	
	//引擎发声
	public abstract void engineBoom();
	
	//跑起来
	public void run() {
		//先发动汽车
		this.start();
		
		//引擎开始轰鸣
		this.engineBoom();
		
		//开始跑, 遇到行人, 按喇叭
		this.alarm();
		
		//到底目的地, 停车
		this.stop();
		
	}
}
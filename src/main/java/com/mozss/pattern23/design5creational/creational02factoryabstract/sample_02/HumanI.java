package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_02;

public interface HumanI {
	// 每个人种都有相应的颜色
	public void getColor();
	
	// 人类会说话
	public void talk();
	
	/*
	 * 这个例子利用性别的维度, 展现了抽象工厂的例子
	 */
	public void getSex();
}

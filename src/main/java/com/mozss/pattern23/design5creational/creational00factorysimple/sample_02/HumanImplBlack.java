package com.mozss.pattern23.design5creational.creational00factorysimple.sample_02;

public class HumanImplBlack implements Human {
	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤的颜色是黑色的!!!");
	}
	
	@Override
	public void talk() {
		System.out.println("黑色人说当地的土著语言");
	}
}

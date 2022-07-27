package com.mozss.pattern23.design5creational.creational00factorysimple.sample_02;

public class HumanImplWhite implements Human {
	@Override
	public void getColor() {
		System.out.println("白色人种的皮肤的颜色是白色的!!!");
	}
	
	@Override
	public void talk() {
		System.out.println("白色人说字母语系的语言");
	}
}

package com.mozss.pattern23.design5creational.creational00factorysimple.sample_02;

public class HumanImplYellow implements Human {
	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤的颜色是黄色的!!!");
	}
	
	@Override
	public void talk() {
		System.out.println("黄色人大多说亚洲语系的语言, 比如中文,日语... ");
	}
}

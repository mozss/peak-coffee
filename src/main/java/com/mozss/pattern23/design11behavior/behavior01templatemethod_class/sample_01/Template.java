package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample_01;

public abstract class Template {
	public abstract void print();
	
	public void update() {
		System.out.println("开始打印");
		for (int i = 0; i < 10; i++) {
			print();
		}
	}
}

package com.mozss.pattern23.design7structural.structural03decorator.sample;

public class Client {
	public static void main(String[] args) {
		Component component = new ComponentConcrete();
		
		//第一次修饰
		component = new DecoratorConcrete_01(component);
		
		//第二次修饰
		component = new DecoratorConcrete_02(component);
		
		//修饰后运行
		component.operate();
	}
}

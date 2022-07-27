package com.mozss.pattern23.design7structural.structural03decorator.sample;

public class DecoratorConcrete_01 extends Decorator {
	
	/**
	 * 定义被修饰着
	 *
	 * @param _component
	 */
	public DecoratorConcrete_01(Component _component) {
		super(_component);
	}
	
	/**
	 * 定义自己的修饰方法
	 */
	private void method_01() {
		System.out.println("method_01的修饰");
	}
	
	/**
	 * 重写父类的Operation方法
	 */
	public void operate() {
		this.method_01();
		super.operate();
	}
}

package com.mozss.pattern23.design7structural.structural03decorator.sample;

public class DecoratorConcrete_02 extends Decorator {
	
	/**
	 * 定义被修饰着
	 *
	 * @param _component
	 */
	public DecoratorConcrete_02(Component _component) {
		super(_component);
	}
	
	/**
	 * 定义自己的修饰方法
	 */
	private void method_02() {
		System.out.println("method_02的修饰");
	}
	
	/**
	 * 重写父类的Operation方法
	 */
	public void operate() {
		this.method_02();
		super.operate();
	}
}

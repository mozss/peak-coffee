package com.mozss.pattern23.design7structural.structural03decorator.sample_01;

public class ManDecoratorB extends Decorator {
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("==========");
		System.out.println("ManDecoratorB类");
	}
}

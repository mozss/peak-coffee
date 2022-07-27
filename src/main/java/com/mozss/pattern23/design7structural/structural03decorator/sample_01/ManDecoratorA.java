package com.mozss.pattern23.design7structural.structural03decorator.sample_01;

public class ManDecoratorA extends Decorator {
	@Override
	public void eat() {
		super.eat();
		reEat();
		System.out.println("ManDecoratorA类");
	}
	
	private void reEat() {
		System.out.println("再吃一顿");
	}
}

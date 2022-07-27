package com.mozss.pattern23.design7structural.structural03decorator.sample_03;

public class Decorator implements Sourceable {
	
	private Sourceable sourceable;
	
	public Decorator(Sourceable sourceable) {
		super();
		this.sourceable = sourceable;
	}
	
	@Override
	public void method() {
		System.out.println("装饰之前---");
		sourceable.method();
		System.out.println("装饰之后---");
	}
}

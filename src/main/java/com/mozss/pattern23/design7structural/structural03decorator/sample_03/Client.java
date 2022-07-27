package com.mozss.pattern23.design7structural.structural03decorator.sample_03;

public class Client {
	public static void main(String[] args) {
		Sourceable sourceable = new Source();
		Sourceable obj = new Decorator(sourceable);
		obj.method();
	}
}

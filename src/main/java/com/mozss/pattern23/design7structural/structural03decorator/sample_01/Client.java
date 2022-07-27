package com.mozss.pattern23.design7structural.structural03decorator.sample_01;

public class Client {
	public static void main(String[] args) {
		Man man = new Man();
		
		ManDecoratorA md_a = new ManDecoratorA();
		ManDecoratorB md_b = new ManDecoratorB();
		
		md_a.setPerson(man);
		md_b.setPerson(md_a);
		md_b.eat();
	}
}

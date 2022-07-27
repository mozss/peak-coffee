package com.mozss.pattern23.design7structural.structural07flyweight.sample_01;

public class Client {
	public static void main(String[] args) {
		
		Flyweight fly1 = FlyweightFactory.getFlyweight("a");
		fly1.action(1);
		
		Flyweight fly2 = FlyweightFactory.getFlyweight("a");
		System.out.println("fly1和fly2是否相等" + (fly1 == fly2));
		System.out.println("==========");
		
		Flyweight fly3 = FlyweightFactory.getFlyweight("b");
		fly3.action(2);
		
		Flyweight fly4 = FlyweightFactory.getFlyweight("c");
		fly4.action(3);
		
		Flyweight fly5 = FlyweightFactory.getFlyweight("d");
		fly5.action(4);
		
		System.out.println(FlyweightFactory.getSize());
	}
}

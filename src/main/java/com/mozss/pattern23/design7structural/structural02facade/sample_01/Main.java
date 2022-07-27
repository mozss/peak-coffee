package com.mozss.pattern23.design7structural.structural02facade.sample_01;

public class Main {
	public static void main(String[] args) {
		ServiceA serviceA = new ServiceAImpl();
		ServiceB serviceB = new ServiceBImpl();
		ServiceC serviceC = new ServiceCImpl();
		
		serviceA.methodA();
		serviceB.methodB();
		System.out.println("==========");
		
		Facade facade = new Facade();
		facade.method_1();
		facade.method_2();
		facade.method_3();
	}
}

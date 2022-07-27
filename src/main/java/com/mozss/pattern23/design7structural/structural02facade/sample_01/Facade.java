package com.mozss.pattern23.design7structural.structural02facade.sample_01;

public class Facade {
	ServiceA sa;
	ServiceB sb;
	ServiceC sc;
	
	public Facade() {
		sa = new ServiceAImpl();
		sb = new ServiceBImpl();
		sc = new ServiceCImpl();
	}
	
	public void method_1() {
		System.out.println("外观类=>同时创建A和B");
		sa.methodA();
		sb.methodB();
	}
	
	public void method_2() {
		System.out.println("外观类=>同时创建B和C");
		sb.methodB();
		sc.methodC();
	}
	
	public void method_3() {
		System.out.println("外观类=>同时创建A和C");
		sc.methodC();
		sa.methodA();
	}
}

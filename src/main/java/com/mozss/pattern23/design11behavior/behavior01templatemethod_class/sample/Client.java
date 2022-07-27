package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample;

public class Client {
	public static void main(String[] args) {
		AbstractClass class_01 = new AbstractClassConcrete_01();
		AbstractClass class_02 = new AbstractClassConcrete_02();
		
		//调用模板方法
		class_01.templateMethod();
		class_02.templateMethod();
	}
}

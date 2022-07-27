package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample_03;

public class Adapter extends Source implements Targetable {
	
	
	/**
	 * 新类的方法
	 */
	@Override
	public void method_02() {
		System.out.println("this is the targetable method");
	}
}

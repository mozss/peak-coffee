package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample_03;

public class Client {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method_01();
		target.method_02();
	}
}

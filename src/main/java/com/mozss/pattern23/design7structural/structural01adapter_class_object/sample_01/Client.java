package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample_01;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}
}

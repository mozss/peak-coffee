package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample;

public class Client {
	public static void main(String[] args) {
		//原有的业务逻辑
		Target target01 = new TargetImpl();
		target01.request();
		
		//现在增加了适配器角色后的业务逻辑
		Target target02 = new TargetImpl();
		target02.request();
	}
}

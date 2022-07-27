package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {
	/**
	 * 目标角色有自己的方法
	 */
	@Override
	public void request() {
		super.doSomething();
	}
}

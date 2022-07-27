package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample;

/**
 * 目标角色的实现类
 */
public class TargetImpl implements Target {
	/**
	 * 目标角色有自己的方法
	 */
	@Override
	public void request() {
		System.out.println("if you need and help, please call me!");
	}
}

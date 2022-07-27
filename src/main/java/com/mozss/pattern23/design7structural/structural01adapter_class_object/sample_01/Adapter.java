package com.mozss.pattern23.design7structural.structural01adapter_class_object.sample_01;

/**
 * <pre>Adapter:
 * 适配器模式的核心角色, 其他两个角色已经建立, 这个角色是需要新建立的
 * 职责: 把源角色转换为目标角色, 怎么转换呢? 通过继承还是类关联呢?</pre>
 */
public class Adapter extends Adaptee implements Target {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void adapteeMethod() {
		adaptee.adapteeMethod();
	}
	
	@Override
	public void adapterMethod() {
		System.out.println("Adapter method!");
	}
	
}

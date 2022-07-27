package com.mozss.pattern23.design7structural.structural05bridge.sample;

/**
 * 这里为什么要增加一个构造函数呢?
 * 是为了提醒子类, 你必须要做这项工作, 指定实现类, 特别是已经明确了实现者, 则尽量清晰明确地定义出来.
 */
public abstract class Abstraction {
	/**
	 * 定义对实现化角色的引用
	 */
	private Implementor implementor;
	
	/**
	 * 约束子类必须实现该构造函数
	 */
	public Abstraction(Implementor _implementor) {
		this.implementor = _implementor;
	}
	
	/**
	 * 自身的行为和属性
	 */
	public void request() {
		this.implementor.doSomething();
	}
	
	/**
	 * 获得实现化角色
	 */
	public Implementor getImplementor() {
		return implementor;
	}
	
}

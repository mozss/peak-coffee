package com.mozss.pattern23.design11behavior.behavior03strategy.sample;

/**
 * 封装角色
 */
public class Context {
	//抽象策略
	private Strategy strategy = null;
	
	//构造函数设置具体策略
	public Context(Strategy _strategy) {
		this.strategy = _strategy;
	}
	
	//封装后的策略方法
	public void doAnything() {
		this.strategy.doSomething();
	}
}

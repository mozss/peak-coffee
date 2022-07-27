package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample;

public abstract class AbstractClass {
	//基本方法
	protected abstract void doSomething();
	
	//基本方法
	protected abstract void doAnything();
	
	//模板方法
	public void templateMethod() {
		//调用基本方法, 完成相关的逻辑
		this.doAnything();
		this.doSomething();
	}
}

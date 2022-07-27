package com.mozss.pattern23.design11behavior.behavior09visitor.sample;

/**
 * 抽象元素
 */
public abstract class ElementAbs {
	//定义业务逻辑
	public abstract void doSomething();
	
	//允许谁来访问
	public abstract void accept(VisitorI visitor);
}

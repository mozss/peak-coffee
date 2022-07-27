package com.mozss.pattern23.design11behavior.behavior08mediator.sample;

/**
 * 通用中介者
 */
public abstract class Mediator {
	//定义同事类
	protected ColleagueConcrete_01 c1;
	protected ColleagueConcrete_02 c2;
	
	//中介者模式的业务逻辑
	public abstract void doSomething_01();
	
	public abstract void doSomething_02();
	
	public ColleagueConcrete_01 getC1() {
		return c1;
	}
	
	public void setC1(ColleagueConcrete_01 c1) {
		this.c1 = c1;
	}
	
	public ColleagueConcrete_02 getC2() {
		return c2;
	}
	
	public void setC2(ColleagueConcrete_02 c2) {
		this.c2 = c2;
	}
}

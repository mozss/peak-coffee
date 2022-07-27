package com.mozss.pattern23.design11behavior.behavior08mediator.sample;

public class MediatorConcrete extends Mediator {
	
	/*
	 * 中介者所具有的的方法doSomething_01和doSomething_02都是比较复杂的业务逻辑, 为同事类服务,
	 * 其实现是依赖各个同事类来完成的
	 */
	@Override
	public void doSomething_01() {
		//调用同事类的方法, 只要public方法都可以调用
		super.c1.selfMethod_01();
		super.c2.selfMethod_02();
		
	}
	
	@Override
	public void doSomething_02() {
		super.c1.selfMethod_01();
		super.c2.selfMethod_02();
	}
}

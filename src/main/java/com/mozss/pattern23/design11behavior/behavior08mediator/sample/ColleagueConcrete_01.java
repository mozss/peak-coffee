package com.mozss.pattern23.design11behavior.behavior08mediator.sample;

public class ColleagueConcrete_01 extends Colleague {
	public ColleagueConcrete_01(Mediator mediator) {
		super(mediator);
	}
	
	public void selfMethod_01() {
		//处理自己的业务
	}
	
	//依赖方法
	public void depMethod_01() {
		//处理自己的业务
		
		//自己不能处理的业务逻辑, 委托给中介者处理
		super.mediator.doSomething_01();
	}
}

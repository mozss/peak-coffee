package com.mozss.pattern23.design11behavior.behavior08mediator.sample;

public class ColleagueConcrete_02 extends Colleague {
	public ColleagueConcrete_02(Mediator mediator) {
		super(mediator);
	}
	
	public void selfMethod_02() {
		//处理自己的业务
	}
	
	//依赖方法
	public void depMethod_02() {
		//处理自己的业务
		
		//自己不能处理的业务逻辑, 委托给中介者处理
		super.mediator.doSomething_02();
	}
}

package com.mozss.pattern23.design11behavior.behavior09visitor.sample;

/**
 * 具体元素
 */
public class ElementConcrete_02 extends ElementAbs {
	//完善业务逻辑
	@Override
	public void doSomething() {
		//业务处理
	}
	
	//允许那个访问者访问
	@Override
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}
}

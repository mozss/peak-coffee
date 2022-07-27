package com.mozss.pattern23.design7structural.structural05bridge.sample;

public class RefinedAbstraction extends Abstraction {
	/**
	 * 覆写构造方法
	 *
	 * @param _implementor
	 */
	public RefinedAbstraction(Implementor _implementor) {
		super(_implementor);
	}
	
	/**
	 * 修正父类的行为
	 */
	@Override
	public void request() {
		//业务处理
		super.request();
		super.getImplementor().doAnything();
	}
	
	
}

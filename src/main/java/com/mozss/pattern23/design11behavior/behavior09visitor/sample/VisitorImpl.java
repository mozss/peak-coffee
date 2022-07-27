package com.mozss.pattern23.design11behavior.behavior09visitor.sample;

/**
 * 具体的访问者
 */
public class VisitorImpl implements VisitorI {
	//访问elementConcrete_01
	@Override
	public void visit(ElementConcrete_01 elementConcrete_01) {
		elementConcrete_01.doSomething();
	}
	
	//访问elementConcrete_02
	@Override
	public void visit(ElementConcrete_02 elementConcrete_02) {
		elementConcrete_02.doSomething();
	}
}

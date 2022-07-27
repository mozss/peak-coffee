package com.mozss.pattern23.design11behavior.behavior09visitor.sample;

public interface VisitorI {
	
	//可以访问哪些对象
	public void visit(ElementConcrete_01 elementConcrete_01);
	
	public void visit(ElementConcrete_02 elementConcrete_02);
}

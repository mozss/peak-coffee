package com.mozss.pattern23.design11behavior.behavior09visitor.sample_01;

import java.util.Collection;

public interface Visitor {
	
	public void visitString(StringElement stringE);
	
	public void visitFloat(FloatElement floatE);
	
	public void visitCollection(Collection collection);
	
}

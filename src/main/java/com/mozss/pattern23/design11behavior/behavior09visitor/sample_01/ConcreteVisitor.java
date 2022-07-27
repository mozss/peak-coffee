package com.mozss.pattern23.design11behavior.behavior09visitor.sample_01;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {
	
	
	@Override
	public void visitString(StringElement stringE) {
		System.out.println(stringE.getSe());
	}
	
	@Override
	public void visitFloat(FloatElement floatE) {
		System.out.println(floatE.getFe());
	}
	
	@Override
	public void visitCollection(Collection collection) {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Visitable) {
				((Visitable) o).accept(this);
			}
		}
	}
}

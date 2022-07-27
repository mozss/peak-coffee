package com.mozss.pattern23.design11behavior.behavior10iterator.sample;

import java.util.Vector;

public class AggregateImpl implements Aggregate {
	//容纳对象的容器
	private Vector vector = new Vector();
	
	
	@Override
	public void add(Object object) {
		this.vector.add(object);
	}
	
	@Override
	public void remove(Object object) {
		this.remove(object);
	}
	
	@Override
	public Iterator iterator() {
		return new IteratorImpl(this.vector);
	}
}

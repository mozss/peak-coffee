package com.mozss.pattern23.design11behavior.behavior10iterator.sample_01;


public class IteratorImpl implements Iterator {
	private List list;
	private int index;
	
	public IteratorImpl(List list) {
		index = 0;
		this.list = list;
	}
	
	@Override
	public Object next() {
		Object obj = list.get(index);
		index++;
		return obj;
	}
	
	@Override
	public void first() {
		index = 0;
	}
	
	@Override
	public void last() {
		index = list.getSize();
	}
	
	@Override
	public boolean hasNext() {
		return index < list.getSize();
	}
}

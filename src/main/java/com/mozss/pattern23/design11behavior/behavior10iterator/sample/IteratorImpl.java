package com.mozss.pattern23.design11behavior.behavior10iterator.sample;

import com.mozss.pattern23.design7structural.structural04proxy.sample_01.Object;

import java.util.Vector;

public class IteratorImpl implements Iterator {
	//定义当前游标
	public int cursor = 0;
	private Vector vector = new Vector();
	
	@SuppressWarnings("unchecked")
	public IteratorImpl(Vector vector) {
		this.vector = vector;
	}
	
	@Override
	public Object next() {
		Object result = null;
		if (this.hasNext()) {
			result = (Object) this.vector.get(this.cursor++);
		} else {
			result = null;
		}
		return result;
	}
	
	/**
	 * 判断是否到达尾部
	 *
	 * @return
	 */
	@Override
	public boolean hasNext() {
		if (this.cursor == this.vector.size()) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}
}

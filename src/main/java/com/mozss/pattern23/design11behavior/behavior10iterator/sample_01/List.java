package com.mozss.pattern23.design11behavior.behavior10iterator.sample_01;

public interface List {
	Iterator iterator();
	
	Object get(int index);
	
	int getSize();
	
	void add(Object obj);
}

package com.mozss.pattern23.design11behavior.behavior10iterator.sample;

import com.mozss.pattern23.design7structural.structural04proxy.sample_01.Object;

/**
 * 抽象迭代器
 */
public interface Iterator {
	//遍历到下一个元素
	public Object next();
	
	//是否已经遍历到尾部
	public boolean hasNext();
	
	//删除当前指向的元素
	public boolean remove();
}

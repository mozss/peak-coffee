package com.mozss.pattern23.design11behavior.behavior10iterator.sample;

public class Client {
	public static void main(String[] args) {
		//声明出容器
		Aggregate aggregate = new AggregateImpl();
		//放入对象数据
		aggregate.add("abc");
		aggregate.add("123");
		aggregate.add("xyz");
		
		//遍历一下
		Iterator iterator = aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

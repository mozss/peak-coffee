package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_hungry;

/**
 * 饿汉模式;线程安全的
 */
public class SingletonHungry {
	
	private static SingletonHungry instance = null;
	
	static {
		instance = new SingletonHungry();
	}
	
	private SingletonHungry() {
	}
	
	public static SingletonHungry getInstance() {
		return instance;
	}
}

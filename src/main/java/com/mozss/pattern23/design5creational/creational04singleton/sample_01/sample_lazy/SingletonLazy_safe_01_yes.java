package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_lazy;

/**
 * 饿汉模式(在类加载时候进行创建);线程安全的
 */
public class SingletonLazy_safe_01_yes {
	
	private static SingletonLazy_safe_01_yes instance = new SingletonLazy_safe_01_yes();
	
	private SingletonLazy_safe_01_yes() {
	}
	
	public static SingletonLazy_safe_01_yes getInstance() {
		return instance;
	}
}

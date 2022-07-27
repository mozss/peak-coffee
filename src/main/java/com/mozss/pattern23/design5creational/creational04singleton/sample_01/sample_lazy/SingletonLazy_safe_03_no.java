package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_lazy;


/**
 * 懒汉模式;线程安全的(但不推荐)
 */
public class SingletonLazy_safe_03_no {
	
	private static SingletonLazy_safe_03_no instance = null;
	
	private SingletonLazy_safe_03_no() {
	}
	
	public static synchronized SingletonLazy_safe_03_no getInstance() {
		if (instance == null) {
			instance = new SingletonLazy_safe_03_no();
		}
		return instance;
	}
}

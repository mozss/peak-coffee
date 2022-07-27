package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_lazy;

/**
 * 懒汉模式;线程安全的
 */
public class SingletonLazy_safe_02_yes {
	
	//volatile + 双重检测机制来禁止指令重排
	private volatile static SingletonLazy_safe_02_yes instance = null;
	
	private SingletonLazy_safe_02_yes() {
	}
	
	public static SingletonLazy_safe_02_yes getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy_safe_02_yes.class) {
				if (instance == null) {
					instance = new SingletonLazy_safe_02_yes();
				}
			}
		}
		return instance;
	}
}

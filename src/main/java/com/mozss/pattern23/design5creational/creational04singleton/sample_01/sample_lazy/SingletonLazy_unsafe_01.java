package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_lazy;

/**
 * 懒汉模式;线程不安全的
 */
public class SingletonLazy_unsafe_01 {
	
	private static SingletonLazy_unsafe_01 instance = null;
	
	private SingletonLazy_unsafe_01() {
	}
	
	public static SingletonLazy_unsafe_01 getInstance() {
		//多个线程同时调用, 可能会创建多个对象
		if (instance == null) {
			instance = new SingletonLazy_unsafe_01();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println(SingletonLazy_unsafe_01.getInstance().hashCode());
		}).start();
		new Thread(() -> {
			System.out.println(SingletonLazy_unsafe_01.getInstance().hashCode());
		}).start();
		new Thread(() -> {
			System.out.println(SingletonLazy_unsafe_01.getInstance().hashCode());
		}).start();
	}
}

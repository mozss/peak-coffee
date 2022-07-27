package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_lazy;

/**
 * 懒汉模式;线程不安全的
 */
public class SingletonLazy_unsafe_02 {
	
	private static SingletonLazy_unsafe_02 instance = null;
	
	private SingletonLazy_unsafe_02() {
	}
	
	public static SingletonLazy_unsafe_02 getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy_unsafe_02.class) {
				if (instance == null) {
					instance = new SingletonLazy_unsafe_02();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println(SingletonLazy_unsafe_02.getInstance().hashCode());
		}).start();
		new Thread(() -> {
			System.out.println(SingletonLazy_unsafe_02.getInstance().hashCode());
		}).start();
		new Thread(() -> {
			System.out.println(SingletonLazy_unsafe_02.getInstance().hashCode());
		}).start();
	}
}

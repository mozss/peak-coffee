package com.mozss.pattern23.design5creational.creational04singleton.sample_01.sample_enum;

/**
 * 通过枚举实现线程最安全的方式
 */
public class SingletonEnum {
	
	private SingletonEnum() {
	}
	
	public static SingletonEnum getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	
	private enum Singleton {
		INSTANCE;
		
		private SingletonEnum singleton;
		
		//JVM保证这个方法只会调用一次
		Singleton() {
			singleton = new SingletonEnum();
		}
		
		public SingletonEnum getInstance() {
			return singleton;
		}
	}
}

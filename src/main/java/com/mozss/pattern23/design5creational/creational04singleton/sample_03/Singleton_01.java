package com.mozss.pattern23.design5creational.creational04singleton.sample_03;

/**
 * <pre>
 * 非线程安全的
 * 参考:Singleton_02.java的改进</pre>
 */
public class Singleton_01 {
	//持有私有静态实例, 防止被引用, 赋值为null, 目的是延迟加载
	private static Singleton_01 instance = null;
	
	//私有构造方法, 防止被实例化
	private Singleton_01() {
	
	}
	
	//静态方法, 创建实例
	public static Singleton_01 getInstance() {
		if (instance == null) {
			instance = new Singleton_01();
		}
		return instance;
	}
	
	//如果该对象用于序列化, 可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}

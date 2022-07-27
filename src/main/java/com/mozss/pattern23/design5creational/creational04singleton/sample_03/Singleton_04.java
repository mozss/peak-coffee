package com.mozss.pattern23.design5creational.creational04singleton.sample_03;

/**
 * <pre>
 * 相对完美单例模式:
 *
 * 单例模式使用内部类来维护单例的实现, JVM内部的机制能够保证当一个类被加载的时候,
 * 这个类的加载过程是线程互斥的.
 *
 * 当我们第一次调用getInstance()的时候,JVM能够保证instance只被创建一次, 并且会保证把赋值给instance
 * 内存初始化完毕.
 * 同时, 该方法也只会在第一次调用的时候使用互斥机制, 这样就解决了低性能问题.
 *
 * 不完美的原因:
 * 如果在构造函数中抛出异常, 实例将永远得不到创建, 也会出错的.
 * </pre>
 */
public class Singleton_04 {
	
	
	//私有构造方法, 防止被实例化
	private Singleton_04() {
	
	}
	
	//获取实例
	public static Singleton_04 getInstance() {
		return SingletonFactory.instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
	
	//如果该对象被用于序列化, 可以保证对象在序列化前后一致
	
	//使用一个内部类来维护单例
	private static class SingletonFactory {
		private static Singleton_04 instance = new Singleton_04();
	}
}

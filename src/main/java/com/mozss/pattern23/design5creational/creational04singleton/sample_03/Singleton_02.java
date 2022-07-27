package com.mozss.pattern23.design5creational.creational04singleton.sample_03;

/**
 * <pre>
 * 加synchronized实现线程安全,
 * 但是: 使用synchronized关键字, 性能会下降, 因为每次调用getinstance()都会给对象上锁.
 * 事实上, 只有在第一次创建对象的时候需要加锁, 之后就不需要锁了, 所有可以改进,参考:Singleton_03.java</pre>
 */
public class Singleton_02 {
	//持有私有静态实例, 防止被引用, 赋值为null, 目的是延迟加载
	private static Singleton_02 instance = null;
	
	//私有构造方法, 防止被实例化
	private Singleton_02() {
	
	}
	
	//静态方法, 创建实例, 这里是synchronized关键字锁住对象
	public static synchronized Singleton_02 getInstance() {
		if (instance == null) {
			instance = new Singleton_02();
		}
		return instance;
	}
	
	//如果该对象用于序列化, 可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}

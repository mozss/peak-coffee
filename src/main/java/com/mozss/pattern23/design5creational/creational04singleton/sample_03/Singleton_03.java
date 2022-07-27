package com.mozss.pattern23.design5creational.creational04singleton.sample_03;

/**
 * <pre>
 * 将synchronized加在内部, 似乎解决了问题, 也就是说当调用的时候是不需要加锁的, 只有当instance为null的时候需要加锁, 性能有所提升.
 * 但是: 有指令重排的问题
 *      在Java指令中创建对象和赋值操作是分开进行的, 也就说instance = new Singleton(); 语句是分两步执行的.
 *      JVM并不能保证这两步的先后顺序, 也就是说有可能JVM会为新的Singleton实例分配空间, 然后直接赋值给instance成员,
 *      然后再去初始化这个Singleton实例.
 * 比如:
 *      A,B两个线程,
 *      >1. A,B同时进入第一个if
 *      >2. A首先进入synchronized块, 由于instance为null, 所以它执行instance = new Singleton();
 *      >3. 由于JVM内部的优化机制, JVM先画出一些分配给Singleton实例的空白内存, 并赋值给instance成员(注意此时JVM并没有开始初始化这个实例),
 *          然后A离开了synchronized块
 *      >4. B进入synchronized块, 由于instance此时不是null, 因为它马上离开synchronized块, 并把结果返回给调用该方法的程序
 *      >5. B线程的开始使用Singleton实例, 发现并没有被初始化, 于是错误发生了.
 *
 *      我们继续改进, 参考Singleton_04.java
 *      </pre>
 */
public class Singleton_03 {
	//持有私有静态实例, 防止被引用, 赋值为null, 目的是延迟加载
	private static Singleton_03 instance = null;
	
	//私有构造方法, 防止被实例化
	private Singleton_03() {
	
	}
	
	//静态方法, 创建实例, 这里是synchronized关键字锁住对象
	public static Singleton_03 getInstance() {
		
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton_03();
				}
			}
		}
		return instance;
	}
	
	//如果该对象用于序列化, 可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}

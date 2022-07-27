package com.mozss.pattern23.design5creational.creational05prototype.sample_03;

/**
 * <pre>这里涉及到深拷贝和浅拷贝的问题:
 *
 * 深拷贝: 将一个对象复制后, 基本数据类型的变量都会重新创建,而引用类型,指向的还是原对象所指向的.
 *
 * 深拷贝: 将一个对象复制后, 不论是基本数据类型还有引用类型, 都是重新创建的.
 *
 * 简单来说, 就是深复制进行了完全彻底的复制, 而浅拷贝不是.</pre>
 */
public class Prototype_01 implements Cloneable {
	
	/**
	 * <pre>关键点: super.clone()在Object类中, clone()是native的, 涉及到Java中本地方法的调用, 此处不再深究</pre>
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object clone() throws CloneNotSupportedException {
		Prototype_01 proto = (Prototype_01) super.clone();
		return proto;
	}
}

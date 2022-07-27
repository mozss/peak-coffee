package com.mozss.pattern23.design5creational.creational00factorysimple.sample_02;

/**
 * <pre>这里抽出一个抽象类的目的:
 * 这里采用泛型(Generic), 通过定义泛型对createHuman的输入参数产生两层的限制:
 * 1. 必须是Class类型
 * 2. 必须是Human的实现类</pre>
 */
public abstract class FactoryHuman {
	public abstract <T extends Human> T createHuman(Class<T> c);
}

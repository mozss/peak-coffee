package com.mozss.pattern23.design5creational.creational01factorymethod_class.sample_01;

/**
 * IWorkFactory的实现类
 */
public class FactoryHomeWorkImplStudent implements FactoryHomeWorkI {
	@Override
	public HomeWorkI getWork() {
		return new HomeWorkImplStudent();
	}
}

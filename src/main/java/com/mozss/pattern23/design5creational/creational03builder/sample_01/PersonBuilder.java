package com.mozss.pattern23.design5creational.creational03builder.sample_01;

/**
 * Person对象的构造接口
 */
public abstract class PersonBuilder {
	abstract void buildHead();
	
	abstract void buildBody();
	
	abstract void buildFoot();
	
	abstract Person buildPerson();
}

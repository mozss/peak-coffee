package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_01;

/**
 * 抽象工厂类
 */
public interface AnimalFactoryI {
	/**
	 * @return
	 */
	CatI creatCat();
	
	/**
	 * @return
	 */
	DogI creatDog();
}

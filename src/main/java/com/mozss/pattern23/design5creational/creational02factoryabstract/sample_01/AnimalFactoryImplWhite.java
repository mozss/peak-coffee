package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_01;

public class AnimalFactoryImplWhite implements AnimalFactoryI {
	/**
	 * @return
	 */
	@Override
	public CatI creatCat() {
		return new CatImplWhiteCat();
	}
	
	/**
	 * @return
	 */
	@Override
	public DogI creatDog() {
		return new DogImplWhite();
	}
}

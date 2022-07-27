package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_01;

public class AnimalFactoryImplBlack implements AnimalFactoryI {
	/**
	 * @return
	 */
	@Override
	public CatI creatCat() {
		return new CatImplBlackCat();
	}
	
	/**
	 * @return
	 */
	@Override
	public DogI creatDog() {
		return new DogImplBlack();
	}
}

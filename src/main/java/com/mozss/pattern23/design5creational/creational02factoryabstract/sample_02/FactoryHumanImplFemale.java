package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_02;

public class FactoryHumanImplFemale implements FactoryHumanI {
	//黄人女性
	@Override
	public HumanI createYellowHuman() {
		return new HumanYellowConcreteFemale();
	}
	
	//白人女性
	@Override
	public HumanI createWhiteHuman() {
		return new HumanWhiteConcreteFemale();
	}
	
	
}

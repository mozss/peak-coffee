package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_02;

public class FactoryHumanImplMale implements FactoryHumanI {
	//黄人男性
	@Override
	public HumanI createYellowHuman() {
		return new HumanYellowConcreteMale();
	}
	
	//白人男性
	@Override
	public HumanI createWhiteHuman() {
		return new HumanWhiteConcreteMale();
	}
	
}

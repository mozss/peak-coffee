package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_02;

public class ClientNvWa {
	public static void main(String[] args) {
		//生产男性
		FactoryHumanI humanFactoryMale = new FactoryHumanImplMale();
		//生产女性
		FactoryHumanI humanFactoryFemale = new FactoryHumanImplFemale();
		
		//生产线完成, 开始造人
		HumanI maleYellowHuman = humanFactoryMale.createYellowHuman();
		HumanI femaleYellowHuman = humanFactoryFemale.createYellowHuman();
		
		System.out.println("--->第一个黄色男性");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		
		System.out.println("--->第一个黄色女性");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		
	}
}

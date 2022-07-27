package com.mozss.pattern23.design7structural.structural05bridge.sample_01;

public class ClothingTrouser implements Clothing {
	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getSexType() + "穿上裤子");
	}
}

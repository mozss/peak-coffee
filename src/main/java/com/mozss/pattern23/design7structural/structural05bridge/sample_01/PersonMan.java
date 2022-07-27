package com.mozss.pattern23.design7structural.structural05bridge.sample_01;

public class PersonMan extends Person {
	public PersonMan() {
		setSexType("男人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
}

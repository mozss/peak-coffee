package com.mozss.pattern23.design7structural.structural05bridge.sample_01;

public class PersonLady extends Person {
	public PersonLady() {
		setSexType("女人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
	
}

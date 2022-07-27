package com.mozss.pattern23.design7structural.structural05bridge.sample_01;

public class Client {
	public static void main(String[] args) {
		Person man = new PersonMan();
		Person lady = new PersonLady();
		
		Clothing jacket = new ClothingJacket();
		Clothing trouser = new ClothingTrouser();
		
		jacket.personDressCloth(man);
		trouser.personDressCloth(man);
		
		jacket.personDressCloth(lady);
		trouser.personDressCloth(lady);
	}
}

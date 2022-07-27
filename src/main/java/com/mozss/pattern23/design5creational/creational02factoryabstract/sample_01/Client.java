package com.mozss.pattern23.design5creational.creational02factoryabstract.sample_01;

/**
 * 测试类
 */
public class Client {
	public static void main(String[] args) {
		//黑色系动物的创建
		AnimalFactoryI animalFactoryImplBlackAnimal = new AnimalFactoryImplBlack();
		
		CatI blackCat = animalFactoryImplBlackAnimal.creatCat();
		blackCat.eat();
		DogI blackDog = animalFactoryImplBlackAnimal.creatDog();
		blackDog.eat();
		
		System.out.println("===============");
		
		//白色系动物的创建
		AnimalFactoryI animalFactoryImplWhite = new AnimalFactoryImplWhite();
		
		CatI whiteCat = animalFactoryImplWhite.creatCat();
		whiteCat.eat();
		DogI whiteDog = animalFactoryImplWhite.creatDog();
		whiteDog.eat();
		
	}
}

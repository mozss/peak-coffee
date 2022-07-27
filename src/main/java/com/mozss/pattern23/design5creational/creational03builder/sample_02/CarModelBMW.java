package com.mozss.pattern23.design5creational.creational03builder.sample_02;

public class CarModelBMW extends CarModel {
	@Override
	protected void start() {
		System.out.println("宝马车跑起来是这个样子...");
	}
	
	@Override
	protected void stop() {
		System.out.println("宝马车是这样停车的...");
	}
	
	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭是这样的...");
	}
	
	@Override
	protected void engineBoom() {
		System.out.println("宝马车的引擎声音是这样的...");
	}
}

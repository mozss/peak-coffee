package com.mozss.pattern23.design5creational.creational03builder.sample_02;

public class CarModelBenz extends CarModel {
	@Override
	protected void start() {
		System.out.println("奔驰车跑起来是这个样子...");
	}
	
	@Override
	protected void stop() {
		System.out.println("奔驰车是这样停车的...");
	}
	
	@Override
	protected void alarm() {
		System.out.println("奔驰车的喇叭是这样的...");
	}
	
	@Override
	protected void engineBoom() {
		System.out.println("奔驰车的引擎声音是这样的...");
	}
}

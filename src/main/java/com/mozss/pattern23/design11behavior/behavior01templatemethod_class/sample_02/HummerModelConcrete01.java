package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample_02;

public class HummerModelConcrete01 extends HummerModelAbs {
	
	@Override
	public void start() {
		System.out.println("H1型号, 发动...");
	}
	
	@Override
	public void stop() {
		System.out.println("H1型号, 停车...");
	}
	
	@Override
	public void alarm() {
		System.out.println("H1型号, 鸣笛...");
	}
	
	@Override
	public void engineBoom() {
		System.out.println("H1型号, 引擎...");
		
	}
	
}

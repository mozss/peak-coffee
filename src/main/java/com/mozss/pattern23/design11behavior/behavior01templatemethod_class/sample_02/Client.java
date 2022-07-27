package com.mozss.pattern23.design11behavior.behavior01templatemethod_class.sample_02;

public class Client {
	public static void main(String[] args) {
		//xx公司要H1型号的汽车
		HummerModelAbs h1 = new HummerModelConcrete01();
		
		//H1演示
		h1.run();
	}
}

package com.mozss.pattern23.design5creational.creational00factorysimple.sample_02;

public class ClientNvWa {
	public static void main(String[] args) {
		//声明阴阳八卦炉
		FactoryHuman yinYangLu = new FactoryHumanConcrete();
		
		//第一次造人, 白人
		System.out.println("--第一批次是白人");
		Human humanWhite = yinYangLu.createHuman(HumanImplWhite.class);
		humanWhite.getColor();
		humanWhite.talk();
		
		//第二批造人, 黑人
		System.out.println("--第二批次是黑人");
		Human humanBlack = yinYangLu.createHuman(HumanImplBlack.class);
		humanBlack.getColor();
		humanBlack.talk();
		
		//第三批造人, 黄种人
		System.out.println("--第三批次是黄种人");
		Human humanYellow = yinYangLu.createHuman(HumanImplYellow.class);
		humanYellow.getColor();
		humanYellow.talk();
	}
}

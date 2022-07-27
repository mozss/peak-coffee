package com.mozss.pattern23.design5creational.creational04singleton.sample_02;

public class Emperor {
	//初始化一个皇帝
	private static final Emperor emperor = new Emperor();
	
	private Emperor() {
		//世俗和道德约束你, 目的就是不希望产生第二个皇帝
	}
	
	public static Emperor getInstance() {
		return emperor;
	}
	
	//皇帝发话了
	public static void say() {
		System.out.println("我就是皇帝某某某");
	}
	
	public static void main(String[] args) {
		//三天见到的皇帝都是同一个人吧,哈哈
		for (int day = 0; day < 3; day++) {
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
	}
}

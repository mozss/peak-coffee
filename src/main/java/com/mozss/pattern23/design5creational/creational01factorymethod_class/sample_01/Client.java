package com.mozss.pattern23.design5creational.creational01factorymethod_class.sample_01;

/**
 * 测试类
 */
public class Client {
	public static void main(String[] args) {
		// 通过接口FactoryHomeWrok创建
		FactoryHomeWorkI factoryHomeWorkStudent = new FactoryHomeWorkImplStudent();
		FactoryHomeWorkI factoryHomeWorkTeacher = new FactoryHomeWorkImplTeacher();
		
		factoryHomeWorkStudent.getWork().doHomeWork();
		factoryHomeWorkTeacher.getWork().doHomeWork();
	}
}

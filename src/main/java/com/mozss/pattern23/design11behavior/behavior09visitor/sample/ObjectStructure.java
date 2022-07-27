package com.mozss.pattern23.design11behavior.behavior09visitor.sample;

import java.util.Random;

/**
 * 结构对象
 */
public class ObjectStructure {
	//对象生成器, 这里通过一个工厂方法模式模拟
	public static ElementAbs createElement() {
		Random random = new Random();
		if (random.nextInt() > 50) {
			System.out.println("random>50, 创建ElementConcrete_01()的对象!!!");
			return new ElementConcrete_01();
		} else {
			System.out.println("random<50, 创建ElementConcrete_02()的对象^_^ ");
			return new ElementConcrete_02();
		}
	}
}

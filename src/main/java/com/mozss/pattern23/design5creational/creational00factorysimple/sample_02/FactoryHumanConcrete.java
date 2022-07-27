package com.mozss.pattern23.design5creational.creational00factorysimple.sample_02;

public class FactoryHumanConcrete extends FactoryHuman {
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		//定义一个生产的人种
		Human human = null;
		
		//这里利用反射机制
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误");
		}
		return (T) human;
	}
}

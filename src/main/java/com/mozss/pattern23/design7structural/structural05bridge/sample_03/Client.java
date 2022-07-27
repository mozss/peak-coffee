package com.mozss.pattern23.design7structural.structural05bridge.sample_03;

public class Client {
	public static void main(String[] args) {
		Bridge bridge = new BridgeConcrete();
		
		/*
		 * 调用第一个对象
		 */
		Sourceable sourceable_01 = new SourceableImpl_01();
		bridge.setSourceable(sourceable_01);
		bridge.method();
		
		/*
		 * 调用第二个对象
		 */
		Sourceable sourceable_02 = new SourceableImpl_02();
		bridge.setSourceable(sourceable_02);
		bridge.method();
	}
}

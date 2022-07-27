package com.mozss.pattern23.design7structural.structural07flyweight.sample;

public class FlyweightConcrete_01 extends Flyweight {
	protected FlyweightConcrete_01(String _Extrinsic) {
		super(_Extrinsic);
	}
	
	/**
	 * 根据外部状态进行逻辑处理
	 */
	@Override
	public void operate() {
		//业务逻辑
	}
}

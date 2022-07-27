package com.mozss.pattern23.design7structural.structural05bridge.sample_03;

public class BridgeConcrete extends Bridge {
	public void method() {
		getSourceable().method();
	}
}

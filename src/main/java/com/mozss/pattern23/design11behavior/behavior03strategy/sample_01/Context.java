package com.mozss.pattern23.design11behavior.behavior03strategy.sample_01;

public class Context {
	Strategy stra;
	
	public Context(Strategy stra) {
		this.stra = stra;
	}
	
	public void doMethod() {
		stra.method();
	}
}

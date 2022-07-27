package com.mozss.pattern23.design7structural.structural05bridge.sample_03;

public abstract class Bridge {
	private Sourceable sourceable;
	
	public void method() {
		sourceable.method();
	}
	
	public Sourceable getSourceable() {
		return sourceable;
	}
	
	public void setSourceable(Sourceable _sourceable) {
		this.sourceable = _sourceable;
	}
}

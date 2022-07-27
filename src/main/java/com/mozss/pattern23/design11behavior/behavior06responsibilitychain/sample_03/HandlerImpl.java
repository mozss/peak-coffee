package com.mozss.pattern23.design11behavior.behavior06responsibilitychain.sample_03;

public class HandlerImpl extends AbstractHandler implements Handler {
	private String name;
	
	public HandlerImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name + "->deal!");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}

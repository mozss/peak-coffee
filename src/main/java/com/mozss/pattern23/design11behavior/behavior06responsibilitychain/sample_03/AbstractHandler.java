package com.mozss.pattern23.design11behavior.behavior06responsibilitychain.sample_03;

public abstract class AbstractHandler {
	private Handler handler;
	
	public Handler getHandler() {
		return handler;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}

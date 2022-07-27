package com.mozss.pattern23.design11behavior.behavior08mediator.sample;

/**
 * 抽象同事类
 */
public abstract class Colleague {
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}

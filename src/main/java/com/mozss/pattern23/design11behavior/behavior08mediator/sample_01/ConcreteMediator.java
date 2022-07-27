package com.mozss.pattern23.design11behavior.behavior08mediator.sample_01;

public class ConcreteMediator extends Mediator {
	private ColleagueA ca;
	private ColleagueB cb;
	
	public ConcreteMediator() {
		ca = new ColleagueA();
		cb = new ColleagueB();
	}
	
	@Override
	public void notice(String content) {
		if (content.equals("boss")) {
			//老板来了,通知员工A
			ca.action();
		}
		if (content.equals("client")) {
			//客户来了,通知前台
			cb.action();
		}
	}
}

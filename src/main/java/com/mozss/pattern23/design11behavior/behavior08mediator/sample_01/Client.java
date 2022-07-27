package com.mozss.pattern23.design11behavior.behavior08mediator.sample_01;

public class Client {
	public static void main(String[] args) {
		Mediator med = new ConcreteMediator();
		//老板来了
		med.notice("boss");
		//客户来了
		med.notice("client");
	}
}

package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_01_normal;

public class SenderImplSmsSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}

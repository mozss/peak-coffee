package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_02_multi;

public class SenderImplSmsSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}

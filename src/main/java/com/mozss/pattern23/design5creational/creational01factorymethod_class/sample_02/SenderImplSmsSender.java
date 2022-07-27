package com.mozss.pattern23.design5creational.creational01factorymethod_class.sample_02;

public class SenderImplSmsSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}

package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_01_normal;

public class SendFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new SenderImplMailSender();
		} else if ("sms".equals(type)) {
			return new SenderImplSmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}

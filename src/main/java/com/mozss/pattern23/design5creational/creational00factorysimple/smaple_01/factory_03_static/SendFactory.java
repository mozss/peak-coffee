package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_03_static;

public class SendFactory {
	
	
	public static Sender produceMail() {
		return new SenderImplMailSender();
	}
	
	public static Sender produceSms() {
		return new SenderImplSmsSender();
	}
	
	
}

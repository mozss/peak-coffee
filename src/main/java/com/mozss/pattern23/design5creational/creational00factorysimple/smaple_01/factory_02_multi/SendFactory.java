package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_02_multi;

public class SendFactory {
	
	
	public Sender produceMail() {
		return new SenderImplMailSender();
	}
	
	public Sender produceSms() {
		return new SenderImplSmsSender();
	}
	
	
}

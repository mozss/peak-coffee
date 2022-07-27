package com.mozss.pattern23.design5creational.creational01factorymethod_class.sample_02;

public class ProviderImplSendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new SenderImplMailSender();
	}
}

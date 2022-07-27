package com.mozss.pattern23.design5creational.creational03builder.sample_03;

public class SenderImplSmsSender implements Sender {
	@Override
	public void Send(int i) {
		System.out.println("这是一条短信.....!" + "    编号为:sms" + (i + 1));
	}
}

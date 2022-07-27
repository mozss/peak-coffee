package com.mozss.pattern23.design5creational.creational03builder.sample_03;

public class SenderImplMailSender implements Sender {
	@Override
	public void Send(int i) {
		System.out.println("这是一封邮件.....!" + "    编号为:e-mail" + (i + 1));
	}
}

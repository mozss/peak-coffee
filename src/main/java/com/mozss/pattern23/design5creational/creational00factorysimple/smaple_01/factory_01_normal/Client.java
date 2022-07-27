package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_01_normal;

/**
 * 这是一个发送邮件和短信的例子
 * 1. 首先创建二者的共同接口Sender
 * 2. 创建实现类
 * SenderImplMailSender.java
 * SenderImplSmsSender.java
 * 3. 创建工厂类
 * SendFactory.java
 */
public class Client {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}
}

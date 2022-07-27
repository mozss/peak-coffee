package com.mozss.pattern23.design5creational.creational00factorysimple.smaple_01.factory_03_static;

/**
 * <pre>
 *  这是一个发送邮件和短信的例子
 *  1. 首先创建二者的共同接口Sender
 *  2. 创建实现类
 *          SenderImplMailSender.java
 *          SenderImplSmsSender.java
 *  3. 创建工厂类
 *          SendFactory.java </pre>
 */
public class Client {
	public static void main(String[] args) {
		// 这种方式为静态工厂, 不需要创建实例, 直接"类.方法"的方式调用: SendFactory.produceMail()
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}

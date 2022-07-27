package com.mozss.pattern23.design5creational.creational01factorymethod_class.sample_02;

/**
 * <pre>
 * 如果你想增加一个功能: 发送及时消息, 则只需要做一个实现类,
 * 实现Sender接口, 同时做一个工厂类, 实现Provider接口即可,
 * 无需去改动现有的代码</pre>
 */
public class Client {
	public static void main(String[] args) {
		Provider provider = new ProviderImplSendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}

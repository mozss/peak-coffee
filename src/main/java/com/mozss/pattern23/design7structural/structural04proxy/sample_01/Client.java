package com.mozss.pattern23.design7structural.structural04proxy.sample_01;

public class Client {
	public static void main(String[] args) {
		Object obj = new ProxyObject();
		obj.action();
	}
}

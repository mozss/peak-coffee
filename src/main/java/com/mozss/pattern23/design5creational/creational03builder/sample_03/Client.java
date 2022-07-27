package com.mozss.pattern23.design5creational.creational03builder.sample_03;

public class Client {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}

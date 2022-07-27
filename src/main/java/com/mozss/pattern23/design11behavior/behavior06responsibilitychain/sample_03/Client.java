package com.mozss.pattern23.design11behavior.behavior06responsibilitychain.sample_03;

public class Client {
	public static void main(String[] args) {
		HandlerImpl handler_01 = new HandlerImpl("h1");
		HandlerImpl handler_02 = new HandlerImpl("h2");
		HandlerImpl handler_03 = new HandlerImpl("h3");
		
		handler_01.setHandler(handler_02);
		handler_02.setHandler(handler_03);
		
		handler_01.operator();
		
	}
}

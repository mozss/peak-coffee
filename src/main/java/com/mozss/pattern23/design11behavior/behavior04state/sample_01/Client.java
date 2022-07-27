package com.mozss.pattern23.design11behavior.behavior04state.sample_01;

public class Client {
	public static void main(String[] args) {
		Context ctx1 = new Context();
		ctx1.setWeather(new Sunshine());
		System.out.println(ctx1.weatherMessage());
		
		System.out.println("==========");
		
		Context ctx2 = new Context();
		ctx2.setWeather(new Rain());
		System.out.println(ctx2.weatherMessage());
	}
}

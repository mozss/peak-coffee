package com.mozss.pattern23.design7structural.structural02facade.sample_02;

public class Client {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startUp();
		computer.shutdown();
	}
}

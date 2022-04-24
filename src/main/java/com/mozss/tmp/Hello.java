package com.mozss.tmp;

public class Hello<P1 extends String, P2 extends String> {
	public static void main(String[] args) {
		int name = 1;
		new Hello().add(100,2);
	}
	
	private void add(int a, int b){
		System.out.println(a + b);
	}
}

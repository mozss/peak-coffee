package com.mozss.pattern23.design5creational.creational00factorysimple.sample;

public class Client {
	public static void main(String[] args) {
		Creator creator = new CreatorConcrete();
		
		Product product1 = creator.createProduct(ProductImpl1.class);
		Product product2 = creator.createProduct(ProductImpl2.class);
		
		/*
		 * 继续业务处理
		 */
	}
}

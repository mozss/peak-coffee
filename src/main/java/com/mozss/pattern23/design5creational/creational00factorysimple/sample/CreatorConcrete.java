package com.mozss.pattern23.design5creational.creational00factorysimple.sample;

public class CreatorConcrete extends Creator {
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// 异常处理
		}
		return (T) product;
	}
}

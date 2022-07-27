package com.mozss.java_thread.src.sample;

public class BankDemoSynchronized {
	private int money;
	private String name;
	
	public BankDemoSynchronized(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	/**
	 * 存款方法 需要设置synchronized
	 *
	 * @param m
	 */
	public synchronized void deposit(int m) {
		money += m;
	}
	
	/**
	 * 取款方法 需要设置synchronized
	 *
	 * @param m
	 * @return
	 */
	public synchronized boolean withdraw(int m) {
		if (money > m) {
			money -= m;
			//取款成功
			return true;
		} else {
			//余额不足
			return false;
		}
	}
	
	/**
	 * 这个方法没有必要设置synchronized
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}
}

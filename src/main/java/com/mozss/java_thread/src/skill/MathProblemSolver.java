package com.mozss.java_thread.src.skill;

import java.math.BigInteger;

/**
 * @deprecated 通过计算100的阶乘+100000的阶乘学习多线程debug技能
 */
public class MathProblemSolver {
	
	
	public static void main(String[] args) {
		
		//开启两个线程来计算
		FactorialCalculatingThread thread1 = new FactorialCalculatingThread(100);
		FactorialCalculatingThread thread2 = new FactorialCalculatingThread(10000);
		
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//两个线程结果相加,并输出
		BigInteger result = thread1.getResult().add(thread2.getResult());
		System.out.println(result);
	}
	
	/**
	 * @deprecated 用于计算阶乘的线程类
	 */
	private static class FactorialCalculatingThread extends Thread {
		
		//定义结果返回值
		private BigInteger result = BigInteger.ONE;
		private long num;
		
		public FactorialCalculatingThread(long num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "开始执行阶乘的计算" + num);
			factorialCalc(num);
			System.out.println(Thread.currentThread().getName() + "执行结束");
		}
		
		/**
		 * @param num
		 * @deprecated 阶乘计算的方法
		 */
		private void factorialCalc(long num) {
			BigInteger f = new BigInteger("1");
			for (int i = 2; i < num; i++) {
				f = f.multiply(BigInteger.valueOf(i));
			}
			result = f;
		}
		
		public BigInteger getResult() {
			return result;
		}
	}
}

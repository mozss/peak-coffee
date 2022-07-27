package com.mozss.java_jvm.tools.snippet;

import java.util.Random;

/**
 * 这是例子通过vmstat命令来测试
 */
public class HoldLockMain_vmstat {
	public static Object[] lock = new Object[10];
	public static Random random = new Random();
	
	static {
		for (int i = 0; i < lock.length; i++) {
			lock[i] = new Object();
		}
	}
	
	public static class HoldLockTask implements Runnable {
		private int i;
		
		public HoldLockTask(int i) {
			this.i = i;
		}
		
		public static void main(String[] args) {
			for (int i = 0; i < lock.length * 2; i++) {
				new Thread(new HoldLockTask(i / 2)).start();
			}
		}
		
		@Override
		public void run() {
			while (true) {
				synchronized (lock[i]) {
					try {
						if (i % 2 == 0) {
							lock[i].wait(random.nextInt(10));       //等待
						} else {
							lock[i].notify();       //通知
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

package com.mozss.tmp.book.a01;

public class Chapter01 {
	
	
	/**
	 * 1. 欧几里得算法
	 * 计算两个非负整数p和q的最大公约数: 若q是0,则最大的公约数是p.
	 * 否则, 将p除以q得到余数为r, p和q的最大公约数即为q和r的最大公约数.
	 * p(18) / q(4) = 4 余 r(2),
	 * p(18)和 q(4) 的最大公约数 = q(4)和r(2)的最大公约数
	 * @param p 18
	 * @param q 4
	 * @return
	 */
	public static int gcd(int p, int q){
		if(q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
	
	/**
	 * 2. 二分查找
	 * @param key
	 * @param a
	 * @return
	 */
	public static int rank(int key, int[] a){
		return 0;
	}
	
}

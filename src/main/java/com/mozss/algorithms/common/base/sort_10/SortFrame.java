package com.mozss.algorithms.common.base.sort_10;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class SortFrame {
	public static void main(String[] args) {
		//读取字符串, 并将它们排序输出
		String[] a = In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
	
	public static void sort(Comparable[] a){
	}
	
	public static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[] a, int i, int j){
		Comparable t = a[i];
		a[i] = a [j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a){
		//在单行中打印数组
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a){
		//测试数组元素是否有序
		for (int i = 0; i < a.length; i++) {
			if (less(a[i], a[i-1])){
				return false;
			}
		}
		return true;
	}
}





















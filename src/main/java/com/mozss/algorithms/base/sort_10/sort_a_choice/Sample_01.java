package com.mozss.algorithms.base.sort_10.sort_a_choice;


/**
 * 选择排序
 */
public class Sample_01 {
	public static int[] sort(int[] array) {
		
		//总共要经过N-1轮比较
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			//每轮需要比较的次数
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;//记录目前能找到的最小值元素的下标
				}
			}
			//将找到的最小值和i位置所在的值进行交换
			if (i != min) {
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] tobeSorted = {12, 2, 34, 8, 6, 11, 3, 18};
		tobeSorted = sort(tobeSorted);
		for (int i = 0; i < tobeSorted.length; i++) {
			System.out.print(tobeSorted[i]);
		}
	}
}

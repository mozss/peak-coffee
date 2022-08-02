package com.mozss.algorithms.base.sort_10.sort_a_choice.simple;

public class Sort {
	public static void sort(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = 0; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] tobeSorted = {12, 2, 34, 8, 6, 11, 3, 18};
		sort(tobeSorted);
		for (int i : tobeSorted) {
			System.out.print(i + " ");
		}
	}
}
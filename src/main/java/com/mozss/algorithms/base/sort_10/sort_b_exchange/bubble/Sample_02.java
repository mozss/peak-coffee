package com.mozss.algorithms.base.sort_10.sort_b_exchange.bubble;

public class Sample_02 {

	private static void sort(int[] nums) {
		boolean hasChange = true;
		for (int i = 0, n = nums.length; i < n - 1 && hasChange; ++i) {
			hasChange = false;
			for (int j = 0; j < n - i - 1; ++j) {
				if (nums[j] > nums[j + 1]) {
					swap(nums, j, j + 1);
					hasChange = true;
				}
			}
		}
	}
	
	private static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	
	public static void main(String[] args) {
		int[] tobeSorted = {12, 2, 34, 8, 6, 11, 3, 18};
		sort(tobeSorted);
		for (int i : tobeSorted) {
			System.out.print(i + " ");
		}
	}
}
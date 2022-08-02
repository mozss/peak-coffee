package com.mozss.algorithms_store.offer_v2.offer030.no_006;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        for (;;) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                return new int[]{i, j};
            }
        }
    }
}

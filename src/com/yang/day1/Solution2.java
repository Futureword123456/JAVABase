package com.yang.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class Solution2 {
    public void rotate(int[] nums, int k) {
        int temp = 0;
        k = k % nums.length;
        if ((nums.length % 2 == 0) && (nums.length / 2 == k)) {
            for (int i = 0; i < k; i++) {
                temp = nums[i];
                nums[i] = nums[nums.length - k + i];
                nums[nums.length - k + 1] = temp;
            }
        } else if (nums.length / 2 >= k) {
            temp = nums[i];
            nums[i] = nums[nums.length - k + i];
            nums[nums.length - k + i] = temp;
        }
        for (int j = 0; j < k; j++) {
            for (int i = nums.length - 1; i > k; i--) {
                temp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
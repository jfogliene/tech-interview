package com.fogliene.google;

/**
 * Let’s say you are given an integer array nums and an integer k.
 * Return true if nums has a subarray where its length is at least two,
 * and the sum of the elements in the subarray is a multiple of k.
 */
public class Main20230103 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] { 1, 2, 4, 10, 6 };
        int k = 4;

        boolean foundElementSubArray = foundElementSubArray(nums, k);
        System.out.println("Array " + nums + " has subarray with sum multiple of " + k + ": " + foundElementSubArray);
    }

    public static boolean foundElementSubArray(Integer[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];

                if (isMultipleOf(sum, k)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isMultipleOf(int value, int divisor) {
        return value % divisor == 0;
    }
}

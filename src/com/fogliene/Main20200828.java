package com.fogliene;

import java.util.ArrayList;
import java.util.List;

/*
Hi, here's your problem today. This problem was recently asked by Facebook:

        You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.

        Example:
        Given [4, 7, 1 , -3, 2] and k = 5,
        return true since 4 + 1 = 5.

        def two_sum(list, k):
        # Fill this in.

        print two_sum([4,7,1,-3,2], 5)
        # True

        Try to do it in a single pass of the list.
*/
public class Main20200828 {
    public static void main(String[] args) {
        System.out.println(twoSum(new Integer[] {4, 7, 1, -3, 2}, 5));
    }

    public static boolean twoSum(Integer[] arr, int target) {
        List<Integer> list = new ArrayList<>();

        for (Integer i : arr) {
            if (list.contains(i)) {
                return true;
            } else {
                list.add(target - i);
            }
        }

        return false;
    }
}

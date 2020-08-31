package com.fogliene;

import java.util.*;

/*
Hi, here's your problem today. This problem was recently asked by Google:

        Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.

        Example 1:
        Input: [3, 3, 2, 1, 3, 2, 1]
        Output: [1, 1, 2, 2, 3, 3, 3]
        def sortNums(nums):
        # Fill this in.

        print sortNums([3, 3, 2, 1, 3, 2, 1])
        # [1, 1, 2, 2, 3, 3, 3]

        Challenge: Try sorting the list using constant space.
*/
public class Main20200827 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 3, 3, 2, 1, 3, 2, 1 };
        sortNums(arr);

        for (Integer i : arr) {
            System.out.print(i + ", ");
        }
    }
    
    private static void sortNums(Integer[] arr) {
        int[] count = new int[3];
        count[0] = 0;
        count[1] = 0;
        count[2] = 0;

        for (Integer i : arr) {
            count[i - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < count[0]) {
                arr[i] = 1;
            } else if (i < count[0] + count[1]) {
                arr[i] = 2;
            } else {
                arr[i] = 3;
            }
        }
    }
}

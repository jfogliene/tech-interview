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
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (Integer i : arr) {
            if (! map.containsKey(i)) {
                map.put(i, new ArrayList<>(i));
            } else {
                map.get(i).add(i);
            }
        }
    }
}

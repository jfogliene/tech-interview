package com.fogliene;

/*
Hi, here's your problem today. This problem was recently asked by AirBNB:

        Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.

        Example:
        Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
        Output: [6,8]

        Input: A = [100, 150, 150, 153], target = 150
        Output: [1,2]

        Input: A = [1,2,3,4,5,6,10], target = 9
        Output: [-1, -1]
        Here is a function signature example:

class Solution:
        def getRange(self, arr, target):
        # Fill this in.

        # Test program
        arr = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8]
        x = 2
        pr
        int(Solution().getRange(arr, x))
        # [1, 4]
*/
public class Main20200825 {
    public static void main(String[] args) {
        System.out.println(getRange(new int[] { 1, 3, 3, 5, 7, 8, 9, 9, 9, 15 }, 9));
        System.out.println(getRange(new int[] { 100, 150, 150, 153 }, 150));
        System.out.println(getRange(new int[] { 1, 2, 3, 4, 5, 6, 10 }, 9));
        System.out.println(getRange(new int[] { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 }, 2));
    }

    private static String getRange(int[] arr, Integer target) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (start == -1) {
                    start = i;
                } else {
                    end = i;
                }
            } else {
                if (end != -1) {
                    break;
                }
            }
        }

        return "[" + start + ", " + end + "}";
    }
}

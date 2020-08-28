package com.fogliene;

/*
Hi, here's your problem today. This problem was recently asked by Twitter:

A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the longest palindromic substring in s.

Example:
Input: "banana"
Output: "anana"

Input: "million"
Output: "illi"
 */
public class Main20200823 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("banana"));
        System.out.println(longestPalindrome("million"));
    }

    private static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String current = s.substring(i, j);
                StringBuilder sb = new StringBuilder(current);

                if (current.equals(sb.reverse().toString())) {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                }
            }
        }

        return longest;
    }
}

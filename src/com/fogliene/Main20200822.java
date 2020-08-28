package com.fogliene;

import java.util.HashMap;
import java.util.Map;

/*
        Hi, here's your problem today. This problem was recently asked by Microsoft:

        Given a string, find the length of the longest substring without repeating characters.

        Here is an example solution in Python language. (Any language is OK to use in an interview, though we'd recommend Python as a generalist language utilized by companies like Google, Facebook, Netflix, Dropbox, Pinterest, Uber, etc.,)

        class Solution:
        def lengthOfLongestSubstring(self, s):
        # Fill this in.

        print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')
        # 10

        Can you find a solution in linear time?*/
public class Main20200822 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringContainsIndexOf("abrkaabcdefghijjxxx"));
        System.out.println(lengthOfLongestSubstringContainsIndexOf("abrkacdefghijjxxx"));
        System.out.println(lengthOfLongestSubstringContainsIndexOf("abhguiakdbeygalok"));
        System.out.println(lengthOfLongestSubstringContainsIndexOf("hjuaaaiolkase"));


        System.out.println(lengthOfLongestSubstring("abrkaabcdefghijjxxx"));
        System.out.println(lengthOfLongestSubstring("abrkacdefghijjxxx"));
        System.out.println(lengthOfLongestSubstring("abhguiakdbeygalok"));
        System.out.println(lengthOfLongestSubstring("hjuaaaiolkase"));
    }

    private static String lengthOfLongestSubstringContainsIndexOf(String string) {
        String longest = "";
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            String c = String.valueOf(string.charAt(i));

            if (! temp.toString().contains(c)) {
                temp.append(c);

                if (longest.length() < temp.toString().length()) {
                    longest = temp.toString();
                }
            } else {
                temp = new StringBuffer(temp.substring(temp.toString().indexOf(c) + 1));
                temp.append(c);
            }
        }

        return longest;
    }

    private static String lengthOfLongestSubstring(String string) {
        String longest = "";
        StringBuffer temp = new StringBuffer();

        Map<String, Integer> charMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            String c = String.valueOf(string.charAt(i));

            if (! charMap.containsKey(c)) {
                charMap.put(c, i);

                temp.append(c);

                if (longest.length() < temp.toString().length()) {
                    longest = temp.toString();
                }
            } else {
                temp.append(c);
                temp = new StringBuffer(string.substring(charMap.get(c) + 1, i + 1));
                charMap.replace(c, i);
            }
        }

        return longest;
    }
}

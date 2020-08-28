package com.fogliene;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Hi, here's your problem today. This problem was recently asked by Uber:

        Imagine you are building a compiler. Before running any code, the compiler must check that the parentheses in the program are balanced. Every opening bracket must have a corresponding closing bracket. We can approximate this using strings.

        Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
        - Open brackets are closed by the same type of brackets.
        - Open brackets are closed in the correct order.
        - Note that an empty string is also considered valid.

        Example:
        Input: "((()))"
        Output: True

        Input: "[()]{}"
        Output: True

        Input: "({[)]"
        Output: False
class Solution:
        def isValid(self, s):
        # Fill this in.

        # Test Program
        s = "()(){(())"
        # should return False
        print(Solution().isValid(s))

        s = ""
        # should return True
        print(Solution().isValid(s))

        s = "([{}])()"
        # should return True
        print(Solution().isValid(s))
*/
public class Main20200824 {
    private static final Map<String, String> bracketMap = new HashMap<>();

    static {
        bracketMap.put("{", "}");
        bracketMap.put("[", "]");
        bracketMap.put("(", ")");
    }

    public static void main(String[] args) {
        System.out.println(isValid("()(){(())"));
        System.out.println(isValid(""));
        System.out.println(isValid("([{}])()"));
    }

    public static Boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));

            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                if (stack.empty()) {
                    return false;
                } else {
                    if (! c.equals(matchOpeningBracket(stack.pop()))) {
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }

    private static Boolean isOpeningBracket(String c) {
        return bracketMap.containsKey(c);
    }

    private static Boolean isClosingBracket(String c) {
        return bracketMap.containsValue(c);
    }

    private static String matchOpeningBracket(String c) {
        return bracketMap.get(c);
    }
}

package com.fogliene;

/*
Hi, here's your problem today. This problem was recently asked by Microsoft:

        You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

        Example:
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
*/
public class Main20200821 {

    public static void main(String[] args) {
	    ListNode l1 = new ListNode(2);
	    l1.nextNode = new ListNode(4);
	    l1.nextNode.nextNode = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.nextNode = new ListNode(6);
        l2.nextNode.nextNode = new ListNode(4);

        addTwoNumbers(l1, l2);
    }

    private static void addTwoNumbers(ListNode l1, ListNode l2) {
        Integer number1 = getNumberFromList(l1);
        Integer number2 = getNumberFromList(l2);

        Integer sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);

        System.out.println(getListFromNumber(sum));
    }

    private static ListNode getListFromNumber(Integer number) {
        String value = number.toString();
        ListNode result = null;
        ListNode currentNode = null;

        for (int i = 0; i < value.length(); i++) {
            if (result == null) {
                currentNode = result = new ListNode(new Integer(value.substring(i, i + 1)));
            } else {
                currentNode.nextNode = new ListNode(new Integer(value.substring(i, i + 1)));
                currentNode = currentNode.nextNode;
            }
        }

        return result;
    }

    private static Integer getNumberFromList(ListNode listNode) {
        if (listNode == null || listNode.val == null) {
            return null;
        }

        String value = listNode.val.toString();

        do {
            listNode = listNode.nextNode;
            value += listNode.val.toString();
        } while (listNode.nextNode != null);

        return new Integer(value);
    }
}
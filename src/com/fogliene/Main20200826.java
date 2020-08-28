package com.fogliene;

import java.util.List;

/*
Hi, here's your problem today. This problem was recently asked by Google:

        Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?

        Example:
        Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
        Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
class ListNode(object):
        def __init__(self, x):
        self.val = x
        self.next = None

        # Function to print the list
        def printList(self):
        node = self
        output = ''
        while node != None:
        output += str(node.val)
        output += " "
        node = node.next
        print(output)

        # Iterative Solution
        def reverseIteratively(self, head):<
 /span>
         # Implement this.

         # Recursive Solution
         def reverseRecursively(self, head):
         # Implement this.

         # Test Program
         # Initialize the test list:
         testHead = ListNode(4)
         node1 = ListNode(3)
         testHead.next = node1
         node2 = ListNode(2)
         node1.next = node2
         node3 = ListNode(1)
         node2.next = node3
         testTail = ListNode(0)
         node3.next = testTail

         print("Initial list: ")
         testHead.printList()
         # 4 3 2 1 0
         testHead.reverseIteratively(testHead)
         #testHead.reverseRecursively(testHead)
         print("List after reversal: ")
         testTail.printList()
         # 0 1 2 3 4
*/
public class Main20200826 {
    public static void main(String[] args) {
        ListNode testHead = new ListNode(4);
        ListNode node1 = new ListNode(3);
        testHead.nextNode = node1;
        ListNode node2 = new ListNode(2);
        node1.nextNode = node2;
        ListNode node3 = new ListNode(1);
        node2.nextNode = node3;
        ListNode testTail = new ListNode(0);
        node3.nextNode = testTail;

        System.out.println("Initial list: ");
        testHead.printList();

        testHead.reverseIteratively(testHead);

        System.out.println("List after reversal: ");
        testTail.printList();
    }
}
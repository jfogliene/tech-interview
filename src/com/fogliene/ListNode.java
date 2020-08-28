package com.fogliene;

public class ListNode {
    public Integer val;
    public ListNode nextNode;

    public ListNode() {

    }

    public ListNode(Integer val) {
        this.val = val;
    }

    public String toString() {
        if (nextNode != null) {
            return val + " -> " + nextNode;
        } else {
            return val.toString();
        }
    }

    public void printList() {
        String output = "";

        ListNode node = this;

        while (node != null) {
            output += node.val + " ";
            node = node.nextNode;
        }

        System.out.println(output);
    }

    public void reverseIteratively(ListNode node) {
        ListNode previous = null;
        ListNode current = node;
        ListNode next = null;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }

        node = previous;
    }
}
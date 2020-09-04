package com.fogliene;

/*
Hi, here's your problem today. This problem was recently asked by Twitter:

Implement a class for a stack that supports all the regular functions (push, pop) and an additional function of max() which returns the maximum element in the stack (return None if the stack is empty). Each method should run in constant time.

class MaxStack:
  def __init__(self):
    # Fill this in.

  def push(self, val):
    # Fill this in.

  def pop(self):
    # Fill this in.


  def max(self):
    # Fill this in.

s = MaxStack()
s.push(1)
s.push(2)
s.push(3)
s.push(2)
print s.max()
# 3
s.pop()
s.pop()
print s.max()
# 2
 */
public class Main20200902 {
    public static void main(String[] args) {
        System.out.println("Scenario 1: ");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);

        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());

        System.out.println("********************");
        System.out.println("Scenario 1: ");
        stack = new Stack();
        stack.push(3);
        stack.push(6);
        stack.push(2);
        stack.push(6);
        stack.push(7);
        stack.push(5);
        stack.push(8);

        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("max: " + stack.max());
    }
}

class Stack {
    private StackNode root;
    private int max = Integer.MIN_VALUE;

    public void push(int value) {
        if (value > max) {
            max = value;
        }

        StackNode newNode = new StackNode(value, max);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }

    public int pop() {
        if (root == null) {
            throw new RuntimeException("Stack is empty");
        }

        int result = root.value;

        root = root.next;

        if (root == null) {
            max = Integer.MIN_VALUE;
        } else if (result == max) {
            max = root.max;
        }

        return result;
    }

    public int max() {
        return max;
    }

    public String toString() {
        StackNode current = root;
        StringBuffer result = new StringBuffer();

        while (current != null) {
            result.append(current.value + " ");

            current = current.next;
        }

        return result.toString();
    }

    class StackNode {
        int value;
        int max;
        StackNode next;

        StackNode(int value, int max) {
            this.value = value;
            this.max = max;
        }
    }
}

package com.fogliene;

/*
Hi, here's your problem today. This problem was recently asked by Apple:

Given an integer k and a binary search tree, find the floor (less than or equal to) of k, and the ceiling (larger than or equal to) of k. If either does not exist, then print them as None.

Here is the definition of a node for the tree.

class Node:
  def __init__(self, value):
    self.left = None
    self.right = None
    self.value = value

def findCeilingFloor(root_node, k, floor=None, ceil=None):
  # Fill this in.

root = Node(8)
root.left = Node(4)
root.right = Node(12)

root.left.left = Node(2)
root.left.right = Node(6)

root.right.left = Node(10)
root.right.right = Node(14)

print findCeilingFloor(root, 5)
# (4, 6)
 */
public class Main20200831 {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);

        root.left.left = new Node(2);
        root.left.right = new Node(6);

        root.right.left = new Node(10);
        root.right.right = new Node(14);

        Integer[] result = findCeilingFloor(root, 5);
        System.out.println(result[0] + ", " + result[1]);
    }

    public static Integer[] findCeilingFloor(Node root, Integer value) {
        Integer floor = findFloor(root, value);
        Integer ceiling = findCeiling(root, value);

        return new Integer[] { floor, ceiling };
    }

    public static Integer findFloor(Node root, Integer value) {
        if (root == null) {
            return null;
        }

        if (root.value == value) {
            return value;
        }

        if (root.value < value) {
            Integer k = findFloor(root.right, value);

            if (k == null) {
                return root.value;
            } else {
                return k;
            }
        } else {
            return findFloor(root.left, value);
        }
    }


    public static Integer findCeiling(Node root, Integer value) {
        if (root == null) {
            return null;
        }

        if (root.value == value) {
            return value;
        }

        if (root.value > value) {
            Integer k = findCeiling(root.left, value);

            if (k == null) {
                return root.value;
            } else {
                return k;
            }
        } else {
            return findCeiling(root.right, value);
        }
    }
}

class Node {
    public Node left;
    public Node right;
    public Integer value;

    public Node(Integer value) {
        this.value = value;
    }
}

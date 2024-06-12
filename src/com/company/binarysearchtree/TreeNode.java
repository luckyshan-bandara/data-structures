package com.company.binarysearchtree;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int inputData) {
        // we do not add duplicates, so avoid duplicates
        if (data == inputData) {
            return;
        }

        if (inputData < data) {
            if (left == null) {
                left = new TreeNode(inputData);
            } else {
                left.insert(inputData);
            }
        } else {
            if (right == null) {
                right = new TreeNode(inputData);
            } else {
                right.insert(inputData);
            }
        }
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (right != null) {
            right.traverseInOrder();
        }
    }
}

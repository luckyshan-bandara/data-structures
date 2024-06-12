package com.company.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();

        bst.insert(66);
        bst.insert(12);
        bst.insert(100);
        bst.insert(25);
        bst.insert(35);
        bst.insert(15);
        bst.insert(5);
        bst.insert(10);

        bst.traverseInOrder();
    }
}

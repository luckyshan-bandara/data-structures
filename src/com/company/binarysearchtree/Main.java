package com.company.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();
        // Note: Here we try to inout same numbers but in different sequence to see how BST is build each time.
//        int[] inputArray = {66, 12, 100, 25, 35, 15, 5, 10}; // bst-1.png
//        int[] inputArray = {5, 10, 15, 66, 12, 100, 25, 35}; // bst-2.png
        int[] inputArray = {25, 12, 66, 10, 15, 35, 100, 5}; // bst-3.png

        for (int i=0; i< inputArray.length; i++) {
            bst.insert(inputArray[i]);
        }

        bst.traverseInOrder();
    }
}

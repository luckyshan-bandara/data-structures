package com.company.linkedlist;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFirst(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void printList() {
        EmployeeNode current = head;

        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
    }
}

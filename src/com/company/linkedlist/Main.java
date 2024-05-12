package com.company.linkedlist;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Kamal", "Balangoda");
        Employee e2 = new Employee("Bimal", "Ratnapura");
        Employee e3 = new Employee("Sumal", "Colombo");

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFirst(e1);
        employeeLinkedList.addToFirst(e2);
        employeeLinkedList.addToFirst(e3);

        employeeLinkedList.printList();
    }
}

package com.mit.list;

public class ThreeNodeLinkLis {
	public static void main(String[] args) {

        Employee node1 = new Employee();
        node1.id = 101;
        node1.name = "Pratik";

        Employee node2 = new Employee();
        node2.id = 102;
        node2.name = "Rahul";

        Employee node3 = new Employee();
        node3.id = 103;
        node3.name = "Amit";

        node1.next = node2;
        node2.next = node3;

        System.out.println(node1.id + " " + node1.name);
        System.out.println(node1.next.id + " " + node1.next.name);
        System.out.println(node1.next.next.id + " " + node1.next.next.name);
    }
}

class Employee {
    int id;
    String name;
    Employee next;
}

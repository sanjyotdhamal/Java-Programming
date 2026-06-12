package com.mit.list;

import com.mit.list.EmployeeNode;

public class EmployeeLinkedList {
	public static void main(String[] args) {

        EmployeeNode emp1 = new EmployeeNode(101, "Pratik", 50000);
        EmployeeNode emp2 = new EmployeeNode(102, "Sanjyot", 60000);
        EmployeeNode emp3 = new EmployeeNode(103, "Viraj", 70000);

        // Linking nodes
        emp1.next = emp2;
        emp2.next = emp3;

        // Display employee details
        EmployeeNode temp = emp1;

        while (temp != null) {
            System.out.println("Employee ID : " + temp.id);
            System.out.println("Employee Name : " + temp.name);
            System.out.println("Employee Salary : " + temp.salary);
            System.out.println("----------------------");

            temp = temp.next;
        }
    }
}

class EmployeeNode {

    int id;
    String name;
    double salary;
    EmployeeNode next;

    EmployeeNode(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}




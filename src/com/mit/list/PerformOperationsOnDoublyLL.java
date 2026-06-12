//WAP to perform below operations to employe doubly linked list
//1. onboard the new employee 
//2. display the details
//3. off board the employee from the list by empID 
//4. update the details of the employee by empID 
//5. Delete the EMP from the end 
//6. Display the employee details in reverse order of inseration package com.mit.list;

package com.mit.list;

public class PerformOperationsOnDoublyLL {

    public static void main(String[] args) {

        EmployeeDLL list = new EmployeeDLL();

        // Onboard Employees
        list.onboard(101, "Pratik");
        list.onboard(102, "Rahul");
        list.onboard(103, "Amit");

        System.out.println("Employee Details:");
        list.display();

        // Update Employee
        list.update(102, "Rohan");

        // Offboard Employee
        list.offboard(101);

        // Delete Employee from End
        list.deleteFromEnd();

        System.out.println("\nAfter Operations:");
        list.display();

        System.out.println("\nEmployees in Reverse Order:");
        list.displayReverse();
    }
}

class EmployeeNode2 {

    int id;
    String name;
    EmployeeNode2 prev;
    EmployeeNode2 next;

    public EmployeeNode2(int id, String name) {
        this.id = id;
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

class EmployeeDLL {

    EmployeeNode2 head = null;
    EmployeeNode2 tail = null;

    // 1. Onboard Employee
    public void onboard(int id, String name) {

        EmployeeNode2 emp = new EmployeeNode2(id, name);

        if (head == null) {
            head = emp;
            tail = emp;
        } else {
            tail.next = emp;
            emp.prev = tail;
            tail = emp;
        }
    }

    // 2. Display Employees
    public void display() {

        EmployeeNode2 temp = head;

        while (temp != null) {
            System.out.println("ID: " + temp.id + " Name: " + temp.name);
            temp = temp.next;
        }
    }

    // 3. Update Employee by ID
    public void update(int id, String newName) {

        EmployeeNode2 temp = head;

        while (temp != null) {

            if (temp.id == id) {
                temp.name = newName;
                System.out.println("Employee Updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Employee Not Found");
    }

    // 4. Offboard Employee by ID
    public void offboard(int id) {

        EmployeeNode2 temp = head;

        while (temp != null) {

            if (temp.id == id) {

                if (temp == head) {

                    head = head.next;

                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }

                } else if (temp == tail) {

                    tail = tail.prev;

                    if (tail != null) {
                        tail.next = null;
                    }

                } else {

                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Employee Removed");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Employee Not Found");
    }

    // 5. Delete Employee From End
    public void deleteFromEnd() {

        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // 6. Display Reverse Order
    public void displayReverse() {

        EmployeeNode2 temp = tail;

        while (temp != null) {
            System.out.println("ID: " + temp.id + " Name: " + temp.name);
            temp = temp.prev;
        }
    }
}

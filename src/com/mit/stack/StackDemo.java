//WAP to stack using array baseline data structure maxsize=5


package com.mit.stack;

public class StackDemo {

    
    static int stack[] = new int[5];
    static int top = -1;

    // Push Operation
    public static void push(int data) {

        if (top == 4) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = data;
    }

    // Pop Operation
    public static void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Deleted Element: " + stack[top]);
        top--;
    }

    // Display Operation
    public static void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        display();

        pop();

        System.out.println("\nAfter Pop:");
        display();
    }
}
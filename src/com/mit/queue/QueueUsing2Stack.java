//WAP to create Queue using 2 stack 

package com.mit.queue;

import java.util.Stack;

public class QueueUsing2Stack {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        // Enqueue
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        // Dequeue
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        System.out.println("Deleted Element: " + stack2.pop());

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        System.out.println("Remaining Queue:");

        while (!stack1.isEmpty()) {
            System.out.println(stack1.remove(0));
        }
    }
}



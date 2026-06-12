package com.mit.stack;

public class StackDemo2 {

    int[] arr;
    int top;

    StackDemo2(int maxSize) {
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int data) {
        top++;
        arr[top] = data;
    }

    public void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        StackDemo2 s = new StackDemo2(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
    }
}
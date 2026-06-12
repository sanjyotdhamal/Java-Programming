package com.mit.MethodDemo;

import java.util.Scanner;

public class ReturnMethodDemo {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = scr.nextInt();

        ReturnMethodDemo obj = new ReturnMethodDemo();

        int newVar = obj.incrementNumBy2(num);

        System.out.println(newVar);
    }

    public int incrementNumBy2(int num) {
        return num + 2;
    }
}
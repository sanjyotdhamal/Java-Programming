package com.mit.first;

public class SWAPThirdVar {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before :: a = " + a + " b = " + b);

        int temp;
        temp = b;
        b = a;
        a = temp;

        System.out.println("After :: a = " + a + " b = " + b);
    }
}
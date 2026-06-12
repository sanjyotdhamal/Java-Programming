package com.mit.array;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {20, -40, 50, 80, 60, 1, 2, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
	

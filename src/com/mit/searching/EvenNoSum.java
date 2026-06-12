//WAP to find the sum of all even no upto 50 (use recursion)

package com.mit.searching;

public class EvenNoSum {
	    public static void main(String[] args) {

	        int sum = findEvenSum(50);

	        System.out.println("Sum of even numbers up to 50 = " + sum);
	    }

	    public static int findEvenSum(int n) {

	        if (n == 0) {
	            return 0;
	        }

	        if (n % 2 == 0) {
	            return n + findEvenSum(n - 2);
	        }

	        return findEvenSum(n - 1);
	    }
	}


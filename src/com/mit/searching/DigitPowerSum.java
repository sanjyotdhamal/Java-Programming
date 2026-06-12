//wap to find the sum of each value based on each criteria make the power of each letter 
//according to length 
//ex; arr=[101,20,40}
//1raise to 3 +0 raise to 3+1 raised to 1 like 20(2 raise to 2 and 0 raise to 2) 
//and make final sum of it 


package com.mit.searching;

public class DigitPowerSum {

	    public static void main(String[] args) {

	        int arr[] = {101, 20, 40};

	        for (int num : arr) {

	            String str = String.valueOf(num);
	            int len = str.length();

	            int sum = 0;

	            for (int i = 0; i < len; i++) {

	                int digit = str.charAt(i) - '0';

	                sum += (int)Math.pow(digit, len);
	            }

	            System.out.println(num + " -> " + sum);
	        }
	    }
	}



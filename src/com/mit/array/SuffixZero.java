package com.mit.array;

public class SuffixZero {

	public static void main(String[] args) {
		
		int[] arr = {1,90, 4, 5, 60, 7, 50, 50, 60, 40};
	
	System.out.println("Number ending with 0:");
	
	for (int i= 0; i < arr.length; i++ ) {
		if (arr[i]% 10==0) {
			System.out.println(arr[i]);
		}
	}

	}
}

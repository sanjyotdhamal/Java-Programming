package com.mit.array;

public class NewKeyword {

	public static void main(String[] args) {
		int[] arr=new int[5];
		//traversing the array 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		arr[1]=20;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

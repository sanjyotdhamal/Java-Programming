package com.mit.searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= {5,8,1,10};
		int  target =5;
		boolean targetNotExist=true;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("target position is"+(i+1));
				targetNotExist=false;
				break;
			}
		}
		if(targetNotExist)
			System.out.println("Target Not Found");

	}

}

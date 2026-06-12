//WAP to find the first no whose next no is greater than the no and previous no is smaller then no 
//arr={10,4,2,0,8,100,50}

package com.mit.searching;

public class Number {

	public static void main(String[] args) {
		
		int[]arr= {10,4,2,1,8,100,50};
		
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i]>arr[i-1]&& arr[i]<arr[i+1]) {
				System.out.println(arr[i-1]);
				break;
			}
			
		}
			
	}

}

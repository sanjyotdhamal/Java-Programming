package com.mit.searching;

public class backttackingSimpleString2Length {
	static void backtrack(char[] arr, int index) {
		if(index == arr.length) {
			System.out.println(new String(arr));
			return;
		}
		arr[index]='0';
		backtrack(arr, index +1);
		
		arr[index]='1';
		backtrack(arr, index +1);
	}
	public static void main(String[]args) {
		int n =2;
		backtrack(new char[n],0);
		
	}

}

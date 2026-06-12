package com.mit.array;

public class TwoPointerArrayConcept {
	public static void main (String[] args) {
		String Str="xyx";
		boolean isPal= isPalindrome(Str);
		System.out.println("Provided string is palindrome ::"+isPal);
	}
    
public static boolean isPalindrome(String CheckStr) {
	int left=0,right= CheckStr.length()-1;
		while(left<right) {
			if(CheckStr.charAt(left)!=CheckStr.charAt(right))
				return false;
			left++;
			right--;
			
		}
		return true;
		
	}
}

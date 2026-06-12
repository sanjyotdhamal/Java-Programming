//WAP to find either below substring is exist or not 
//substring = "my"
//String="india is my country"

package com.mit.searching;

public class Substring {
	public static void main(String[] args) {
		String str = "India is my country";
		String substr = "the";
		
		if (str.contains(substr)) {
			System.out.println("Substring exist");
		}else {
			System.out.println("Substring not exist");
		}
	}

}

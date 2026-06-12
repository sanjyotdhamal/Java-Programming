package com.mit.array;

import java.util.Scanner;

public class UserInputValue {
	
	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Provide the first value");
		int testValue=scr.nextInt();
		System.out.println("value :: "+testValue);
		
		
		int argValue=Integer.parseInt(args[0]);
		System.out.println("argValue"+argValue);
		
		
	}

}



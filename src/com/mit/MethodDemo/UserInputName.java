package com.mit.MethodDemo;

import java.util.Scanner;

public class UserInputName {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=scr.next();
		
		UserInputName obj=new UserInputName();
		obj.namePrint(name);
	}
public void namePrint(String testName) {
	System.out.println("sanjyot");
}
}

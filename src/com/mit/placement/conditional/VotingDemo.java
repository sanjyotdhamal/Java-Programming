package com.mit.placement.conditional;

public class VotingDemo {

	public static void main(String[] args) {
		
		int age =18;
		String citizenship="Indian";
		
		if(age>=18 && citizenship=="Indian") {
			System.out.println("You are eligible for voting");
		}else {
			System.out.println("You are not eligible for voting");
		}

	}

}

package com.mit.placement.conditional;

public class EligibleforVote {

	public static void main(String[] args) {
		System.out.println("Eligible age for voting is >=18 ");
		int age = 18;
		
		if (age >= 18) {
			System.out.println("you are eligible for voting ");
		}else { 
			System.out.println("you are not eligible for voting");
		}

	}

}
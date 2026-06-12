package com.mit.placement.conditional;

public class IncomeTax {

	
	public static void main(String[] args) {
			
		int income = 1000000;
			
		if (income <=250000) {
				System.out.println("Nil");
	   	 }else if (income < 500000 ) {
	   	    	System.out.println("5%");
	   	 }else if (income< 1000000) {
	   	    	System.out.println("20%");	 
	   	 }else {
	   	    	System.out.println("30%");
			
			
	   	}
			
			
			
		}

	}
	
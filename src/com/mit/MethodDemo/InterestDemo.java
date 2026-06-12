//WAP to print simple interest and compund interest of the user provided
//amount in fix deposite (use method )

package com.mit.MethodDemo;

import java.util.Scanner;

public class InterestDemo{
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal Amount: ");
	        double p = sc.nextDouble();

	        System.out.print("Enter Rate of Interest: ");
	        double r = sc.nextDouble();

	        System.out.print("Enter Time (Years): ");
	        double t = sc.nextDouble();

	        InterestDemo obj = new InterestDemo();

	        double si = obj.simpleInterest(p, r, t);
	        double ci = obj.compoundInterest(p, r, t);

	        System.out.println("Simple Interest = " + si);
	        System.out.println("Compound Interest = " + ci);

	        sc.close();
	    }

	    public double simpleInterest(double p, double r, double t) {
	        return (p * r * t) / 100;
	    }

	    public double compoundInterest(double p, double r, double t) {
	        return p * Math.pow((1 + r / 100), t) - p;
	    }
	}

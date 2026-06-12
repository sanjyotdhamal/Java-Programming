package com.mit.loops;

public class PrintPattern {
	
	  public static void main(String[] args) {

	      for (int i = 1; i <= 3; i++) {
          for (int j = i; j <= i + 2; j++) {
	         System.out.print(j + "  ");
	         }
	         System.out.println( );
	      }
	 }
}
package com.mit.loops;

public class pattern {
		
		public static void main(String[] args) {
			for (int i=1;i<=3;i++) {
				for(int j=1;j<=3;j++)
				{	
				if(i==j)
					System.out.print(i+"\t");
				else; 
					System.out.print((Math.pow(j,2)-1)+"\t");
				}	
			}
			System.out.println();
		}

	}
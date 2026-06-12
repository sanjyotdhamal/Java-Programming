package com.mit.first;

public class UnaryOperatorDemo {
	
	public static void main(String[] args) {
		
		int i=10;
		int b=20;
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i+++(++i)+i++);
		System.out.println("final i value"+i);

		System.out.println(i--);
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i--+(++i)+i--);
		System.out.println("final i value"+i);
	}

}

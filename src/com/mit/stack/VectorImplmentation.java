package com.mit.stack;

import java.util.Stack;

public class VectorImplmentation {

	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.size());
		
		//pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//peek

		System.out.println(stack.peek());
	}
}


//WAp to merge 2 stack 
//stack1:- {10,20,30}
//stack2:- {-10,-20,-30}
//OP stack3:-{10, 20, 30, -10, -20, -30}


package com.mit.stack;

import java.util.Stack;

public class MergeStack {
	 public static void main(String[] args) {

	        Stack<Integer> stack1 = new Stack<>();
	        Stack<Integer> stack2 = new Stack<>();
	        Stack<Integer> mergedStack = new Stack<>();

	        stack1.push(10);
	        stack1.push(20);
	        stack1.push(30);

	        stack2.push(-10);
	        stack2.push(-20);
	        stack2.push(-30);

	        // Add elements of stack1
	        mergedStack.addAll(stack1);

	        // Add elements of stack2
	        mergedStack.addAll(stack2);

	        System.out.println("Merged Stack: " + mergedStack);
	    }
	}



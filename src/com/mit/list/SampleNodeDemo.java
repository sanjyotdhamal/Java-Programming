package com.mit.list;

import com.mit.list.SampleNode;

public class SampleNodeDemo {
	 public static void main(String[] args) {

	        SampleNode node1 = new SampleNode(10);

	        System.out.println(node1.data);
	        System.out.println(node1.next);

	        SampleNode node2 = new SampleNode(20);
	        node1.next = node2;

	        System.out.println("Second node details");
	        System.out.println("First node data = " + node1.data);
	        System.out.println("Second node data = " + node1.next.data);
	        System.out.println("Second node ref = " + node1.next.next);
	    }
	}

	class SampleNode {

	    int data;
	    SampleNode next;

	    SampleNode(int data) {
	        this.data = data;
	    }
	}



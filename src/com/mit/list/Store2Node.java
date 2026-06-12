//wap to store any formate of data in linked list with 2 node

package com.mit.list;
public class Store2Node {
	    String name;
	    int age;
	    Store2Node next;

	    Store2Node(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.next = null;
	    }
	}

	public class Store2Node {

	    public static void main(String[] args) {

	        Node node1 = new Node("Sanjyot", 20);
	        Node node2 = new Node("Pratik", 21);

	        node1.next = node2;

	        Node temp = node1;

	        while (temp != null) {
	            System.out.println("Name: " + temp.name);
	            System.out.println("Age: " + temp.age);
	            temp = temp.next;
	        }
	    }
	}

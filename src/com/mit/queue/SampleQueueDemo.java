package com.mit.queue;

import java.util.*;

public class SampleQueueDemo {
	public static void main(String[] args) {
		Queue queueObj=new LinkedList();
		
		queueObj.offer(10);
		queueObj.offer(20);
		queueObj.offer(5);
		queueObj.offer(8);
		queueObj.offer(9);
		
		System.out.println(queueObj);
		
		System.out.println("1removal of ele::" +queueObj.poll());
		System.out.println("2removal of ele::" +queueObj.poll());
		System.out.println("3removal of ele::" +queueObj.poll());

		//traversing of queue
		
		while(!queueObj.isEmpty()) {
			System.out.println(queueObj.poll());
		}
	}
}

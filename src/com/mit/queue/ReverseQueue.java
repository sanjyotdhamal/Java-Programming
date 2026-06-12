//WAP to reverse the queue 
//queue:-[10,40,60,50,70,80, 
//op:- {80,70,50,60,40,10}

package com.mit.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(10);
        queue.offer(40);
        queue.offer(60);
        queue.offer(50);
        queue.offer(70);
        queue.offer(80);
        
        System.out.println("original Queue:-" + queue);

        Stack<Integer> stack = new Stack<Integer>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        System.out.println("reversed Queue:-"+ queue);
    }
}

package com.mit.graph;

import java.util.*;

public class DirectedGraph {
	public static void main(String[] args) {
		int V=3;
		
		ArrayList<Integer>[] graph = new ArrayList[V];
		
		for(int i = 0; i< V; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(1); 
		graph[0].add(2);
		graph[0].add(3);
		graph[0].add(4);
		
		
		for(int i = 0; i <V; i++) {
			System.out.print(i + "-> " + graph[i]);
			
		}

	}
}

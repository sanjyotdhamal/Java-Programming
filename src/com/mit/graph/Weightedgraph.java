package com.mit.graph;

import java.util.ArrayList;

public class Weightedgraph {
	
	static class Edge{
		int dest;
		int weight;
		
		Edge(int dest, int weight){
			this.dest = dest;
			this.weight = weight;
			
		}
	}

	public static void main(String[] args) {
		
		int v = 3;
		
		ArrayList<Edge>[]graph = new ArrayList[v];
		 
		for(int i = 0; i < v; i++) {
			graph [i] = new ArrayList<>();
	}
		
		graph[0].add(new Edge(1,5));
		graph[0].add(new Edge(2,2));
		
		graph[1].add(new Edge(2,6));
		graph[1].add(new Edge(2,3));
		
		
		for(int i = 0; i < v; i++) {
			
			System.out.print(i + "-> ");
			
			for(Edge e : graph[i]) {
				System.out.print("("+ e.dest+ "," +e.weight +")");
			}
			System.out.println();
		}
				
	}

}
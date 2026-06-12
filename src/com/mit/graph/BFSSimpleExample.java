package com.mit.graph;

import java.util.*;

class BFSSimpleExample {
	
	static void bfs(ArrayList<Integer> [] graph, int start) {
		
		boolean [] visited = new boolean[graph.length];
		
		Queue<Integer> queue= new LinkedList<> ();
		
		visited[start]= true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			
			int node = queue.poll();
			System.out.print(node + "");
			
			for(int neighbor : graph[node]) {
				
				if(!visited[neighbor]) {
					visited[neighbor]= true;
					queue.add(neighbor);
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int v = 4;
		
		ArrayList<Integer>[] graph = new ArrayList[v];
		
		for (int i =0; i < v; i++) {
			graph[i] = new ArrayList<> ();
			
		}
		
		graph[0].add(1);
		graph[1].add(0);
		
		graph[0].add(2);
		graph[2].add(0);
		
		graph[2].add(3);
		graph[3].add(2);
		
		bfs(graph, 0 );
		

	}

}

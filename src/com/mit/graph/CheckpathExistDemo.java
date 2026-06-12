package com.mit.graph;

import java.util.*;

public class CheckpathExistDemo {
	
    static boolean dfs(ArrayList<Integer>[] graph,
            int src,
            int dest,
            boolean[] visited) {

if (src == dest)
 return true;

visited[src] = true;

for (int neighbor : graph[src]) {

 if (!visited[neighbor]) {

     if (dfs(graph, neighbor, dest, visited))
         return true;
 }
}

return false;
}

public static void main(String[] args) {

int v = 4;

ArrayList<Integer>[] graph = new ArrayList[v];

for (int i = 0; i < v; i++)
 graph[i] = new ArrayList<>();

graph[0].add(1);
graph[1].add(0);

graph[0].add(2);
graph[2].add(0);

graph[2].add(3);
graph[3].add(2);

System.out.println(
     dfs(graph, 0, 2, new boolean[v])
);
}
}



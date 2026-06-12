package com.mit.graph;

import java.util.ArrayList;

public class DFSDemo {

    static void dfs(ArrayList<Integer>[] graph,
                    int node,
                    boolean[] visited) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbour : graph[node]) {

            if (!visited[neighbour]) {
                dfs(graph, neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {

        int v = 4;

        ArrayList<Integer>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[1].add(0);

        graph[0].add(2);
        graph[2].add(0);

        graph[2].add(3);
        graph[3].add(1);

        boolean[] visited = new boolean[v];

        System.out.println("DFS Traversal:");

        dfs(graph, 0, visited);
    }
}
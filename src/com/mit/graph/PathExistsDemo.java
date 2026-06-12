package com.mit.graph;

import java.util.ArrayList;

public class PathExistsDemo {

    static boolean hasPath(ArrayList<Integer>[] graph,
                           int src,
                           int dest,
                           boolean[] visited) {

        if (src == dest)
            return true;

        visited[src] = true;

        for (int neighbour : graph[src]) {

            if (!visited[neighbour]) {

                if (hasPath(graph, neighbour, dest, visited))
                    return true;
            }
        }

        return false;
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

        graph[1].add(3);
        graph[3].add(1);

        boolean[] visited = new boolean[v];

        int src = 0;
        int dest = 3;

        if (hasPath(graph, src, dest, visited))
            System.out.println("Path Exists");
        else
            System.out.println("Path Does Not Exist");
    }
}
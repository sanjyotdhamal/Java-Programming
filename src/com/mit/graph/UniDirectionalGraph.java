package com.mit.graph;

import java.util.ArrayList;

public class UniDirectionalGraph {

    public static void main(String[] args) {

        int v = 3;

        ArrayList<Integer>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        graph[0].add(1);
        graph[1].add(0);

        graph[0].add(2);
        graph[2].add(0);

        // Display graph
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : graph[i]) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
}

package com.mit.graph;

import java.util.ArrayList;

public class UnidirectionalWeightedDemo {

    static class Edge {

        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int v = 3;

        ArrayList<Edge>[] graph = new ArrayList[v];

        // Initialize graph
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        graph[0].add(new Edge(1, 5));
        graph[1].add(new Edge(0, 5));

        graph[0].add(new Edge(2, 2));
        graph[2].add(new Edge(0, 2));

        // Display graph
        for (int i = 0; i < v; i++) {

            System.out.print(i + " -> ");

            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + "," + e.weight + ") ");
            }

            System.out.println();
        }
    }
}

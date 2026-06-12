package com.mit.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendCircleGraph {
	static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {

        graph.putIfAbsent(u, new ArrayList<>());

        graph.get(u).add(v);
    }

    public static void main(String[] args) {

        addEdge("A", "B");
        addEdge("A", "C");
        addEdge("B", "D");
        addEdge("D", "E");

        System.out.println(graph);
    }
}


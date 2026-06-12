package com.mit.tree;

import java.util.LinkedList;
import java.util.Queue;

class BFSNode {

    int data;
    BFSNode left, right;

    BFSNode(int data) {
        this.data = data;
    }
}

public class BFSDemo {

    static void bfs(BFSNode root) {

        if (root == null)
            return;

        Queue<BFSNode> q = new LinkedList<BFSNode>();

        q.offer(root);

        while (!q.isEmpty()) {

            BFSNode temp = q.poll();

            System.out.print(temp.data + " ");

            if (temp.left != null)
                q.offer(temp.left);

            if (temp.right != null)
                q.offer(temp.right);
        }
    }

    public static void main(String[] args) {

        BFSNode root = new BFSNode(50);

        root.left = new BFSNode(30);
        root.right = new BFSNode(70);

        root.left.left = new BFSNode(20);
        root.left.right = new BFSNode(40);

        root.right.left = new BFSNode(60);
        root.right.right = new BFSNode(80);

        System.out.println("BFS Traversal:");

        bfs(root);
    }
}
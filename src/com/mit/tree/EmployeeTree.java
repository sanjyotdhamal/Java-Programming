package com.mit.tree;

public class EmployeeTree {

    public static void main(String[] args) {

        EmployeeNode root = new EmployeeNode("Manager");

        root.left = new EmployeeNode("Developer");
        root.right = new EmployeeNode("Tester");

        root.left.left = new EmployeeNode("Jr Dev");
        root.left.right = new EmployeeNode("Sr Dev");

        root.right.left = new EmployeeNode("Jr Tester");
        root.right.right = new EmployeeNode("Sr Tester");

        System.out.println("Preorder Traversal:");
        preOrder(root);

        System.out.println("\n\nInorder Traversal:");
        inOrder(root);

        System.out.println("\n\nPostorder Traversal:");
        postOrder(root);
    }

    // Root Left Right
    public static void preOrder(EmployeeNode node) {

        if (node == null)
            return;

        System.out.print(node.data + " ");

        preOrder(node.left);
        preOrder(node.right);
    }

    // Left Root Right
    public static void inOrder(EmployeeNode node) {

        if (node == null)
            return;

        inOrder(node.left);

        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    // Left Right Root
    public static void postOrder(EmployeeNode node) {

        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + " ");
    }
}

class EmployeeNode {
 
    String data;
    EmployeeNode left;
    EmployeeNode right;

    public EmployeeNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
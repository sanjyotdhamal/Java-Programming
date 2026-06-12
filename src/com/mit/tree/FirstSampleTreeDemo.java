//WAP (Write a Java Program) to create the following Binary Tree
//and perform Preorder, Inorder, and Postorder Traversals using recursion


package com.mit.tree;

public class FirstSampleTreeDemo {
	
	public static void main(String[] args) {

        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("Preorder Traversal:");
        preOrder(root);
        
        System.out.println("\n\nPostorder Traversal:");
        postOrder(root);

        System.out.println("\n\nInorder Traversal:");
        inOrder(root);

    }

    public static void preOrder(TreeNode node) {

        if (node == null)
            return;

        System.out.print(node.data + " ");

        preOrder(node.left);
        preOrder(node.right);
    }
public static void postOrder(TreeNode node) {

        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + " ");
    }
    public static void inOrder(TreeNode node) {

        if (node == null)
            return;

        inOrder(node.left);

        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    
}

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


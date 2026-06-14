package com.mit.list;

public class SinglyLinkedList {
	LinkedNode1 head;

    public static void main(String[] args) {

        SinglyLinkedListDemo linkedList = new SinglyLinkedListDemo();

        linkedList.insertAtBegining(10);
        linkedList.insertAtBegining(80);

        linkedList.traverseSinglyList();
    }

    public void insertAtBegining(int data) {

        LinkedNode1 node = new LinkedNode1(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void traverseSinglyList() {

        LinkedNode1 temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class LinkedNode1 {

    int data;
    LinkedNode1 next;

    LinkedNode1(int data) {
        this.data = data;
        this.next = null;
    }
}


package com.waiqin365.firstdemo.linkedlistdemo;

public class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public void addNode(Node node) {
        if (this.next == null) {
            this.next = node;
        } else {
            this.next.addNode(node);
        }
    }

    public void printNode() {
        if (this.data != "") {
            System.out.println(this.data);
            if (next != null) {
                next.printNode();
            }
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

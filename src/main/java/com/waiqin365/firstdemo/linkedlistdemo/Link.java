package com.waiqin365.firstdemo.linkedlistdemo;

public class Link {
    private Node root;

    public void add(String data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root=newNode;
        }else {
            root.addNode(newNode);
        }
    }

    public void printLink() {
        if (this.root == null) {
            return;
        } else {
            this.root.printNode();
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}

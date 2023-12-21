package org.example;

class Node {
    private String cowId;
    private String nickName;
    private Node next;

    public Node(String cowId, String nickName) {
        this.cowId = cowId;
        this.nickName = nickName;
        this.next = null;
    }

    public String getCowId() {
        return cowId;
    }

    public String getNickName() {
        return nickName;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

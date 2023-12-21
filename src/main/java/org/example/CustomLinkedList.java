package org.example;

class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void addNode(String cowId, String nickName) {
        Node newNode = new Node(cowId, nickName);
        newNode.setNext(head);
        head = newNode;
    }

    public Node findNode(String cowId) {
        Node current = head;
        while (current != null) {
            if (current.getCowId().equals(cowId)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void removeNode(String cowId) {
        Node current = head;
        Node prev = null;

        while (current != null && !current.getCowId().equals(cowId)) {
            prev = current;
            current = current.getNext();
        }

        if (current != null) {
            if (prev != null) {
                prev.setNext(current.getNext());
            } else {
                head = current.getNext();
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println("Cow{" +
                    "cowId='" + current.getCowId() + '\'' +
                    ", nickName='" + current.getNickName() + '\'' +
                    '}');
            current = current.getNext();
        }
    }
}

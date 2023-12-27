package org.example.util;

import org.example.dto.Cow;

public class CowsStorage {
    private Node first;
    private Node last;

    public boolean add(Cow cow) {
        Node newNode = new Node(null, cow, null);

        if (last == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        return true;
    }

    public Cow find(String cowId) {
        Node node = findNode(cowId);
        return node == null ? null : node.cow;
    }

    public boolean remove(String cowId) {
        Node node = findNode(cowId);

        if (node == null) {
            return false;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            first = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            last = node.prev;
        }
        return true;
    }

    private Node findNode(String cowId) {
        Node current = first;

        while (current != null) {
            if (current.cow.equalsById(cowId)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Farm data:\n");

        Node current = first;
        while (current != null) {
            sb.append(current.cow); sb.append(" has children: [");

            Node child = current.cow.getChildren().first;
            while (child != null) {
                sb.append(child.cow);
                child = child.next;

                if (child != null) {
                    sb.append(", ");
                }
            }
            sb.append("]"); sb.append("\n");
            current = current.next;
        }
        System.out.println(sb);
    }

    private static class Node {
        Cow cow;
        Node next;
        Node prev;

        public Node(Node prev, Cow cow, Node next) {
            this.prev = prev;
            this.cow = cow;
            this.next = next;
        }
    }
}

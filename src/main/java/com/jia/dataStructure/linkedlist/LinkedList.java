package com.jia.dataStructure.linkedlist;

import lombok.Getter;

/**
 * @author Jarris
 */
public class LinkedList<E> {

    private Node dummyHead;
    @Getter
    private int  size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        /*
        Node node = new Node(e);
        node.next = head;
        head = node;
        */

        add(0, e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
/*
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
*/

        prev.next = new Node(e, prev.next);

        size++;
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }

        Node currentNode = dummyHead.next;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }

        Node currentNode = dummyHead.next;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.e = e;
    }

    public boolean contains(E e) {
        Node current = dummyHead;
        while (current != null) {
            if (current.e.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node current = dummyHead.next;
        while (current != null) {
            sb.append(current + "->");
            current = current.next;
        }
        sb.append("NULL");
        return sb.toString();
    }

    private class Node {
        public E    e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}

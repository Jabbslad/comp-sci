package com.jabbslad;

public class SinglyLinkedList<T> {

    private SinglyLinkedNode<T> head;

    @SafeVarargs
    public static <T> SinglyLinkedList<T> of(T... items) {
        SinglyLinkedList<T> result = new SinglyLinkedList<>();
        SinglyLinkedNode<T> curr = null;
        for (T item : items) {
            SinglyLinkedNode<T> sll  = new SinglyLinkedNode<>(item);
            if (curr == null) {
                curr = sll;
                if (result.head == null) {
                    result.head = curr;
                }
            } else {
                curr.next = sll;
                curr = curr.next;
            }
        }
        return result;
    }

    public void remove(T item) {
        SinglyLinkedNode<T> curr = head;

        if (curr.val == item) {
            head = curr.next;
            return;
        }

        while (curr != null) {
            if (curr.next != null && curr.next.val == item) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    public SinglyLinkedNode<T> head() {
        return this.head;
    }

    public void add(T item) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<>(item);
        if (head == null) {
            head = newNode;
            return;
        }

        SinglyLinkedNode<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public long size() {
        int size = 0;
        SinglyLinkedNode<T> curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}

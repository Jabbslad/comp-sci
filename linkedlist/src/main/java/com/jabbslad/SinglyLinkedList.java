package com.jabbslad;

public class SinglyLinkedList<T> {
    public static <T> SinglyLinkedNode<T> of(T... items) {
        SinglyLinkedNode<T> head = null;
        SinglyLinkedNode<T> curr = null;
        for (T item : items) {
            SinglyLinkedNode<T> sll  = new SinglyLinkedNode<>(item);
            if (curr == null) {
                curr = sll;
                if (head == null) {
                    head = curr;
                }
            } else {
                curr.next = sll;
                curr = curr.next;
            }
        }
        return head;
    }
}

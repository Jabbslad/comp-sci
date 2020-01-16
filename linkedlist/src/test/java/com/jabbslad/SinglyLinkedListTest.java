package com.jabbslad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SinglyLinkedListTest {

    @Test
    public void ofEmpty() {
        SinglyLinkedList emptyList = SinglyLinkedList.of();
        assertNotNull(emptyList);
        assertEquals(0, emptyList.size());
    }

    @Test
    public void size() {
        assertEquals(5, SinglyLinkedList.of(1, 2, 3, 4, 5).size());
        assertEquals(0, SinglyLinkedList.of().size());
    }

    @Test
    public void remove() {
        SinglyLinkedList list = SinglyLinkedList.of(1, 2, 3);
        list.remove(2);
        assertEquals(2, list.size());
    }
}
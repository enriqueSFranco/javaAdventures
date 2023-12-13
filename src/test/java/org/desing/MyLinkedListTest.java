package org.desing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MyLinkedListTest {

    private MyLinkedList myLinkedList;

    @BeforeEach
    @DisplayName("Setup instance and add initial items")
    void setUp() {
        myLinkedList = new MyLinkedList();
        // add items
        myLinkedList.addAtHead(10);
        myLinkedList.addAtHead(9);
        myLinkedList.addAtHead(8);
    }

    @Test
    @DisplayName("should get the index of a list element")
    void get() {
        Assertions.assertEquals(8, myLinkedList.get(0));
    }

    @Test
    @DisplayName("should return -1 if the index does not exist")
    void getIndexNotFound() {
        Assertions.assertEquals(-1, myLinkedList.get(11));
    }

    @Test
    void addAtHead() {
        int newHead = 7;
        myLinkedList.addAtHead(newHead);
        Assertions.assertEquals(newHead, myLinkedList.get(0));
    }

    @Test
    void addAtTail() {
        int newTail = 6;
        myLinkedList.addAtTail(newTail);
        Assertions.assertEquals(newTail, myLinkedList.get(0));
    }

    @Test
    void addAtIndex() {
        int index = 3, newValue = 100;
        myLinkedList.addAtIndex(index, newValue);

        Assertions.assertEquals(100, myLinkedList.get(3));
    }

    @Test
    void deleteAtIndex() {
    }

    @Test
    void size() {
        Assertions.assertEquals(3,  myLinkedList.size());
    }

    @Test
    void print() {
    }

    @Test
    void getTail() {
    }
}
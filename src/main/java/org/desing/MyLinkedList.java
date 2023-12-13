package org.desing;

public class MyLinkedList {

    private class LinkedListNode {
        private int val;
        private LinkedListNode next;

        public  LinkedListNode(int val) {
            this.setVal(val);
            this.setNext(null);
        }

        public void setVal(int val) { this.val = val; }

        public  int getVal() { return this.val; }

        public  void setNext(LinkedListNode next) { this.next = next; }

        public  LinkedListNode getNext() { return this.next; }

    }

    private LinkedListNode head;
    private LinkedListNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size()) return -1;

        LinkedListNode current = this.head;

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return current.getVal();
            }
            current = current.getNext();
        }
        throw new IllegalStateException();
    }

    public void addAtHead(int val) {
        LinkedListNode newNode = new LinkedListNode(val);

        if (this.head == null) {
            this.head = this.tail = newNode;
            return;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void addAtTail(int val) {
        LinkedListNode newNode = new LinkedListNode(val);

        if (head == null) {
            this.head = this.tail = newNode;
            return;
        } else {
            this.tail.setNext(newNode); // Conecta el nuevo nodo al último nodo actual
            this.tail = newNode; // Actualiza el puntero al último nodo
            return;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size()) return;

        if (index == 0) {
            this.addAtHead(val);
            return;
        }

        LinkedListNode current = this.head;
        LinkedListNode newNode = new LinkedListNode(val);

        for (int i = 0; i < index - 1; i++) current = current.getNext();

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > this.size()) return;

        if (index == 0) {
            if (this.head != null) {
                this.head = this.head.getNext();
                if (this.head == null)
                    this.tail = null;
            }
        } else {
            LinkedListNode current = this.head;
            for (int i = 0; i < index - 1; i++) current = current.getNext();

            if (current.getNext() != null) {
                LinkedListNode nextNode = current.getNext();
                current.setNext(nextNode.getNext());

                if (current.getNext() == null) {
                    this.tail = current;
                }
            }
        }
    }

    public int size() {
        LinkedListNode current = this.head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.getNext();
        }
        return  count;
    }

    public void print() {
        LinkedListNode current = this.head;

        while (current != null) {
            System.out.print(current.getVal());
            if (current.getNext() != null) {
                System.out.print("->");
            }
            current = current.getNext();
        }
    }

    public int getTail() { return this.tail != null ? this.tail.getVal() : -1; }
}

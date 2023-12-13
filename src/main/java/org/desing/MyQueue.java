package org.desing;

import java.util.Stack;

public final class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> stackAux;

    public MyQueue() {
        stack = new Stack<>();
        stackAux = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        this.moveElements();
        return this.stackAux.pop();
    }

    public int peek() {
        this.moveElements();
        return this.stackAux.peek();
    }

    public boolean empty() {
        return this.stack.empty() && this.stackAux.empty();
    }

    private void moveElements() {
        if (this.stackAux.empty()) {
            while (!this.stack.empty()) {
                int currentItem = this.stack.pop();
                this.stackAux.push(currentItem);
            }
        }
    }
}

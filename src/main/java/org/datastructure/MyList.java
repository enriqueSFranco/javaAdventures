package org.datastructure;

public class MyList {
    private class ListNode {
        protected int val;
        protected ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyList() {}

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.next.val == curr.val)
                curr.next = curr.next.next;
            curr = curr.next;
        }
        return head;
    }
}

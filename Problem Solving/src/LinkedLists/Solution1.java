package LinkedLists;

/**
 * @author Vamsi Krishna Govada on 8/13/2020.
 * @project Raudra
 */

// Implementation of reverse a linked list

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution1 {

    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    public ListNode reverse(ListNode tail, ListNode head) {
        if (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            return reverse(tail, temp);
        }
        return tail;
    }
}

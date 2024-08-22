package org.vitargo;

public class Solution876 {

    /*
     * 876. Middle of the Linked List (Easy)
     * Given the head of a singly linked list, return the middle node of the linked list.
     * If there are two middle nodes, return the second middle node.
     *
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3
     *
     * Example 2:
     * Input: head = [1,2,3,4,5,6]
     * Output: [4,5,6]
     * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
     *
     * Constraints:
     * The number of nodes in the list is in the range [1, 100].
     * 1 <= Node.val <= 100
     */

    public ListNode middleNode(ListNode head) {
        int num = getNext(head);
        int half = 0;
        if (num % 2 == 0) {
            half = num / 2 + 1;
        } else {
            half = (num + 1) / 2;
        }
        int count = 1;
        ListNode middle = head;
        while (count != half){
            ListNode next = middle.next;
            count ++;
            middle = next;
        }
        return middle;
    }

    private int getNext(ListNode head){
        ListNode next = head.next;
        if(next != null){
            int num = getNext(next);
            num++;
            return num;
        } else {
            return 1;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next.val +
                    '}';
        }
    }
}

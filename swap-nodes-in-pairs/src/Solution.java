/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null, curr = head, next = curr.next;

        while (curr != null && next != null) {
            if (head == curr) head = next;

            curr.next = next.next;
            next.next = curr;
            if (prev != null) prev.next = next;

            prev = curr;
            curr = curr.next;
            next = curr == null ? null : curr.next;
        }
        return head;
    }
}
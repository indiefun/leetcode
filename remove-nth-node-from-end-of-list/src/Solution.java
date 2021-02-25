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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = null;
        int s = 0;
        while (p != null) {
            if (++s > n) q = q == null ? head : q.next;
            p = p.next;
        }
        if (q == null) return head.next;
        q.next = q.next.next;
        return head;
    }
}
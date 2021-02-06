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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        ListNode root = new ListNode(Integer.MIN_VALUE);
        ListNode prev, curr, next;
        for (int i = lists.length; --i > -1; ) {
            next = lists[i];
            if (root.next == null) {
                root.next = next;
            } else {
                curr = root;
                prev = null;
                while (next != null) {
                    while (curr != null) {
                        if (curr.val > next.val) break;
                        prev = curr;
                        curr = curr.next;
                    }
                    prev.next = next;
                    next = next.next;
                    prev.next.next = curr;
                    prev = prev.next;
                }
            }
        }
        return root.next;
    }
}

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
    public ListNode addTwoNumbers(ListNode left, ListNode right) {
        short step = 0;
        short value = 0;
        ListNode sums = null;
        ListNode curr = null;
        ListNode next = null;
        while (left != null || right != null) {
            value = (short) ((left == null ? 0 : left.val) + (right == null ? 0 : right.val) + step);
            step = (short) (value / 10);
            next = new ListNode(value % 10);
            if (curr != null) curr.next = next;
            curr = next;
            if (sums == null) sums = curr;
            if (left != null) left = left.next;
            if (right != null) right = right.next;
        }
        if (step > 0) {
            next = new ListNode(step);
            curr.next = next;
        }
        return sums;
    }
}
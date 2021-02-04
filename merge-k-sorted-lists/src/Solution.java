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
        ListNode root = null;
        ListNode curr = null;
        ListNode next = null;
        int min_index, min_value;

        while (true) {
            min_index = lists.length;
            min_value = Integer.MAX_VALUE;
            for (int i = lists.length; --i >= 0; ) {
                if (lists[i] != null && lists[i].val < min_value) {
                    min_index = i;
                    min_value = lists[i].val;
                }
            }
            if (min_index == lists.length) break;

            lists[min_index] = lists[min_index].next;
            next = new ListNode(min_value);

            if (curr != null) curr.next = next;
            curr = next;
            if (root == null) root = curr;
        }
        return root;
    }
}

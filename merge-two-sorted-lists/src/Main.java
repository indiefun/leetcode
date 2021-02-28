public class Main {

    public static void main(String[] args) {
        inspect(list(1, 2, 4), list(1, 3, 4), list(1, 1, 2, 3, 4, 4));
        inspect(list(1, 2, 4, 6), list(1, 3, 3), list(1, 1, 2, 3, 3, 4, 6));
        inspect(list(), list(), list());
        inspect(list(), list(0), list(0));
        inspect(list(1), list(), list(1));
    }

    private static ListNode list(int... nums) {
        ListNode root = null;
        for (int i = nums.length; --i >= 0; ) {
            ListNode node = new ListNode(nums[i]);
            node.next = root;
            root = node;
        }
        return root;
    }

    private static boolean equals(ListNode l, ListNode r) {
        while (l != null) {
            if (r == null || l.val != r.val) return false;
            l = l.next;
            r = r.next;
        }
        return true;
    }

    private static void inspect(ListNode input1, ListNode input2, ListNode expect) {
        ListNode output = new Solution().mergeTwoLists(input1, input2);
        if (equals(output, expect)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

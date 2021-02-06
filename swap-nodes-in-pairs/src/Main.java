public class Main {

    public static void main(String[] args) {
        inspect(list(1, 2, 3, 4), list(2, 1, 4, 3));
        inspect(list(1), list(1));
        inspect(list(), list());
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

    private static void inspect(ListNode input, ListNode expect) {
        ListNode output = new Solution().swapPairs(input);
        if (equals(output, expect)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

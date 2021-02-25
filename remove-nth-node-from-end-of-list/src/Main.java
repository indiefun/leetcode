public class Main {

    public static void main(String[] args) {
        inspect(list(1, 2, 3, 4, 5), 2, list(1, 2, 3, 5));
        inspect(list(1), 1, list());
        inspect(list(1, 2), 1, list(1));
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

    private static void inspect(ListNode input1, int input2, ListNode expect) {
        ListNode output = new Solution().removeNthFromEnd(input1, input2);
        if (equals(output, expect)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

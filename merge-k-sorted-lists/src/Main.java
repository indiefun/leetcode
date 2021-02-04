public class Main {

    public static void main(String[] args) {
        inspect(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, new int[]{1, 4, 5}, new int[]{1, 3, 4}, new int[]{2, 6});
        inspect(new int[]{}, new int[]{});
        inspect(new int[]{});
    }

    private static ListNode list(int[] nums) {
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

    private static void inspect(int[] expect, int[]... inputs) {
        ListNode[] list = new ListNode[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            list[i] = list(inputs[i]);
        }
        ListNode output = new Solution().mergeKLists(list);
        if (equals(output, list(expect))) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

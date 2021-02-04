public class Main {

    public static void main(String[] args) {
        inspect(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8});
        inspect(new int[]{9, 9, 9}, new int[]{1, 1, 1}, new int[]{0, 1, 1, 1});
        inspect(new int[]{9,9,9,9,9,9,9}, new int[]{9,9,9,9}, new int[]{8,9,9,9,0,0,0,1});
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

    private static void inspect(int[] nums1, int[] nums2, int[] nums3) {
        ListNode list1 = list(nums1);
        ListNode list2 = list(nums2);
        ListNode list3 = list(nums3);
        ListNode list4 = new Solution().addTwoNumbers(list1, list2);
        if (equals(list3, list4)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

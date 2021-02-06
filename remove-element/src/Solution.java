class Solution {
    public int removeElement(int[] nums, int val) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            if (nums[head] == val) {
                nums[head] = nums[tail];
                --tail;
            } else {
                ++head;
            }
        }
        return head;
    }
}
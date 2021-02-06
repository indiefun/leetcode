class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2) return length;
        int curr = 0;
        int next = 1;
        while (next < length) {
            if (nums[curr] == nums[next]) {
                ++next;
            } else {
                ++curr;
                nums[curr] = nums[next];
            }
        }
        return curr + 1;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx = 0, mid = (nums1.length + nums2.length) / 2;
        int curr = 0, last = 0;

        int i1 = 0, i2 = 0;
        int l1 = nums1.length, l2 = nums2.length;
        while (idx <= mid) {
            last = curr;
            if (i1 < l1 && i2 < l2) {
                curr = nums1[i1] < nums2[i2] ? nums1[i1++] : nums2[i2++];
            } else if (i1 < l1) {
                curr = nums1[i1++];
            } else if (i2 < l2) {
                curr = nums2[i2++];
            }
            ++idx;
        }

        return mid == 0 || (nums1.length + nums2.length) % 2 == 1 ? curr : (curr + last) / 2.0;
    }
}
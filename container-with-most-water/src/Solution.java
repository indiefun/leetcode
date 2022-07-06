class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int s = 0;
        while (i < j) {
            s = Math.max(s, Math.min(height[i], height[j]) * (j - i));
            if (height[i] >= height[j]) --j;
            else ++i;
        }
        return s;
    }
}
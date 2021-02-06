class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int fence = 0, length = needle.length();
        for (int i = 0, l = haystack.length(); i < l; ++i) {
            if (haystack.charAt(i) == needle.charAt(fence)) {
                if (++fence == length) return i - length + 1;
            } else {
                fence = 0;
            }
        }
        return -1;
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null) return 0;
        int length = needle.length();
        if (length == 0) return 0;
        if (haystack.length() < length) return -1;
        boolean found;
        for (int i = 0, l = haystack.length(); i < l; ++i) {
            if (l - i < length) break;
            found = true;
            for (int j = 0; j < length; ++j) {
                if (needle.charAt(j) != haystack.charAt(j + i)) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
        return -1;
    }
}

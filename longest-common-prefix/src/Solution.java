class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) return null;
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        int idx = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 0, c = strs.length; i < c; ++i) max = Math.min(max, strs[i].length());

        boolean matched = true;
        while (matched && idx < max) {
            char first = 0;
            for (int i = 0, c = strs.length; i < c; ++i) {
                if (first == 0) first = strs[i].charAt(idx);
                else matched = matched && strs[i].charAt(idx) == first;
            }
            if (matched) ++idx;
        }

        return strs[0].substring(0, idx);
    }
}

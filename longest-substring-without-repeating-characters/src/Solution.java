class Solution {
    public int lengthOfLongestSubstring(String s) {
        return new PlanA().resolve(s);
    }

    public static class PlanA {
        private static final int CHAR_MAX = 1 << 9;

        boolean isUnique(String s, int l, int r) {
            if (l > r) {
                throw new IllegalArgumentException("l > r");
            }
            boolean[] set = new boolean[CHAR_MAX];
            while (l <= r) {
                char c = s.charAt(l++);
                if (set[c]) return false;
                else set[c] = true;
            }
            return true;
        }

        int resolve(String s) {
            int len = s.length();
            boolean[] set = new boolean[CHAR_MAX];
            for (int i = 0; i < len; ++i) {
                set[s.charAt(i)] = true;
            }
            int max = 0;
            for (int i = 0; i < CHAR_MAX; ++i) {
                if (set[i]) max += 1;
            }
            for (int d = max; d > 0; --d) {
                for (int i = 0; i + d - 1 < len; ++i) {
                    if (isUnique(s, i, i + d - 1)) {
                        return d;
                    }
                }
            }
            return s.length();
        }
    }
}
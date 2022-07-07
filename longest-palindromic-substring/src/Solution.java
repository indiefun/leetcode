class Solution {
    public String longestPalindrome(String s) {
        return new PlanA().resolve(s);
    }

    public static class PlanA {
        boolean isPalindrome(String s, int l, int r) {
            if (l > r) {
                throw new IllegalArgumentException("l > r");
            }
            while (l < r) {
                if (s.charAt(l++) != s.charAt(r--)) {
                    return false;
                }
            }
            return true;
        }

        String resolve(String s) {
            int len = s.length();
            for (int d = len; d > 0; --d) {
                for (int i = 0; i + d - 1 < len; ++i) {
                    if (isPalindrome(s, i, i + d - 1)) {
                        return s.substring(i, i + d);
                    }
                }
            }
            return s;
        }
    }
}

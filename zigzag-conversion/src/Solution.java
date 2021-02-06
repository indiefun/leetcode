class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows == 1) return s;

        int l = s.length();
        if (l < numRows) return s;

        char[] res = new char[l];
        int cur = 0;

        int rst = numRows - 1;
        for (int row = 0; row < numRows; ++row) {
            for (int i = 0; i < l; ++i) {
                int n = i / rst;
                int r = i % rst;
                if (n % 2 == 1) r = rst - r;
                if (r == row) {
                    res[cur++] = s.charAt(i);
                }
            }
        }

        return String.valueOf(res);
    }
}

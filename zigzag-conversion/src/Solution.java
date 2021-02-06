class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows == 1) return s;

        int l = s.length();
        if (l < numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int r = 0; r < numRows; ++r) {
            rows[r] = new StringBuilder();
        }

        int rst = numRows - 1;
        for (int i = 0; i < l; ++i) {
            int n = i / rst;
            int r = i % rst;
            if (n % 2 == 1) r = rst - r;
            rows[r].append(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();
        for (int r = 0; r < numRows; ++r) {
            res.append(rows[r]);
        }

        return res.toString();
    }
}

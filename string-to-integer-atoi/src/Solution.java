public class Solution {
    public int myAtoi(String s) {
        int LIMIT_MAX = Integer.MAX_VALUE / 10;
        int LIMIT_MIN = Integer.MIN_VALUE / 10;
        int result = 0;
        short symbol = 0;
        for (int i = 0, l = s.length(); i < l; i++) {
            char c = s.charAt(i);
            if (c == ' ' && result == 0 && symbol == 0) continue;
            if (c == '-' && result == 0 && symbol == 0) {
                symbol = -1;
                continue;
            }
            if (c == '+' && result == 0 && symbol == 0) {
                symbol = 1;
                continue;
            }
            if (c >= '0' && c <= '9') {
                if (symbol == 0) {
                    symbol = 1;
                }
                int n = c - '0';
                if (symbol > 0) {
                    if (result > LIMIT_MAX || (result == LIMIT_MAX && n > 7)) result = Integer.MAX_VALUE;
                    else result = result * 10 + n;
                } else {
                    if (result < LIMIT_MIN || (result == LIMIT_MIN && n > 8)) result = Integer.MIN_VALUE;
                    else result = result * 10 - n;
                }
            } else break;
        }
        return result;
    }
}

class Solution {
    public int reverse(int x) {
        int max_limit = Integer.MAX_VALUE / 10;
        int min_limit = Integer.MIN_VALUE / 10;
        short r;
        int y = 0;
        while (x != 0) {
            r = (short) (x % 10);
            x = x / 10;
            if ((r > 0 && ((y > max_limit) || (y == max_limit && r > 7))) ||
                    (r < 0 && ((y < min_limit) || (y == min_limit && r < -8)))) return 0;
            else y = y * 10 + r;
        }
        return y;
    }
}
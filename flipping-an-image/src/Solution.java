class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int r = 0, l = A.length; r < l; ++r) {
            int j = 0, k = A[r].length - 1;
            while (j <= k) {
                if (j != k) {
                    if (A[r][j] != A[r][k]) {
                        A[r][j] ^= A[r][k];
                        A[r][k] ^= A[r][j];
                        A[r][j] ^= A[r][k];
                    }
                    A[r][j] = 1 - A[r][j];
                }
                A[r][k] = 1 - A[r][k];
                ++j;
                --k;
            }
        }
        return A;
    }
}
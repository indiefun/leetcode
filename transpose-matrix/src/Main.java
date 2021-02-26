public class Main {

    public static void main(String[] args) {
        inspect(matrix(3, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9), matrix(3, 3, 1, 4, 7, 2, 5, 8, 3, 6, 9));
        inspect(matrix(2, 3, 1, 2, 3, 4, 5, 6), matrix(3, 2, 1, 4, 2, 5, 3, 6));
    }

    public static int[][] matrix(int row, int col, int... elements) {
        int[][] res = new int[row][col];
        for (int i = 0; i < row; ++i) {
            System.arraycopy(elements, i * col, res[i], 0, col);
        }
        return res;
    }

    public static boolean equals(int[][] left, int[][] right) {
        if (left.length != right.length) return false;
        for (int i = 0, c = left.length; i < c; ++i) {
            int[] leftRow = left[i];
            int[] rightRow = right[i];
            if (leftRow.length != rightRow.length) return false;
            for (int j = 0, l = leftRow.length; j < l; ++j) {
                if (leftRow[j] != rightRow[j]) return false;
            }
        }
        return true;
    }

    public static void inspect(int[][] input, int[][] expect) {
        int[][] output = new Solution().transpose(input);
        if (equals(output, expect)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

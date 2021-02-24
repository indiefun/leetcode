public class Main {

    public static void main(String[] args) {
        inspect(matrix(3, 3, 1, 1, 0, 1, 0, 1, 0, 0, 0), matrix(3, 3, 1, 0, 0, 0, 1, 0, 1, 1, 1));
        inspect(matrix(4, 4, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0), matrix(4, 4, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0));
    }

    public static int[][] matrix(int row, int col, int... elements) {
        int[][] res = new int[row][col];
        for (int i = 0; i < row; ++i) {
            res[i] = new int[col];
            System.arraycopy(elements, i * row, res[i], 0, col);
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
        int[][] output = new Solution().flipAndInvertImage(input);
        if (equals(output, expect)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

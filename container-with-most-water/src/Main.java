public class Main {
    public static void main(String[] args) {
        inspect(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49);
    }

    private static void inspect(int[] height, int expect) {
        int result = new Solution().maxArea(height);
        if (result == expect) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

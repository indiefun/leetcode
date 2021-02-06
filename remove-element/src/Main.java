public class Main {

    public static void main(String[] args) {
        inspect(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2});
        inspect(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 4, 0, 3});
        inspect(new int[]{1}, 1, new int[]{});
    }

    private static boolean equals(int[] numbers, int[] expects) {
        for (int i = expects.length; --i >= 0; ) {
            if (numbers[i] != expects[i]) return false;
        }
        return true;
    }

    private static void inspect(int[] numbers, int value, int[] expects) {
        int count = new Solution().removeElement(numbers, value);
        if (count != expects.length || !equals(numbers, expects)) System.err.println("WRONG");
        else System.out.println("RIGHT");
    }
}

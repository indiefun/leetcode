public class Main {

    public static void main(String[] args) {
        inspect(new int[]{1, 1, 2}, new int[]{1, 2});
        inspect(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4});
    }

    private static boolean equals(int[] numbers, int[] expects) {
        for (int i = expects.length; --i >= 0; ) {
            if (numbers[i] != expects[i]) return false;
        }
        return true;
    }

    private static void inspect(int[] numbers, int[] expects) {
        int count = new Solution().removeDuplicates(numbers);
        if (count != expects.length || !equals(numbers, expects)) System.err.println("WRONG");
        else System.out.println("RIGHT");
    }
}

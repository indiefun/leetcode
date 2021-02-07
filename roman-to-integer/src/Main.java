public class Main {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        inspect("III", 3);
        inspect("IV", 4);
        inspect("IX", 9);
        inspect("LVIII", 58);
        inspect("MCMXCIV", 1994);
        long end = System.currentTimeMillis();
        System.out.println("total: " + (end - begin) / 1000 + " ms");
    }

    private static void inspect(String input, int expect) {
        int output = new Solution().romanToInt(input);
        if (output == expect) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

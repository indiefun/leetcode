public class Main {

    public static void main(String[] args) {
        inspect(123, 321);
        inspect(-123, -321);
        inspect(120, 21);
        inspect(0, 0);
        inspect(1463847412, 2147483641);
        inspect(Integer.MAX_VALUE, 0);
        inspect(Integer.MIN_VALUE, 0);
    }

    private static void inspect(int input, int expect) {
        int output = new Solution().reverse(input);
        if (output == expect) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

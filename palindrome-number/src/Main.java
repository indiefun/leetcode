public class Main {

    public static void main(String[] args) {
        inspect(121, true);
        inspect(-121, false);
        inspect(10, false);
        inspect(-101, false);
    }

    private static void inspect(int input, boolean expect) {
        boolean output = new Solution().isPalindrome(input);
        if (output == expect) System.out.println("RIGHT: " + input);
        else System.err.println("WRONG: " + input);
    }
}

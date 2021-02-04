public class Main {

    public static void main(String[] args) {
        inspect("42", 42);
        inspect("   -42", -42);
        inspect("4193 with words", 4193);
        inspect("words and 987", 0);
        inspect("-91283472332", -2147483648);
        inspect("+-12", 0);
        inspect("2147483646", 2147483646);
    }

    private static void inspect(String input, int expect) {
        int output = new Solution().myAtoi(input);
        if (output == expect) {
            System.out.println("\"" + input + "\" is RIGHT, the output is " + expect);
        } else {
            System.err.println("\"" + input + "\" is WRONG, the expect is " + expect + ", but the output is " + output);
        }
    }
}

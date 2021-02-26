public class Main {

    public static void main(String[] args) {
        inspect("()", true);
        inspect("()[]{}", true);
        inspect("(]", false);
        inspect("([)]", false);
        inspect("{[]}", true);
    }

    public static void inspect(String input, boolean expect) {
        boolean output = new Solution().isValid(input);
        if (output == expect) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

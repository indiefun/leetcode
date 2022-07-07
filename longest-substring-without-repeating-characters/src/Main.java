public class Main {
    public static void main(String[] args) {
        inspect("abcabcbb", 3);
        inspect("bbbbb", 1);
        inspect("pwwkew", 3);
    }

    public static void inspect(String input, int expect) {
        int output = new Solution().lengthOfLongestSubstring(input);
        if (output == expect) System.out.println("RIGHT");
        else System.out.println("WRONG");
    }
}

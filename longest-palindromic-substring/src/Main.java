import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        inspect("babad", "bab", "aba");
        inspect("cbbd", "bb");
        inspect("cb", "c", "b");
        inspect("bb", "bb");
        inspect("a", "a");
    }

    public static void inspect(String input, String... results) {
        String palindrome = new Solution().longestPalindrome(input);
        if (Arrays.asList(results).contains(palindrome)) System.out.println("RIGHT");
        else System.out.println("WRONG");
    }
}

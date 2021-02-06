public class Main {

    public static void main(String[] args) {
        inspect("mississippi", "issip", 4);
        inspect("hello", "ll", 2);
        inspect("world", "rld", 2);
        inspect("world", "w", 0);
        inspect("aaaaa", "bba", -1);
        inspect("aaaaa", "", 0);
        inspect("aaaaa", null, 0);
    }

    private static void inspect(String haystack, String needle, int expect) {
        int output = new Solution().strStr(haystack, needle);
        if (output != expect) System.err.println("WRONG");
        else System.out.println("RIGHT");
    }
}

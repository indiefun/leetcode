public class Main {

    public static void main(String[] args) {
        inspect(new String[]{"flower", "flow", "flight"}, "fl");
        inspect(new String[]{"dog", "racecar", "car"}, "");
        inspect(new String[]{}, "");
        inspect(new String[]{"", ""}, "");
    }

    private static void inspect(String[] inputs, String expect) {
        String output = new Solution().longestCommonPrefix(inputs);
        if (expect.equals(output)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

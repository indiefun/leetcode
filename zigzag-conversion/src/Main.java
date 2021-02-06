public class Main {

    public static void main(String[] args) {
        inspect("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR");
        inspect("PAYPALISHIRING", 4, "PINALSIGYAHRPI");
        inspect("A", 1, "A");
    }

    private static void inspect(String input, int rows, String expect) {
        String output = new Solution().convert(input, rows);
        if (expect.equals(output)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

public class Main {

    public static void main(String[] args) {
        inspect(3, "III");
        inspect(4, "IV");
        inspect(9, "IX");
        inspect(58, "LVIII");
        inspect(1994, "MCMXCIV");
    }

    private static void inspect(int number, String expect) {
        String output = new Solution().intToRoman(number);
        if (output.equals(expect)) System.out.println("RIGHT");
        else System.err.println("WRONG");
    }
}

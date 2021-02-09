class Solution {
    static class Pair {
        int number;
        String string;

        Pair(int number, String string) {
            this.number = number;
            this.string = string;
        }
    }

    private static final Pair[] PAIRS = new Pair[]{
            new Pair(1, "I"),
            new Pair(4, "IV"),
            new Pair(5, "V"),
            new Pair(9, "IX"),
            new Pair(10, "X"),
            new Pair(40, "XL"),
            new Pair(50, "L"),
            new Pair(90, "XC"),
            new Pair(100, "C"),
            new Pair(400, "CD"),
            new Pair(500, "D"),
            new Pair(900, "CM"),
            new Pair(1000, "M"),
    };

    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        for (int i = PAIRS.length; --i >= 0 && num > 0; ) {
            Pair pair = PAIRS[i];
            for (int j = num / pair.number; --j >= 0; ) {
                builder.append(pair.string);
            }
            num %= pair.number;
        }
        return builder.toString();
    }
}

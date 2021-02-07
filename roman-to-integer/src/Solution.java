import java.util.HashMap;
import java.util.Map;

class Solution {

    private static final Map<Character, Integer> N_MAP = new HashMap<>(7);
    private static final Map<String, Integer> S_MAP = new HashMap<>(6);

    public Solution() {
        if (N_MAP.isEmpty()) {
            N_MAP.put('I', 1);
            N_MAP.put('V', 5);
            N_MAP.put('X', 10);
            N_MAP.put('L', 50);
            N_MAP.put('C', 100);
            N_MAP.put('D', 500);
            N_MAP.put('M', 1000);
        }
        if (S_MAP.isEmpty()) {
            S_MAP.put("IV", 4);
            S_MAP.put("IX", 9);
            S_MAP.put("XL", 40);
            S_MAP.put("XC", 90);
            S_MAP.put("CD", 400);
            S_MAP.put("CM", 900);
        }
    }

    public int romanToInt(String s) {
        int n = 0, i = 0, l = s.length();
        String k;
        while (i < l) {
            if (i + 1 < l) {
                k = s.substring(i, i + 2);
                if (S_MAP.containsKey(k)) {
                    n += S_MAP.get(k);
                    ++i;
                    ++i;
                } else {
                    n += N_MAP.get(s.charAt(i));
                    ++i;
                }
            } else {
                n += N_MAP.get(s.charAt(i));
                ++i;
            }
        }
        return n;
    }
}

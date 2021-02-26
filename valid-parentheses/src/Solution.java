import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0, l = s.length(); i < l; ++i) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.empty()) return false;
                char e = stack.pop();
                if ((e == '(' && c != ')') || (e == '[' && c != ']') || (e == '{' && c != '}')) return false;
            }
        }
        return stack.empty();
    }
}
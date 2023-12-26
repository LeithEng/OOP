import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char open = st.pop();
                if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']'&& open != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
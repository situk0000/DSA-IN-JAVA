class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch); // outer nahi hai
                }
                depth++;
            } 
            else { // ')'
                depth--;
                if (depth > 0) {
                    result.append(ch); // outer nahi hai
                }
            }
        }

        return result.toString();
    }
}
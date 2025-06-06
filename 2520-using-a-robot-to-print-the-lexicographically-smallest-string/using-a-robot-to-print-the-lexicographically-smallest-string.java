

class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] minCharFromIndex = new char[n];
        
        // Step 1: Build minCharFromIndex
        minCharFromIndex[n - 1] = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            minCharFromIndex[i] = (char) Math.min(s.charAt(i), minCharFromIndex[i + 1]);
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Step 2: Traverse the string
        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i));

            // Step 3: Pop from stack while the top is <= smallest future char
            while (!stack.isEmpty() && (i == n - 1 || stack.peek() <= minCharFromIndex[i + 1])) {
                result.append(stack.pop());
            }
        }

        // Step 4: Pop remaining chars from stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}

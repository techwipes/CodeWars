import java.util.Stack;

public class BraceChecker {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (!stack.isEmpty()) {
                if (currentChar == ')' && stack.peek() == '('
                        || (currentChar == '}' && stack.peek() == '{')
                        || (currentChar == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
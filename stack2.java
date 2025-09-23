// valid parenthesis
import java.util.*;
public class stack2 {

    public static boolean valid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } 
            // If closing bracket, check for match
            else {
                if (s.isEmpty()) {
                    return false; // No opening bracket to match
                }
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {
                    s.pop(); // Match found, pop
                } else {
                    return false; // Mismatch
                }
            }
        }

        // Stack should be empty if all brackets matched
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[]";  // true case
        System.out.println(valid(str));
    }
}

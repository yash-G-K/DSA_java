// // valid parenthesis
// import java.util.*;
// public class stack2 {

//     public static boolean valid(String str) {
//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             // If opening bracket, push to stack
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 s.push(ch);
//             } 
//             // If closing bracket, check for match
//             else {
//                 if (s.isEmpty()) {
//                     return false; // No opening bracket to match
//                 }
//                 if ((s.peek() == '(' && ch == ')') ||
//                     (s.peek() == '{' && ch == '}') ||
//                     (s.peek() == '[' && ch == ']')) {
//                     s.pop(); // Match found, pop
//                 } else {
//                     return false; // Mismatch
//                 }
//             }
//         }

//         // Stack should be empty if all brackets matched
//         return s.isEmpty();
//     }

//     public static void main(String[] args) {
//         String str = "({})[]";  // true case
//         System.out.println(valid(str));
//     }
// }


//      duplicate parenthesis
import java.util.*;

public class stack2 {
    public static boolean isduplicate(String str) {
        Stack<Character> s = new Stack<>(); // Initialize a stack to store characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the current character is a closing parenthesis
            if (ch == ')') {
                int count = 0; // Initialize a counter for elements between parentheses
                // Pop elements from the stack until an opening parenthesis is found
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                // If no elements were found between the opening and closing parentheses,
                // it indicates redundant parentheses.
                if (count < 1) {
                    return true; // Redundant parentheses found
                } else {
                    s.pop(); // Pop the opening parenthesis
                }
            } else {
                // If the character is not a closing parenthesis, push it onto the stack
                s.push(ch);
            }
        }
        return false; // No redundant parentheses found
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // Example 1: true (redundant parentheses around 'a+b')
        String str2 = "(a-b)"; // Example 2: false (no redundant parentheses)
        System.out.println(isduplicate(str));
        System.out.println(isduplicate(str2));
    }
}
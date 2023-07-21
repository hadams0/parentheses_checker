import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String testString) {
        //create a stack to store brackets
        //remove all chars, except brackets, from string by pushing to stack
        //push brackets to stack
        //create two variables to store open and closed brackets
        //check if no open brackets == no closed brackets
        //if yes return true, else return false

        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < testString.length(); i++) {
            char symbol = testString.charAt(i);
            if (symbol == '(') {
                bracketStack.push(symbol);
            } else if (symbol == ')') {
                if (bracketStack.empty()) {
                    return false;
                } else {
                    bracketStack.pop();}
                }
            }
            if (bracketStack.empty()) {
                return true;
            } else {
                return false;
            }
        }
    }

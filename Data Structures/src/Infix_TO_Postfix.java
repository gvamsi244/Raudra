/**
 * @author Vamsi Krishna Govada on 6/5/2020.
 * @project Raudra
 */

import java.util.Stack;

public class Infix_TO_Postfix {
    static int precedence(char ch) {

        if ((ch == '+') || (ch == '-'))
            return 1;
        else if ((ch == '*') || (ch == '/'))
            return 2;
        else if (ch == '^')
            return 3;
        else
            return 0;
    }

    public static String convert(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char c;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);
            if (Character.isLetterOrDigit(c))
                sb.append(c);
            else if (stack.isEmpty() || c == '(')
                stack.push(c);
            else {
                if (c == ')') {
                    while (stack.peek() != '(') {
                        sb.append(stack.peek());
                        stack.pop();
                    }
                    stack.pop();
                }
                else {
                    if (precedence(c) > precedence(stack.peek()))
                        stack.push(c);
                    else {
                        while (!stack.isEmpty()) {
                            if (precedence(c) > precedence(stack.peek())) {
                                stack.push(c);
                                break;
                            } else {
                                sb.append(stack.peek());
                                stack.pop();
                            }
                        }
                        if(stack.isEmpty())
                            stack.push(c);
                    }
                }
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "k+l-m*n+(o^p)*w/u/v*t+q";
        input = input.replaceAll(" ","");
        System.out.println(convert(input));
    }
}

/**
 * @author Vamsi Krishna Govada on 6/5/2020.
 * @project Raudra
 */

import java.util.Stack;


public class Postfix_Evaluation {

    public static int convert(String str) {
        int output=0;
        Stack<Character> stack = new Stack<>();
        char c;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);
            if (Character.isLetterOrDigit(c)){
                stack.push(c);
            }

            else {
                int t2 = (int) stack.peek()-48; stack.pop();
                int t1 = (int) stack.peek()-48; stack.pop();
                int t3 = 0;
                if(c == '+')
                    t3=t1+t2;
                else if (c=='-')
                    t3=t1-t2;
                else if (c=='/')
                    t3=t1/t2;
                else if (c=='*')
                    t3=t1*t2;
                else
                    t3=t1^t2;
                char temp = (char) (t3+48);
                stack.push(temp);
            }
        }
        output=stack.peek()-48;
        stack.pop();
        return output;
    }

    public static void main(String[] args) {
        String input = "2 3 1 * + 9 -";
        input = input.replaceAll(" ","");
        System.out.println(convert(input));
    }
}

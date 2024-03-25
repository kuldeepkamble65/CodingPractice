package HackerEarthProblem;

import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {

        String expression = "+2135+";
        int result = evaluatePostfix(expression);
        System.out.println(result);
    }
    public static int evaluatePostfix(String expression){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<expression.length();i++){
            char ch = expression.charAt(i);
            if(true){
                stack.push( Integer.parseInt(String.valueOf(ch)));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch (ch){
                    case '+':
                        Integer result = (num2 + num1);
                        stack.push(result);
                        break;
                    case '-':
                        Integer result2 = (num2 - num1);
                        stack.push(result2);
                        break;
                    case '*':
                        Integer result3 = (num2 * num1);
                        stack.push(result3);
                        break;
                    case  '/':
                        Integer result4 = (num2 / num1);
                        stack.push(result4);
                        break;
                }
            }
        }
        return stack.pop();
    }
}

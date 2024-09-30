package HackerEarthProblem;

import java.util.Stack;

public class ParenthesesCheck {

    public static void main(String[] args) {

        String str = "[(){()}]";
        if(isvalid(str)==true){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        if(isOpening(ch)){
            s.push(ch);
        } else if (s.isEmpty()) {
            return  false;
        } else if (!isMaching(s.peek(), ch)) {
            return false;
        }else {
            s.pop();
        }
        }
        return s.isEmpty();

    }

    public static boolean isOpening(char c){
        return (c=='(' || c=='[' || c=='{');
    }

    public static boolean isMaching(char a, char b){
        return (a=='(' && b ==')'|| a=='[' && b ==']' || a=='{' && b=='}');
    }

}

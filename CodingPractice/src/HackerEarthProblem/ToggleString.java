package HackerEarthProblem;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String string = sb.toString();
        System.out.println(string);
    }
}

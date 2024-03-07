import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reg5 {
    public static void main(String args[]){
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher("kuldeep");
        while(matcher.find()){
//            if()
        }
        System.out.println(matcher);
    }
}

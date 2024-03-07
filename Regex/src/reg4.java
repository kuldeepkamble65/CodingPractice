import java.util.regex.Pattern;

public class reg4 {
    public static void main(String args[]){

        System.out.println(Pattern.matches("[b-z]?","a"));

        System.out.println(Pattern.matches("[b-z A-Z]+","SDsdgfsf"));

        System.out.println(Pattern.matches("[^a-d]?","l"));
    }
}

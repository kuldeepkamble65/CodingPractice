import java.util.regex.Pattern;

public class reg3 {
    public static void main(String args[]){
        System.out.println(Pattern.matches("[a-z]", "g"));

        System.out.println(Pattern.matches("[a-z A-Z]+", "AdhM"));

    }
}

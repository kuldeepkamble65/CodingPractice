import java.util.regex.Matcher;
import java.util.regex.Pattern;

// pattern searching
public class reg2 {
    public static void main(String args[]){
        Pattern pattern = Pattern.compile("geeks");

        Matcher matcher = pattern.matcher("geeksforgeeks.org");

        while (matcher.find()){
            System.out.println("pattern matching from " + matcher.start() +"to" + (matcher.end()-1));
        }

    }
}

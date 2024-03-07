import java.util.regex.Pattern;
// pattern class
public class Reg1 {
    public static void main(String args[]){

        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
       
       System.out.println(Pattern.matches("geks","ge*ks"));
    }
}

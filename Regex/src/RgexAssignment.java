import java.util.Scanner;

public class RgexAssignment {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = input.replaceAll("([aeiouAEIOU])", "-$1-");
        System.out.println("Modified string: " + result);

        scanner.close();
    }
}

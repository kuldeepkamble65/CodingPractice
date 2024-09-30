import java.util.Scanner;

public class SwichCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a and b");
        int  a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the no for opertion");
        int operation = sc.nextInt();
        switch (operation){
            case 1 :
                System.out.println("Addition is : "+a+b);
                break;
            case 2 :
                System.out.println("Substraction is : "+(a-b));
                break;
            case 3 :
                System.out.println("Multiplication is : "+a*b);
                break;
            case 4 :
                System.out.println("division is : "+a/b);
                break;
            case 5 :
                System.out.println("Modulous is : "+(a%b));
                break;
            default:
                System.out.println("Invalid no");
        }
    }
}

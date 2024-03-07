import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
        System.out.println("Enter the Limit :-");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
            int count =0;
        for (int i = 0; i < t; i++) {

            System.out.println("Enter the Number :-" );
                long n = scanner.nextLong();

                System.out.println(n + " can be fitted in:");

                if (n >= -127 && n <= 127); {
                    System.out.println("* n can be fitted in: byte");
                    count++;
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* n can be fitted in: short");
                    count++;
                }
                if (n >= -2147483648 && n <=  2147483647); {
                    System.out.println("* n can be fitted in: int");
                    count++;
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE); {
                    System.out.println("* n can be fitted in: long");
                     count++;
                }


            for (int j = 0; count <= 4; i++) {
                if (count == 1) ;
                System.out.print("byte < ");
                if (count == 2) ;
                System.out.print("short < ");
                if (count == 3) ;
                System.out.print("int < ");
                if (count == 4) ;
                System.out.println("long");
                break;
            }


            }
            System.out.println("can not be fitted anywhere");
        }

    }



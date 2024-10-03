package JavaPractice;

import java.util.Scanner;

public class FFunction {

   public static void printName(String name){
       System.out.println(name);
   }
   public static int addNo(int a, int b){
       int sum = a + b;
       return sum;
   }
   public static int multiplicationNO (int a , int b){
       return a*b;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b= sc.nextInt();

       // int sum = addNo(a,b);
       // System.out.println("sum of two no : "+sum );
       // printName(name);

        System.out.println("Multiplication of two no : "+multiplicationNO(a,b));
    }
}

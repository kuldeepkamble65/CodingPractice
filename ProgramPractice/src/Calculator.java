import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final int MonthOfTheYear = 12;
        final int percentage = 100;

        int pricipal = 0;
        double monthlyInterestRate = 0;
        int noOfPayments = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Principal : ");
            pricipal = sc.nextInt();
            if (pricipal >= 1000 && pricipal <= 10000000)
                break;
                System.out.println("please enter the value between 10000 to 100000000");
        }
        while(true) {
            System.out.print("Annual Interest Rate : ");
            double annualInterestRate = sc.nextDouble();
            if(annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / percentage / MonthOfTheYear;
                break;
            }
            System.out.println("Please Enter the value between 1 and 30");
        }
        while(true) {
            System.out.println("Peroid(years) : ");
            int year = sc.nextInt();
            if(year >=1 && year <=30) {
                noOfPayments = year * MonthOfTheYear;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }
        double mortage = pricipal * (monthlyInterestRate * Math.pow(1+ monthlyInterestRate, noOfPayments)/(Math.pow(1+monthlyInterestRate,noOfPayments)));

        String mortageFormated = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage : "+mortageFormated);
    }
}
